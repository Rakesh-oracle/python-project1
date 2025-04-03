//Find the largest of three no.

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: " + largest);
    }
}