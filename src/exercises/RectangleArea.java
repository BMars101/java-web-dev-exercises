package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input;
        Scanner secondInput;

        input = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        length = input.nextInt();

        secondInput = new Scanner(System.in);
        System.out.println("Enter the width of a rectangle");
        width = secondInput.nextInt();

        area = length * width;
        System.out.println("The area of the rectangle is " + area);


    }
}
