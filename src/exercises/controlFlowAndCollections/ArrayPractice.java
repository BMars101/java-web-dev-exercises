package exercises.controlFlowAndCollections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        /*for(int number : numbersArray){
            System.out.println(number);
        }*/
        for(int i = 0; i < numbersArray.length; i++){
            if(numbersArray[i] % 2 != 0){
                System.out.println(numbersArray[i]);
            }
        }
        String greenEggs = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] greenEggsArr = greenEggs.split("\\.");
        System.out.println(Arrays.toString(greenEggsArr));
    }
}
