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
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(99);
        byte barray[] = new byte[99];
        int n;
        do {
                n = SimpleInput.getInteger("How many to enqueue? ");
                for (int i = 0; i < n; i++) {
                        q.enqueue(new Integer(GenLib.genInt(1, 100)));
                        System.out.println(q);
                }
                n = SimpleInput.getInteger("How many to dequeue? ");
                for (int i = 0; i < n; i++) {
                        if (q.empty()) {
                                System.out.println("Queue is now empty, dequeue ignored.");
                                break;
                        } else {
                                System.out.println("dequeued:"+q.dequeue());
                                System.out.println(q);
                        }
                }
        } while (SimpleInput.getChar("more (y/n)? ") == 'y');

        System.out.println("Bye now.");
        System.exit(0);
    }
}
