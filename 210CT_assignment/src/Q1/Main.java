/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author chan_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num = {5,10,20,50,100,500,1000,5000};
        CalculationMethod cm = new CalculationMethod();
        System.out.println(cm);
        for(int i = 0; i<8; i++){
            if(i<7){
            System.out.print(cm.calculationMethod1(num[i]));
            System.out.println("\t\t" + cm.calculationMethod2(num[i]));
            }
            else{
            System.out.print(cm.calculationMethod1(num[i]));
            System.out.println("\t" + cm.calculationMethod2(num[i]));
            }
        }
    }
    
}
