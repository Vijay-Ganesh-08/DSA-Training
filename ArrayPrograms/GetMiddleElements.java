package ArrayPrograms;

/*
 * Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.  
 * myArray = [1, 2, 3, 4, 5, 6]
 * middle(myArray)  # [2,3,4,5].
 */

import java.util.Arrays;

public class GetMiddleElements {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        GetMiddleElements obj = new GetMiddleElements();
        int[] result = obj.middle(intArray);
        System.out.println(Arrays.toString(result));
    }

    public int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }

        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }
}
