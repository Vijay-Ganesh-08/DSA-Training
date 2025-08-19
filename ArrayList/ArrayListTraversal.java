package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//Time Complexity O(n) 
//Space Complexity O(1)

public class ArrayListTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Array List");
        System.out.println(numbers);

        System.out.println("Traversing through Traditional ForLoop");
        for (int i = 0; i < numbers.size(); i++) { 
            System.out.println(numbers.get(i));
        }

        System.out.println("Traversing through For Each Loop");
        for (int num : numbers) { 
            System.out.println(num);
        }

        System.out.println("Traversing through Iterator");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
