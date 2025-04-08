
import java.util.Scanner;

public class StarMultiplicationPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Loop to create the grid pattern of stars
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* "); // Print star with space for grid structure
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}