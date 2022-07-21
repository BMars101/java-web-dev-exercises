package studios.areaOfACircle;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of a circle?");
        try {
            boolean keepLooping = true;
            while (keepLooping) {
                double radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("What is the radius of a circle?");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is " + area);
                    keepLooping = false;
                }
            }
        }catch(Exception error){
            System.out.println("Radius must be an integer.");
        }
        input.close();
    }
}
