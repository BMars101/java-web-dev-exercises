package exerciseCheck;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        MilesPerGallon milesGallon = new MilesPerGallon();
        milesGallon.calculateMilesPerGallon();
    }
    public void calculateMilesPerGallon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Double milesDriven = scanner.nextDouble();

        System.out.println("How many gallons of gas has your car consumed?");
        Double gallonsConsumed = scanner.nextDouble();

        Double milesPerGallon = milesDriven / gallonsConsumed;
        System.out.println("You miles per gallon is: " + milesPerGallon);

    }
}
