public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 40};
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest Number: " + largest);
    }
}