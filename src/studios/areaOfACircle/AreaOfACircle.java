package studios.areaOfACircle;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of a circle?");
        try {
            Double radius = input.nextDouble();
            if(radius < 0){
                System.out.println("Radius cannot be less than 0");
            }
            Double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is " + area);
        } catch(Exception error){
            System.out.println("Radius must be an integer.");
        }
        input.close();
    }
}
