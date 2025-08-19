package TimeComplexityBasicPrograms;

/*
 * Create a function which prints to the console the pairs from given array
 * Find the time complexity for created method
 * Example Input : [1,2,3,4]
 * Output : [11,12,13,14],[21,22,23,24],[31,32,33,34],[41,42,43,44]
 */

//Time Complexity O(n^2)
public class PrintPairsOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        PrintPairsOfArray obj = new PrintPairsOfArray();
        obj.printPairs(array);
    }

    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) { //Time Complexity O(n)
            for (int j = 0; j < array.length; j++) { //Time Complexity O(n)
                System.out.print(array[i] + "," + array[j] + " "); //Time Complexity O(1)
            }
            System.out.println(); //Time Complexity O(1)
        }
    }
}
