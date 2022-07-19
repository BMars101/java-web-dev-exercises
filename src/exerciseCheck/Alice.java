package exerciseCheck;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUsersSearchTerm();
        Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
        System.out.println("The result is: " + myReturnedResult.toString());

    }
    public void removeWordFromQuote(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the" +
                " bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        String quoteToLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        int startingPoint1;
        int endingPoint1;
        int startingPoint2;
        int endingPoint2;
    }
    public void getSearchTermIndex(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the" +
                " bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        String quoteToLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        int index = quoteToLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index of the search term is " + index);
    }
    public String getUsersSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }
    public boolean searchAliceQuote(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the" +
                " bank, and of having nothing to do: once or twice she had peeped into the book" +
                " her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        String quoteToLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = quoteToLowerCase.contains(searchTermLowerCase);
        return result;
    }

}
