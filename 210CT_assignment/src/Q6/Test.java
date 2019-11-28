/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q6;

/**
 *
 * @author ChanWai
 */
public class Test {
    public static void main(String [] args){
        int count = 10;
        Fibonacci fi= new Fibonacci();
        BinarySearchTree bst = new BinarySearchTree();
        System.out.print("0");
        fi.printFibonacci(count -1);
        
        System.out.println();
        
        System.out.print("Inserting:");
        int [] sequence  = {87,22,34,10,5,23,6,1,3};
        for (int i=0; i < sequence .length; i++){
            System.out.print(sequence [i] + " ");
            bst.insert(sequence [i]);
        }
         System.out.println();
         System.out.println("In ascending order:");
         bst.inorder();
    }
}
