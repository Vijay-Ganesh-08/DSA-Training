package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

//Time Complexity O(n) 
//Space Complexity O(1)

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
        System.out.println("Array List");
        System.out.println(numbers);
        int target = 30;

        for(int num : numbers){
            if(num == target){
                System.out.println("Element is found : " + num);
                break;
            }
        }

        //IndexOf Search
        int index = numbers.indexOf(30);
        System.out.println("Element is found at index : " + index);


        ArrayList<String> stArrayList = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        String searchLetter = "d";
        for(String letter : stArrayList){
            if(letter.equals(searchLetter)){
                System.out.println("Element is found : " + letter);
                break;
            }
        }

        //IndexOf Search
        int stringIndex = stArrayList.indexOf("c");
        System.out.println("Element is found at index : " + stringIndex);
    }
}
