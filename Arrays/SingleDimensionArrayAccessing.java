public class SingleDimensionArrayAccessing {

    int arr[] = null;

    public SingleDimensionArrayAccessing(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    //Time Complexity O(1)
    //Space Complexity O(1)
    public void insert(int location, int value) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {  //Time Complexity O(1)
                arr[location] = value;  //Time Complexity O(1)
                System.out.println("Successfully Inserted !!!");  //Time Complexity O(1)
            } else {
                System.out.println("This cell is already occupied !!!");  //Time Complexity O(1)
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index to access array");  //Time Complexity O(1)
        }
    }

    public static void main(String[] args) {
        SingleDimensionArrayAccessing obj = new SingleDimensionArrayAccessing(3);
        obj.insert(0, 0);
        obj.insert(1, 10);
        obj.insert(2, 20);

        var firstElement = obj.arr[0];  //Time Complexity O(1)
        System.out.println(firstElement);

        var thirdElement = obj.arr[2];  //Time Complexity O(1)
        System.out.println(thirdElement);
    }
}