package countingCharacters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
//    public static void main(String[] args) {
//        String passage = "If the product of two terms is zero then common sense says at least " +
////                "one of the two terms has to be zero to start with. So if you move all the terms over " +
////                "to one side, you can put the quadratics into a form that can be factored allowing " +
////                "that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
////                "straightforward from there.";
//
//        CharacterCount.CountChars(passage);
//    }
    public static void countChars(String input){
        //method takes string input;
        //method loops through each character (convert string to char array)
        //Create some collection to hold the following character : score
        char[] characters = input.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterScore = new HashMap<>();
        int charScore = 1;
        for(char letter : characters){
            if(Character.isLetter(letter)){
                if(!characterScore.containsKey(letter)){
                    characterScore.put(letter, charScore);
                }else{
                    characterScore.put(letter, characterScore.get(letter) + 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> score : characterScore.entrySet()){
            System.out.println(String.format("%s: %s", score.getKey(), score.getValue()));
        }
        //System.out.println(characterScore);



    }
//    public static void main(String[] args) {
//
//        char[] passageToChar = passage.toCharArray();
//        for(char character : passageToChar){
//            System.out.println(character);
//        }
//        //System.out.println(passageToChar);
//        String[] passageSplit = passage.split("");
//        ArrayList<String> passageToArray = new ArrayList<>(Arrays.asList(passageSplit));
//        //System.out.println(passageToArray);
////        for(int i = 0; i < passageToArray.size(); i++){
////            System.out.println(passageToArray.get(i));
////        }
//    }
}
