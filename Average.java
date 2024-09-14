// Simple prompt to enter specific number of temperatures and then get the average temperature and the number of days above the average temperature.
// Steve Sharpe, SD10

import java.util.Scanner; // import scanner module

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create scanner object

        System.out.println();
        System.out.println("Enter the number of days: "); // prompt to enter the number of days

        int n = scan.nextInt(); // get the number of days
        int[] temp = new int[n]; // create an array to store the temperatures
        int sum = 0; // variable to store the sum of the temperatures
        for (int i = 0; i < n; i++) { // loop to get the temperatures
            System.out.println();
            System.out.println("Enter the temperature of day " + (i + 1) + ": "); // prompt to enter the temperature
            temp[i] = scan.nextInt(); // get the temperature
            sum += temp[i]; // add the temperature to the sum
        }
        double avg = sum / n; // calculate the average temperature
        System.out.println();
        System.out.println("The average temperature is: " + avg); // display the average temperature
        System.out.println();
        int count = 0; // variable to store the number of days above the average temperature
        for (int i = 0; i < n; i++) { // loop to get the number of days above the average temperature
            if (temp[i] > avg) { // check if the temperature is above the average temperature
                count++;
            }
        }
        System.out.println("The number of days above the average temperature is: " + count); // display the number of
                                                                                             // days above the average
                                                                                             // temperature
        System.out.println();
    }
}