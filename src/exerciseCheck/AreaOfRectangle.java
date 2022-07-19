package exerciseCheck;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle rectangleArea = new AreaOfRectangle();
        rectangleArea.areaOfRectangle();
    }
    public void areaOfRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double rectangleLength = scanner.nextDouble();
        System.out.println("What is the width of the rectangle?");
        Double rectangleWidth = scanner.nextDouble();
        Double area = rectangleLength * rectangleWidth;

        System.out.println("The area of the rectangle is " + area);
    }
}
