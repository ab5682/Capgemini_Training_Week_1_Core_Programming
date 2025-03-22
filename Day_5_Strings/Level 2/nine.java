import java.util.Scanner;

public class nine {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); 
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String determineWinner(String player, String computer) {
        if (player.equals(computer)) return "draw";
        if (player.equals("rock") && computer.equals("scissors") ||
            player.equals("paper") && computer.equals("rock") ||
            player.equals("scissors") && computer.equals("paper")) {
            return "player";
        } else {
            return "computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent) + "%";

        return stats;
    }

    public static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.println("Name\tWins\tWin %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games to play:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[n][3];
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Game " + (i + 1) + " - Enter your choice (rock, paper, or scissors):");
            String player = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = determineWinner(player, computer);

            if (winner.equals("player")) playerWins++;
            else if (winner.equals("computer")) computerWins++;

            gameResults[i][0] = player;
            gameResults[i][1] = computer;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, n);
        displayResults(gameResults, stats);
    }
}
