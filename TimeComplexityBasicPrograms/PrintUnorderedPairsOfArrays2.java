package TimeComplexityBasicPrograms;

//Time Complexity O(mn)
public class PrintUnorderedPairsOfArrays2 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 2, 3, 4, 5 };
        PrintUnorderedPairsOfArrays2 obj = new PrintUnorderedPairsOfArrays2();
        obj.printUnorderedPairs(array1, array2);
    }

    void printUnorderedPairs(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) { // Time Complexity O(m)
            for (int j = 0; j < array2.length; j++) { // Time Complexity O(n)
                for (int k = 0; k < 1000000; k++) { // Time Complexity O(1)
                    System.out.print(array1[i] + "," + array2[j] + " "); // Time Complexity O(1)
                }
            }
            System.out.println(); // Time Complexity O(1)
        }
    }
}
