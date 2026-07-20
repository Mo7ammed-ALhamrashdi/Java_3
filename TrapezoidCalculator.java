package Java_Task_3;
import java.util.Scanner;
public class TrapezoidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base1;
        double base2;
        double height;
        double leg1;
        double leg2;
        double area;
        double perimeter;
        String trapezoidType;

        System.out.println("Enter the length of base 1:");
        base1 = scanner.nextDouble();

        System.out.println("Enter the length of base 2:");
        base2 = scanner.nextDouble();

        System.out.println("Enter the height:");
        height = scanner.nextDouble();

        System.out.println("Enter the length of leg 1:");
        leg1 = scanner.nextDouble();

        System.out.println("Enter the length of leg 2:");
        leg2 = scanner.nextDouble();

        if (base1 <= 0 || base2 <= 0 || height <= 0 || leg1 <= 0 || leg2 <= 0) {

            System.out.println("Invalid input. All measurements must be greater than zero.");

        } else {

            area = ((base1 + base2) * height) / 2;
            perimeter = base1 + base2 + leg1 + leg2;
            if (perimeter < 30) {
                trapezoidType = "Small Trapezoid";
            } else if (perimeter >= 30 && perimeter <= 60) {
                trapezoidType = "Medium Trapezoid";
            } else {
                trapezoidType = "Large Trapezoid";
            }
            System.out.println("Base 1: " + base1);
            System.out.println("Base 2: " + base2);
            System.out.println("Height: " + height);
            System.out.println("Leg 1: " + leg1);
            System.out.println("Leg 2: " + leg2);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Trapezoid Classification: " + trapezoidType);
        }
        scanner.close();
    }
}


