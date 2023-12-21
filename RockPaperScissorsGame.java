import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Let's play Rock, Paper, Scissors!");
            System.out.print("Enter your choice (1, 2, or 3): ");
            String userChoice = scanner.next().toLowerCase();

            if (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")) {
                System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3); // 1 for rock, 2 for paper, 3 for scissors

            String computerChoiceString = "";
            switch (computerChoice) {
                case 1:
                    computerChoiceString = "1";
                    break;
                case 2:
                    computerChoiceString = "2";
                    break;
                case 3:
                    computerChoiceString = "3";
                    break;
            }

            System.out.println("Computer chooses: " + computerChoiceString);

            if (userChoice.equals(computerChoiceString)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("1") && computerChoiceString.equals("scissors")) ||
                (userChoice.equals("2") && computerChoiceString.equals("rock")) ||
                (userChoice.equals("3") && computerChoiceString.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing Rock, Paper, Scissors!");
        scanner.close();
    }
}