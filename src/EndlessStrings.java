// Loop debugging activity
// Fix endless loop

import java.util.Scanner;

public class EndlessStrings {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        while (!userInput.equals("stop")) {
            userInput = keyboard.nextLine();
            System.out.println(userInput);
            if (userInput.equals("stop"))
            {
                System.out.println("Endless Strings program has finished");
                break;
            }
        }
    }
}
