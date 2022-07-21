package exercises.controlFlowAndCollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newWord;
        String greenEggs = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] greenEggsSplit = greenEggs.split(" ");
        ArrayList<String> greenEggsList = new ArrayList<>(Arrays.asList(greenEggsSplit));

        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 1, 5, 47, 7, 8, 22, 52, 65, 81));

        //printWords(greenEggsList);
        do {
            System.out.println("Enter a word: ");
            newWord = input.nextLine();
            if(!newWord.equals("")){
                words.add(newWord);
            }
        }while(!newWord.equals(""));
        System.out.println("The sum of all even numbers in the numbers array is: " + sumEven(numbers));
       printWords(words);
    }
    public static int sumEven(ArrayList<Integer> arr){
        int sum = 0;
        for(int integer : arr){
            if(integer % 2 == 0){
                sum += integer;
            }
        }
        return sum;
    }
    public static void printWords(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for a word's length: ");
        int wordLength = input.nextInt();
        for(String word : arr){
            if(word.length() == wordLength){
                System.out.println(word);
            }
        }
    }
}
