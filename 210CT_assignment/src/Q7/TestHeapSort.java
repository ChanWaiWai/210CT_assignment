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
public class TestHeapSort {
    public static void main(String [] args){
        int seq[] = {98,38,93,33,21,6,63,81,32}; 
        System.out.println("Array before sorting");
        for(int i = 0; i< seq.length; i++){
            System.out.print(seq[i] + " ");
        }
        System.out.println();
        
        HeapSort hs = new HeapSort(); 
        hs.heapSort(seq); 
        System.out.println();
        System.out.println("Array after Heap Sort"); 
        hs.printArray(seq); 
        System.out.println();
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(seq);
        System.out.println("Array after Bubble Sort"); 
        bs.printArray(seq);
    }
}
