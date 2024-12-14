import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for paper, 2 for Scissor");
        

        Random rand = new Random();
        while (true) {
            int userInput = sc.nextInt();
            int computerInput = rand.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Tie:)");
            } else if ((userInput == 0 && computerInput == 2 )|| (userInput == 1 && computerInput == 0)
                    || (userInput == 2 && computerInput == 1)) {
                System.out.println("Congratulations!!! You won!!!:)");
            } else {
                System.out.println("Computer Won...");
            }
            System.out.println("Computer Choice:" + computerInput);

            System.out.println("Want to play again?(y/n):");
            String rematch = sc.next().toLowerCase();

            if (!rematch.equals("y")) {
                break;
            }

        }
        sc.close();
    }
}
