/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q5;
/**
 *
 * @author ChanWai
 */
public class TestBinarySearch {
    public static void main(String [] args){
        int data =0;
        BinarySearch bs = new BinarySearch();
        int [] a = {11, 12, 34, 55, 66, 77, 88};
        int key = 77;
        int last = a.length -1;
        bs.binarySearch(a, 0, last, key);
        System.out.println();
        
        BinarySearchTree bst = new BinarySearchTree();
        System.out.print("Inserting:");
        int [] sequence  = {2,7,9,4,1,5,3,6,0,8};
        for (int i=0; i < sequence .length; i++){
            System.out.print(sequence [i] + " ");
            bst.insert(sequence [i]);
        }
         System.out.println();
         System.out.println("In ascending order:");
         bst.inorder();
    } 
}
