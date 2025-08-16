public class SingleDimensionArrayTraversal {
    int arr[] = null;

    public SingleDimensionArrayTraversal(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //Time Complexity O(N)
    //Space Complexity O(1)
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

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) { // Time Complexity O(N)
                System.out.print(arr[i] + " "); // Time Complexity O(1)
            }
        } catch (Exception ex) {
            System.out.println("Array No Longer Exists !!!"); // Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        SingleDimensionArrayTraversal obj = new SingleDimensionArrayTraversal(5);
        obj.insert(0, 0);
        obj.insert(1, 10);
        obj.insert(2, 20);
        obj.insert(1, 30);
        obj.insert(12, 120);

        System.out.println("Array Traversal");
        obj.traverseArray();

    }
}
