public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 1221;
        int originalnumber = number;
        int reversedNumber = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;}
        System.out.println("Number: " + originalnumber);
        if (originalnumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
