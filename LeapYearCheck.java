import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Using ternary operator to check leap year condition
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
                        ? "Leap Year" 
                        : "Not a Leap Year";

        // Display result
        System.out.println(year + " is " + result);

        scanner.close();
    }
}
