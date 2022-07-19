package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        String passageToLower = passage.toLowerCase();
        String term;
        String termToLower;
        int termIndex;
        int termLength;
        String newPassage;
        Boolean passageTerm;
        Scanner inputTerm = new Scanner(System.in);
        System.out.println("Enter a term to search for within a passage");
        term = inputTerm.next();
        termToLower = term.toLowerCase();
        passageTerm = passageToLower.contains(termToLower);
        System.out.println("It is " + passageTerm + " that the passage contains the term you entered." );
        termIndex = passageToLower.indexOf(termToLower);
        termLength = termToLower.length();
        newPassage = passageToLower.replace(termToLower, "");
        System.out.println("Index and length of term: " + termIndex + " and " + termLength);
        System.out.println("The passage with the term removed: " + newPassage);



    }
}
