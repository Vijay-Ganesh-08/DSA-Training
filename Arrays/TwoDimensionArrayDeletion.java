import java.util.Arrays;

public class TwoDimensionArrayDeletion {
    int arr[][] = null;

    // Constructor
    public TwoDimensionArrayDeletion(int numberOfRows, int numberOfColumns) {
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

    // Deleting Values in Array
    public void deleteValueInArray(int value) {

        for (int row = 0; row < arr.length; row++) { // Time Complexity O(m)
            for (int col = 0; col < arr[0].length; col++) { // Time Complexity O(n)
                if (arr[row][col] == value) {
                    System.out.println("Successfully Deleted " + arr[row][col]); // Time Complexity O(1)
                    arr[row][col] = Integer.MIN_VALUE; // Time Complexity O(1)

                }
            }
        }
    }

    public void deleteIndexValueInArray(int row, int col) {
        try {
            System.out.println("Successfully Deleted " + arr[row][col]); // Time Complexity O(1)
            arr[row][col] = Integer.MIN_VALUE; // Time Complexity O(1)
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index"); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        TwoDimensionArrayDeletion obj2DArray = new TwoDimensionArrayDeletion(3, 3);
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

        System.out.println("Array Deletion");
        System.out.println("Array Deletion with Value");
        obj2DArray.deleteValueInArray(80);

        System.out.println(Arrays.deepToString(obj2DArray.arr));
        System.out.println("Array Deletion with Row and Column Index");
        obj2DArray.deleteIndexValueInArray(1, 2);
        System.out.println(Arrays.deepToString(obj2DArray.arr));

    }
}
