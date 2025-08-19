package ArrayQuestions;

/*
 * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
 * Example
 * myArray = {1,2,3,4,6}
 * findMissingNumberInArray(myArray, 6) // 5
 * Hint: Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        FindMissingNumber obj = new FindMissingNumber();
        int result = obj.findMissingNumberInArray(myArray);
        System.out.println(result);
        
    }

    public int findMissingNumberInArray(int[] array) {
        int n = array.length + 1; // 6
        int expectedSum = (n * (n + 1)) / 2; // (6 * (6+1) / 2) = 21
        int actualSum = 0;
 
        for (int number : array) {
            actualSum += number; // 16
        }
 
        return expectedSum - actualSum; // 5
    } 
}
