package Java_3.java_3;
import java.util.Scanner;
public class TriangleCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double base;
        double height;
        double side1;
        double side2;
        double side3;
        double area;
        double perimeter;
        String triangleType;

        System.out.println("Enter triangle base:");
        base = scanner.nextDouble();

        System.out.println("Enter triangle height:");
        height = scanner.nextDouble();

        System.out.println("Enter side 1 length:");
        side1 = scanner.nextDouble();

        System.out.println("Enter side 2 length:");
        side2 = scanner.nextDouble();

        System.out.println("Enter side 3 length:");
        side3 = scanner.nextDouble();

        if (base <= 0 || height <= 0 || side1 <= 0 || side2 <= 0 || side3 <= 0) {

            System.out.println("Invalid input. All values must be greater than zero.");

        } else {

            area = (base * height) / 2;

            perimeter = side1 + side2 + side3;

            if (side1 == side2 && side2 == side3) {

                triangleType = "Equilateral Triangle";

            } else if (side1 == side2 || side1 == side3 || side2 == side3) {

                triangleType = "Isosceles Triangle";

            } else {

                triangleType = "Scalene Triangle";
            }

            System.out.println("Base: " + base);
            System.out.println("Height: " + height);
            System.out.println("Side 1: " + side1);
            System.out.println("Side 2: " + side2);
            System.out.println("Side 3: " + side3);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Triangle Type: " + triangleType);
        }

        scanner.close();
    }
}
