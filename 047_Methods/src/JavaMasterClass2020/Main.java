package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was "
                + calculateScoreWithReturn(gameOver, score, levelCompleted, bonus));

        calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was "
                + calculateScoreWithReturn(true, 10000, 8, 200));

        System.out.println("_____________________________________");


        displayHighScorePosition("player1500", calculateHighScorePosition(1500));
        displayHighScorePosition("player900", calculateHighScorePosition(900));
        displayHighScorePosition("player400", calculateHighScorePosition(400));
        displayHighScorePosition("player50", calculateHighScorePosition(50));

        displayHighScorePosition("player1000", calculateHighScorePosition(1000));
        displayHighScorePosition("player500", calculateHighScorePosition(500));
        displayHighScorePosition("player100", calculateHighScorePosition(100));
    }


    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateScoreWithReturn(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
        }

        return finalScore;
    }


    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " got into position - " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) { // 2nd condition can be removed
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) { // 2nd condition can be removed
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
