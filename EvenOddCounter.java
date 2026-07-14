public class EvenOddCounter {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int evencount = 0;
        int oddcount = 0;

        // Check each number in the given range
        for (int i = start; i <= end; i++) {

            // Check if the number is even or odd
            if (i % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        // Display the final counts
        System.out.println("Even Numbers Count: " + evencount);
        System.out.println("Odd Numbers Count: " + oddcount);

    }
}
