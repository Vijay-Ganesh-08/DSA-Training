package TimeComplexityBasicPrograms;

//Time Complexity O(n^2)
public class PrintUnorderedPairsOfArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        PrintUnorderedPairsOfArray obj = new PrintUnorderedPairsOfArray();
        obj.printUnorderedPairs(array);
    }

    void printUnorderedPairs(int[] array) {
        for (int i = 0; i < array.length; i++) { //Time Complexity O(n)
            for (int j = i+1; j < array.length; j++) { //Time Complexity O(n)
                System.out.print(array[i] + "," + array[j] + " "); //Time Complexity O(1)
            }
            System.out.println(); //Time Complexity O(1)
        }
    }
}
