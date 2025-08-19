package SimpleArrayProject;

import java.util.Scanner;

//Find the Days Above Average Temperature
public class AverageTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Days : ");
        int numberOfDays = scanner.nextInt();
        int arr[] = new int[numberOfDays];
        int sum = 0;
        // record Temperature and Finding Average
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i+1) + "'s High Temp: ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double average = sum / numberOfDays;
        System.out.println();
        System.out.println("Average Temperature = " + average);

        //Count days above average
        int daysCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                daysCount++;
            }
        }
        System.out.println("There are " + daysCount + " is higher than the average");

        scanner.close();
    }

}
