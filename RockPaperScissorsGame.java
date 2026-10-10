import java.util.Random;

/**
 * Week 1 Practice - Problem 1: Rock-Paper-Scissors Game
 * Suggested method signature: String playRound(String playerMove, String computerMove)
 */
public class RockPaperScissorsGame {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        int rounds = 5;
        String[] predefinedPlayerMoves = {"Rock", "Paper", "Scissors", "Rock", "Scissors"};
        Random random = new Random(42);
        int wins = 0, losses = 0, draws = 0;

        System.out.printf("%-10s | %-12s | %-14s | %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < rounds; i++) {
            String playerMove = predefinedPlayerMoves[i % predefinedPlayerMoves.length];
            String computerMove = MOVES[random.nextInt(MOVES.length)];
            String result = playRound(playerMove, computerMove);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;

            System.out.printf("%-10s | %-12s | %-14s | %-15s%n", "Round " + (i + 1), playerMove, computerMove, result);
        }

        double winPercentage = ((double) wins / rounds) * 100.0;
        System.out.println("------------------------------------------------------------");
        System.out.printf("Final Summary (after %d rounds) Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                rounds, wins, losses, draws, winPercentage);
    }
}
