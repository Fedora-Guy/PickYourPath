import java.util.Scanner;

public class Story {
    
    Story () {
    }

    static void start() {
        System.out.println("Why Hello there! You seem to be lost. Welcome the club, I guess?");
        System.out.println("What is your Name?");
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        System.out.println("Ahhh, " + Name + " is a good name. Well good luck");
        scan.close();

    }
}
