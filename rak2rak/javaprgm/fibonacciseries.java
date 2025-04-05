import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                 // Ask the user for the number of terms
                         System.out.print("Enter the number of terms in the Fibonacci series: ");
          int numTerms = scanner.nextInt();

                      // First two terms of the Fibonacci series
                                                 int first = 0, second = 1;

                  System.out.println("Fibonacci Series:");
        for (int i = 1; i <= numTerms; i++) {
                              System.out.print(first + " ");

             // Calculate the next term in the series
                     int next = first + second;
                first = second;
                    second = next;
          }

             scanner.close();
    }
}
