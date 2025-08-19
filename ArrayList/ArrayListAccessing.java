package ArrayList;

import java.util.ArrayList;

//Time Complexity O(1)
//Space Complexity O(1) 
public class ArrayListAccessing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
    }
}
