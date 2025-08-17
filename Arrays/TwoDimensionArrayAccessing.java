import java.util.Arrays;

//Time Complexity O(1)
//Space Complexity O(1)
public class TwoDimensionArrayAccessing {
    int arr[][] = null;

    // Constructor
    public TwoDimensionArrayAccessing(int numberOfRows, int numberOfColumns) {
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

    // Accessing Value in Array
    public void accessArrayCell(int row, int col) {
        System.out.println("Accessing Row# " + row + "Column# " + col); // Time Complexity O(1)
        try {
            System.out.println("Cell value is " + arr[row][col]); // Time Complexity O(1)
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index for 2D Array"); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        TwoDimensionArrayAccessing obj2DArray = new TwoDimensionArrayAccessing(3, 3);
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

        obj2DArray.accessArrayCell(2, 1);

    }
}
