public class DecimalToBinary {
    public static void main(String[] args) {
        int number = 25;
        int originalNumber = number;
        String binary = "";
        int remainder;
        while (number > 0) {

            remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }
        System.out.println("Decimal Number: " + originalNumber);
        System.out.println("Binary Number: " + binary);
    }
}

