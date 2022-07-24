package exerciseCheck;

public class Practice {

    public static void main(String[] args) {
        Practice messagePractice = new Practice("I think I'm getting it");
        String printMessage = messagePractice.getMessage();
        System.out.println(printMessage);
//        System.out.println(Practice.getMessage());
//        Practice.setMessage("It's Sunday");
//        System.out.println(Practice.getMessage());

    }
    private static String message = "Hello World";

    public Practice(String message){
        this.message = message;
    }

    public static String getMessage(){
        return message;
    }
    public static void setMessage(String aMessage){
        message = aMessage;
    }

}
