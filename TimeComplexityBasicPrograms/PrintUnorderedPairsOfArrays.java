package TimeComplexityBasicPrograms;

//Time Complexity O(mn)
public class PrintUnorderedPairsOfArrays {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 2, 3, 4, 5 };
        PrintUnorderedPairsOfArrays obj = new PrintUnorderedPairsOfArrays();
        obj.printUnorderedPairs(array1, array2);
    }

    void printUnorderedPairs(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) { // Time Complexity O(m)
            for (int j = i + 1; j < array2.length; j++) { // Time Complexity O(n)
                if (array1[i] < array2[j]) { // Time Complexity O(1)
                    System.out.print(array1[i] + "," + array2[j] + " "); // Time Complexity O(1)
                }
            }
            System.out.println(); // Time Complexity O(1)
        }
    }
}
