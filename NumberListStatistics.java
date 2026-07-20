package Java_Task_3;
import java.util.ArrayList;
import java.util.List;

public class NumberListStatistics {
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();

        // Add numbers to the list
        numbers.add(15);
        numbers.add(-8);
        numbers.add(0);
        numbers.add(22);
        numbers.add(-13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(-25);
        numbers.add(10);
        numbers.add(3);
        numbers.add(-6);
        numbers.add(14);
        numbers.add(9);
        numbers.add(-1);
        numbers.add(30);
        numbers.add(-17);
        numbers.add(5);
        numbers.add(2);
        numbers.add(-11);
        numbers.add(40);

        // Variables for statistics
        int totalSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int largestNumber = numbers.get(0);
        int smallestNumber = numbers.get(0);

        // Display all numbers
        System.out.println("All Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Process the numbers
        for (int number : numbers) {

            // Add to total sum
            totalSum += number;

            // Check even or odd
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Check positive, negative, or zero
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            // Find largest number
            if (number > largestNumber) {
                largestNumber = number;
            }

            // Find smallest number
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        // Calculate average
        double average = (double) totalSum / numbers.size();

        // Display results
        System.out.println("\nNumber List Statistics");
        System.out.println("----------------------");
        System.out.println("Sum of Numbers:  " + totalSum);
        System.out.println("Average Value: " + average);
        System.out.println("Largest Number: " + largestNumber);
        System.out.println("Smallest Number: " + smallestNumber);
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Count of Odd Numbers: " + oddCount);
        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
    }


}

