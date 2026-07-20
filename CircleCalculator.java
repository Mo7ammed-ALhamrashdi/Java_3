package Java_3.java_3;
import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        double radius;
        double area;
        double circumference;
        String classification;
        System.out.print("Enter the radius of the circle: ");
        radius= input.nextDouble();
        if(radius <= 0){
            System.out.println("Invalid Input");
        }
        else{
            area= pi*radius*radius;
            circumference=pi*radius;
            System.out.println("The area of the circle is: "+area);
            System.out.println("The circumference of the circle is: "+circumference);
        }
        if(radius < 5)
        {
            System.out.println("Small Circle");
        }
        else if (radius>=5 && radius<=15)
        {
            System.out.println("Medium Circle");
        }
        else {
            System.out.println("Largee Circle");
        }

        input.close();
    }
}