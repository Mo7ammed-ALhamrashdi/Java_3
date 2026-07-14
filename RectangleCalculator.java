public class RectangleCalculator {
    public static void main(String[] args) {

        // Declare and assign the length of the rectangle
        double length = 12.5;

        // Declare and assign the width of the rectangle
        double width = 8.0;

        // Declare a variable to store the calculated area
        double area;

        // Declare a variable to store the calculated perimeter
        double perimeter;

        // Calculate the area using the formula: length * width
        area = length * width;

        // Calculate the perimeter using the formula: 2 * (length + width)
        perimeter = 2 * (length + width);

        // Display the length of the rectangle
        System.out.println("Length: " + length);

        // Display the width of the rectangle
        System.out.println("Width: " + width);

        // Display the calculated area
        System.out.println("Area: " + area);

        // Display the calculated perimeter
        System.out.println("Perimeter: " + perimeter);
    }
}

