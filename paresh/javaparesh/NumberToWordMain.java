import java.util.Scanner;

class NumberToWord {
    String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"
    };
    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Method to convert number to words
    String convertToWords(int num) {
        String words = "";
        if (num == 0) {
            return "Zero";
        }
        if (num / 1000 > 0) {
            words += ones[num / 1000] + " Thousand ";
            num %= 1000;
        }
        if (num / 100 > 0) {
            words += ones[num / 100] + " Hundred ";
            num %= 100;
        }
        if (num > 0) {
            if (num < 20) {
                words += ones[num];
            } else {
                words += tens[num / 10] + " ";
                if (num % 10 > 0) {
                    words += ones[num % 10];
                }
            }
        }
        return words.trim(); // Add this return statement inside the method
    }
}

public class NumberToWordMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-9999): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 9999) {
            System.out.println("Please enter a number between 0 and 9999.");
        } else {
            // Creating an object of NumberToWord class
            NumberToWord converter = new NumberToWord();
            System.out.println("Number in words: " + converter.convertToWords(number));
        }
    }
}