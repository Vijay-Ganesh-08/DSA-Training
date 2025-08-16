public class SingleDimensionArraySearch {
    int arr[] = null;

    public SingleDimensionArraySearch(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Time Complexity O(N)
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

    public void searchInArray(int value) {
        for (int i = 0; i < arr.length; i++) {// Time Complexity O(N)
            if (arr[i] == value) { // Time Complexity O(1)
                System.out.println("Value is found at the index of " + i); // Time Complexity O(1)
                return; // Time Complexity O(1)
            }
        }
        System.out.println(value + " is not found"); // Time Complexity O(1)
    }

    public static void main(String[] args) {
        SingleDimensionArraySearch obj = new SingleDimensionArraySearch(5);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(4, 50);

        System.out.println("Array Search");
        obj.searchInArray(80);

    }
}
