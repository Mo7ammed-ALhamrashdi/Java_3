public class EvenNumberAnalyzer {
    public static void main(String[] args) {

        // Declare the limit for the loop
        int limit = 20;

        // Initialize variables to count even numbers and store their sum
        int count = 0;
        int sum = 0;

        // Loop from 1 to the limit (inclusive)
        for (int i = 1; i <= limit; i++) {

            // Check if the current number is even
            if (i % 2 == 0) {

                // Print the even number
                System.out.println(i);

                // Increase the count of even numbers
                count++;

                // Add the even number to the total sum
                sum += i;
            }
        }

        // Display the total number of even numbers
        System.out.println("Total even numbers: " + count);

        // Display the sum of all even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}
