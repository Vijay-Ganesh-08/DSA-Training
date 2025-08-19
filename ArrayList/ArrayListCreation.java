package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;


//Time Complexity O(1)
//Space Complexity O(1) - O(n)

public class ArrayListCreation {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(numbers);        
    }
}
