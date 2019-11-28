/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

/**
 *
 * @author wai
 */
public class SimBusStop {
    public static void main(String[] args) {
//    ListQueue t = new ListQueue();
	ArrayQueue t = new ArrayQueue(50);
        int code, time, count;
        Integer item;
        int people = 0;
        int wait = 0;
        int busCount = 0;
        int busCap = 0;
        int vacantSeats = 0;
        int currentPeople = 0;

        do {
                code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
        } while (code < -1 || code > 1);
        int lastTime = 0;
        while (code!=-1) {
            do {
                    time = SimpleInput.getInteger("Arrival time (>="+Integer.toString(lastTime)+"): ");
            } while (lastTime > time);
            lastTime = time;
            do {
                    count = SimpleInput.getInteger("Arrival count (> 0): ");
            } while (count <= 0);
            if (code==0) {
                    people += count;
                    currentPeople += count;
                    while (count-- > 0)
                            t.enqueue (new Integer(time));
            }
            else if (code==1) {
                    busCount += 1;
                    busCap += count;
                    if(currentPeople < count){
                        vacantSeats += (count - currentPeople);
                        currentPeople = 0;
                    }else{
                        currentPeople -= count;
                    }
                    while ( (count-- > 0) && !t.empty ()){
                            item = (Integer) t.dequeue ();
                            wait += time - item.intValue();
                    }
            }
            do {
                    code = SimpleInput.getInteger("Code (0 for people, 1 for bus, -1 to exit): ");
            } while (code < -1 || code > 1);
        }

        if (people!=0){
            System.out.println (people + " people waited for " +
                                        wait + " minutes, average waiting time = " +
                                        (float) wait/people + " minutes.");
            System.out.println("Total " + busCount + " passed the bus stop.");
            System.out.println("Average " + (float)busCap/people + " people can got on a bus.");
            System.out.println("Average " + (float)vacantSeats/busCount + " vacant seats for a bus leaving the bus stop.");
            if(currentPeople == 0){
                System.out.println (currentPeople + " people still waiting at the bus stop, average waiting time = 0 minutes.");
            }else{
                System.out.println (currentPeople + " people still waiting at the bus stop, average waiting time = " + (float) wait/currentPeople + " minutes.");
            }
        }
    }
}
