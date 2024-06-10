public class DiceRollGame {
    public static void main(String[] args) {

        // Number of players
        int numberOfPlayers = 4;

        // Simulate dice rolls for each player
        for (int player = 1; player <= numberOfPlayers; player++) {
            System.out.println("Player " + player + "'s turn:");
            int roll = 0;
            do {
                roll = rollDice();
                System.out.println("Rolled a " + roll);
            } while (roll == 6);
            System.out.println();
        }
    }

    // Function to simulate a dice roll
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
