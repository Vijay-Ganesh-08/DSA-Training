package TimeComplexityBasicPrograms;

import java.util.Arrays;

/*
 * Create a method which takes an array as a parameter and reverse it.
 * Find the runtime of the created method.
 */

//Time complexity O(n)
public class ReversalOfArray {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        ReversalOfArray obj = new ReversalOfArray();
        obj.arrayReversal(array);
    }

    void arrayReversal(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { // Time Complexity O(n/2) --> O(n)
            int other = array.length - i - 1; // Time Complexity O(1)
            int temp = array[i]; // Time Complexity O(1)
            array[i] = array[other]; // Time Complexity O(1)
            array[other] = temp; // Time Complexity O(1)
        }
        System.out.println(Arrays.toString(array)); // Time Complexity O(n)
    }

}
