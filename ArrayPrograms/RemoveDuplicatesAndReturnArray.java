package ArrayPrograms;

/*
 * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
 */

import java.util.Arrays;

public class RemoveDuplicatesAndReturnArray {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,2,1,3,4,5,6};
        RemoveDuplicatesAndReturnArray obj = new RemoveDuplicatesAndReturnArray();
        int[] result = obj.removeDuplicates(myArray);
        System.out.println(Arrays.toString(result));
    }
    public int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;
 
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }
 
        return Arrays.copyOf(uniqueArray, index);
    }
}
