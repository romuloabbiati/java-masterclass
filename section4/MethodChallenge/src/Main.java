public class Main {

    public static void main(String[] args) {
        int playersPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playersPosition);

        playersPosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", playersPosition);

        playersPosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", playersPosition);

        playersPosition = calculateHighScorePosition(100);
        displayHighScorePosition("Tim", playersPosition);

        playersPosition = calculateHighScorePosition(25);
        displayHighScorePosition("Tim", playersPosition);
    }

    public static void displayHighScorePosition(String playersName, int playersPosition) {
        System.out.println(playersName + " managed to get into position " + playersPosition
                        + " on the high score list.\n");
    }

    public static int calculateHighScorePosition(int playersScore) {
        int number = 4;
        if(playersScore >= 1000) {
            number = 1;
        } else if(playersScore >= 500) {
            number = 2;
        } else if(playersScore >= 100) {
            number = 3;
        } 
        return number;
    }

}
