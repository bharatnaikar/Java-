import java.util.Random;

public class DiceRollSimulator {
    public static void main(String[] args) {
        rollDice();
    }

    public static void rollDice() {
        Random random = new Random();
        
        // Simulate rolling two dice by generating random numbers between 1 and 6
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        
        // Calculate the total value
        int total = die1 + die2;
        
        // Display the results
        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + total);
    }
}
