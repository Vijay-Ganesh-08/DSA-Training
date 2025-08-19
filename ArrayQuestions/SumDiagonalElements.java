package ArrayQuestions;


/*
 * Given 2D array calculate the sum of diagonal elements.
 * Example : myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 * sumDiagonalElements(myArray2D) # 15
 */

public class SumDiagonalElements {
    public static void main(String[] args) {
        int[][] int2DArray = {{1,2,3},{4,5,6},{7,8,9}};
        SumDiagonalElements obj = new SumDiagonalElements();
        int result = obj.sumDiagonalElements(int2DArray);
        System.out.println(result);
    }


    public int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;
 
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
 
        return sum;
    }
}
