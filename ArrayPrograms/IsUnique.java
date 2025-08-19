package ArrayPrograms;

/*
 * Write a program to check if an array is unique or not.
 */

public class IsUnique {
    public static void main(String[] args) {
        IsUnique mn = new IsUnique();
        int[] intArray = { 1, 2, 3, 6, 5 };
        boolean result = mn.isUniqueArray(intArray);
        System.out.println(result);
    }

    // Is Unique
    public boolean isUniqueArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
