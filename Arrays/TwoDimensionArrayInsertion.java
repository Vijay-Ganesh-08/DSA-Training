import java.util.Arrays;

//Time Complexity O(1)
//Space Complexity O(1)
public class TwoDimensionArrayInsertion {

    int arr[][] = null;

    // Constructor
    public TwoDimensionArrayInsertion(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Insert Value to Array
    public void insertValueInArray(int row, int column, int value) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) { // Time Complexity O(1)
                arr[row][column] = value; // Time Complexity O(1)
                System.out.println("Successfully Inserted"); // Time Complexity O(1)
            } else {
                System.out.println("This cell is already occupied"); // Time Complexity O(1)
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index for 2D Array"); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        TwoDimensionArrayInsertion obj2DArray = new TwoDimensionArrayInsertion(3, 3);
        obj2DArray.insertValueInArray(0, 0, 10);
        obj2DArray.insertValueInArray(0, 0, 20);
        System.out.println(Arrays.deepToString(obj2DArray.arr));
    }
}
