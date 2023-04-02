public class MainChallenge {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        int newFinalScore = newScore;

        if(newGameOver == true) {
            newFinalScore += (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + newFinalScore);
        }

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

}
