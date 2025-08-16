import java.util.Arrays;


public class SingleDimensionArrayCreation{
    public static void main(String[] args) {
        int[] intArray1;  //Time Complexity O(1)
        intArray1 = new int[5];  //Time Complexity O(1)
        
        //Time Complexity O(N)
        intArray1[0] = 1;
        intArray1[1] = 2;
        intArray1[2] = 3;
        intArray1[3] = 4;
        intArray1[4] = 5;

        System.out.println(Arrays.toString(intArray1));

        String[] sArray = {"Vijay","Ganesh","Array","Training"}; //Time Complexity O(1)
        System.out.println(Arrays.toString(sArray)); 

    }
}