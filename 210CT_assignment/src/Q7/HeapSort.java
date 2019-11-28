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
public class HeapSort {
    static int count = 0;
    public void heapSort(int seq[]){
        int length = seq.length;
        
        for (int i=length/2-1; i>= 0; i--){
            count++;
            heapify(seq, length, i);
        }
        
        for (int i=length-1; i>=0; i--){
            count++;
            int temp = seq[0];
            seq[0] = seq[i];
            seq[i] = temp;
            heapify(seq,i,0);
        }
    }
    
    public void heapify(int seq[], int n, int i){
        int largest = i;
        int l = 2*i +1;
        int r = 2*i +2;
        
        if(l<n && seq[l] > seq[largest]){
            count++;
            largest = l;
        }
        if(r < n && seq[r] > seq[largest]){
            count++;
            largest = r; 
        }
        if(largest != i){
            count++;
            int swap = seq[i];
            seq[i] = seq[largest];
            seq[largest] = swap;
            heapify(seq, n, largest);
        }
    }
    
    public void printArray(int seq[]){
        for (int i=0; i<seq.length; ++i){
            System.out.print(seq[i]+" "); 
        }
        System.out.println(); 
        System.out.println("The total number of comparisons from Heap sort is: " + count);
    }
}
