/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q7;

/**
 *
 * @author ChanWai
 */
public class BubbleSort {
    public static void bubbleSort(int[] seq){
        int length = seq.length;
        int temp = 0;
        for(int i=0; i<length; i++){
            for(int j=1; j<(length-i); j++){
                if(seq[j-1] > seq[j]){
                    temp = seq[j-1];
                    seq[j-1] = seq[j];
                    seq[j] = temp;
                }
            }    
        }
    }
    
    public void printArray(int[] seq){
        for(int i = 0; i<seq.length; i++){
            System.out.print(seq[i] + " ");
        }
        System.out.println();
    }
}
