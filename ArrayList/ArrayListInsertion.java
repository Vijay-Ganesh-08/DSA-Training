package ArrayList;

import java.util.ArrayList;

public class ArrayListInsertion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(40); //Time & Space Complexity Amortized O(1)
        numbers.add(1, 20); //Time Complexity O(n) & Space Complexity Amortized O(1)
        System.out.println(numbers);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("c");
        stringList.add(1, "b");
        System.out.println(stringList);
    }
}
