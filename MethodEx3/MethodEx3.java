
import java.util.Scanner;


public class MethodEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        System.out.println("Enter the length of rectangle: ");
        rect1.length = input.nextDouble();
        
        System.out.println("Enter the  width of rectangle: ");
        rect1.width = input.nextDouble();

        System.out.println("Enter the length of rectangle: ");
        rect2.length = input.nextDouble();
        
        System.out.println("Enter the  width of rectangle: ");
        rect2.width = input.nextDouble();
        
        System.out.println("The area of the rectangle 1: " + rect1.calculateArea());
        System.out.println("The area of the rectangle 2: " + rect2.calculateArea());
    }
}
