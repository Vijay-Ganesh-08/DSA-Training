package ArrayQuestions;

/*
 * Write a program to to check if an array contains a number in Java.
 */
public class FindANumber {
    public static void main(String[] args) {
    FindANumber obj = new FindANumber();
    int[] intArray = {1,2,3,4,5,6};
    obj.linearSearch(intArray, 5);

  }

  // Search Method
  public void linearSearch(int[] intArray, int value) {
    for(int i=0; i<intArray.length; i++) {
      if (intArray[i] == value) {
        System.out.println("Value is found at the index of " + i);
        return;
      }
    }
    System.out.println(value + " is not found");
  }
}
