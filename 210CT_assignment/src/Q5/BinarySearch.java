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
public class BinarySearch {
    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        int count = 0;
        while (first <= last) {
            if (arr[mid] < key) {
                count++;
                first = mid + 1;
            } else if (arr[mid] == key) {
                count++;
                System.out.println("The number of comparison is " + count + " by using binary search algorithm.");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Number is not found!");
        }
    }
}
