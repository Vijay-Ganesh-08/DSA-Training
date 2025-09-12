package ArrayPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3, 7);

        // Using Stream Sorted with Comparator
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Using Stream Sorted with Comparator");
        System.out.println(sortedDesc);

        // Using Stream Sorted with compareTo Method
        List<Integer> sortedDescCompare = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("Using Stream Sorted with compareTo Method");
        System.out.println(sortedDescCompare);

        // Using Collections.Sort
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Using Collections.Sort");
        System.out.println(numbers);
    }
}