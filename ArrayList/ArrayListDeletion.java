package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Time Complexity O(n) -> Since automated shifting elements from right after deletion.
//Space Complexity O(1)

public class ArrayListDeletion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println("Array List");
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);

        ArrayList<String> stArrayList = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        stArrayList.remove(2);
        stArrayList.remove("D");
        System.out.println(stArrayList);

       
    }
}
