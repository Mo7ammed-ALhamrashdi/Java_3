public class FactorialCalculator {
    public static void main(String[] args) {

        // Declare the number whose factorial will be calculated
        int number = 7;

        // Initialise factorial to 1 (multiplicative identity for the product)
        long factorial = 1;

        // Initialise the loop counter starting at 1
        int i = 1;

        // Loop while i is less than or equal to number
        while (i <= number) {

            // Multiply factorial by the current value of i
            factorial = factorial * i;

            // Increment the loop counter by 1
            i++;
        }

        // Print the original number
        System.out.println("Number: " + number);

        // Print the calculated factorial value
        System.out.println("Factorial: " + factorial);
    }
}
