import java.util.Arrays;

public class TwoDimensionArrayCreation {

    // Time Complexity O(1) or O(mn)
    // Space Complexity O(mn)
    public static void main(String[] args) {
        // Step 1 - Declare
        int[][] int2DArray; // Time Complexity O(1)

        // Step 2 - Instantiate
        int2DArray = new int[2][2]; // Time Complexity O(1)

        // Step 3 - Initialize
        // Time Complexity O(mn) -> m - No of Rows, n - No of Columns
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        // All together --> Declare, instantiate, initialize
        String s2DArray[][] = { { "a", "b" }, { "c", "d" } }; // Time Complexity O(1)
        System.out.println(Arrays.deepToString(s2DArray));

    }

}
