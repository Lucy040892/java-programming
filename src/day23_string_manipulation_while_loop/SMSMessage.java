package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] From Number<2223334444> Message:" +
                "{Hello, lets code some java}";
        int start = message.indexOf("[") + 1;
        int finish = message.indexOf("]");
        String sender = message.substring(start, finish );
        System.out.println("Sender is " +sender);
        int startNumber = message.indexOf("<") + 1;
        int finishNumber = message.indexOf(">");
        String number = message.substring(startNumber, finishNumber);
        System.out.println("Number is " +number);
        String text = message.substring(message.indexOf("{") + 1, message.indexOf("}"));
        System.out.println("Text is: " +text);

        System.out.println(" \tFikret et   ".trim());// trim removes spaces on the sides, tabes

        sender = sender.trim();
        if(sender.equals("Nadir")){
            System.out.println("Message from Nadir");
        }else{
            System.out.println("Message from someone else");
        }

    }
}
