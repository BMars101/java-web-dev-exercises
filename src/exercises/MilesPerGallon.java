package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int miles;
        int gallons;
        int milesPerGallon;
        Scanner inputMiles;
        Scanner inputGallons;

        inputMiles = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = inputMiles.nextInt();

        inputGallons = new Scanner(System.in);
        System.out.println("How many gallons did you use?");
        gallons = inputGallons.nextInt();

        milesPerGallon = miles / gallons;
        System.out.println("You get " + milesPerGallon + " miles per gallon of gas.");
    }
}
