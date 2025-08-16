import java.util.Arrays;

public class SingleDimensionArrayDeletion {
    int arr[] = null;

    public SingleDimensionArrayDeletion(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Time Complexity O(1)
    // Space Complexity O(1)
    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) { // Time Complexity O(1)
                arr[location] = value; // Time Complexity O(1)
                System.out.println("Successfully Inserted !!!"); // Time Complexity O(1)
            } else {
                System.out.println("This cell is already occupied !!!"); // Time Complexity O(1)
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index to access array"); // Time Complexity O(1)
        }
    }

    public void DeleteValueFromArray(int indexValue) {
        try {
            arr[indexValue] = Integer.MIN_VALUE; // Time Complexity O(1)
            System.out.println("Value is deleted successfully"); // Time Complexity O(1)
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index to access array"); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        SingleDimensionArrayDeletion obj = new SingleDimensionArrayDeletion(5);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(4, 50);

        System.out.println("Array Search");
        obj.DeleteValueFromArray(3);
        System.out.println(Arrays.toString(obj.arr));

    }
}
