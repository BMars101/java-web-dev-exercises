package countingCharacters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to score: ");
        String userInput = input.nextLine();
//        String passage = "If the product of two terms is zero then common sense says at least " +
//                "one of the two terms has to be zero to start with. So if you move all the terms over " +
//                "to one side, you can put the quadratics into a form that can be factored allowing " +
//                "that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
//              "straightforward from there.";
        input.close();
        CharacterCount.countChars(userInput);
    }
}
