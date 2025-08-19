package TimeComplexityBasicPrograms;

/*
 * Create a function which calculates the sum and product of elements of array
 * Find the time complexity for created method
 */

//Time Complexity O(n)

public class SumAndProductOfArray {
    public static void main(String[] args) {

        int[] array = {1,3,4,5};
        SumAndProductOfArray obj = new SumAndProductOfArray();
        obj.sumAndProductOfArray(array);
    }

    void sumAndProductOfArray(int[] array) {
        int sum = 0; //Time Complexity O(1)
        int product = 1; //Time Complexity O(1)
        for (int i = 0; i < array.length; i++) { //Time Complexity O(n)
            sum += array[i]; //Time Complexity O(1)
        }
        for (int i = 0; i < array.length; i++) { //Time Complexity O(n)
            product *= array[i]; //Time Complexity O(1)
        }

        System.out.println("Sum : " + sum + " Product : " + product); //Time Complexity O(1)
    }
}
