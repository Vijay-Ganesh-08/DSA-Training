import java.util.Arrays;

// Time Complexity O(mn)
// Space Complexity O(1)
public class TwoDimensionArrayTraversal {
    int arr[][] = null;

    // Constructor
    public TwoDimensionArrayTraversal(int numberOfRows, int numberOfColumns) {
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

    // Traversal Values in Array
    public void traverseArrayCell() {

        for (int row = 0; row < arr.length; row++) {  // Time Complexity O(m)
            for (int col = 0; col < arr[0].length; col++) { // Time Complexity O(n)
                System.out.print(arr[row][col] + " "); // Time Complexity O(1)
            }
            System.out.println(); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        TwoDimensionArrayTraversal obj2DArray = new TwoDimensionArrayTraversal(3, 3);
        obj2DArray.insertValueInArray(0, 0, 10);
        obj2DArray.insertValueInArray(0, 1, 20);
        obj2DArray.insertValueInArray(0, 2, 30);
        obj2DArray.insertValueInArray(1, 0, 40);
        obj2DArray.insertValueInArray(1, 1, 50);
        obj2DArray.insertValueInArray(1, 2, 60);
        obj2DArray.insertValueInArray(2, 0, 70);
        obj2DArray.insertValueInArray(2, 1, 80);
        obj2DArray.insertValueInArray(2, 2, 90);

        System.out.println(Arrays.deepToString(obj2DArray.arr));

        System.out.println("Array Traversal");
        obj2DArray.traverseArrayCell();

    }
}
