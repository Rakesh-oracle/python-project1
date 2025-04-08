import java.util.Scanner;

public class StarPatternDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print descending star pattern
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}