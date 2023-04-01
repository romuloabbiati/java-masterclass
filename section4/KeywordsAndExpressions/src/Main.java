public class Main {

    public static void main(String[] args) {

        // keywords in Java are reserved words that we, developers, cannot use to create our statements, expressions
        // so on and so forth. For example, I cannot create a variable called int, because this is actually a
        // Java keyword which is a data type

        double kilometers = (100 * 1.609344); // kilometers = (100 * 1.609344) is the expression
        // the double and the semicolon are not part of the expression. The entire line is a java statement

        int highScore = 50;

        if(highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100; // health = 100 is the expression

        if((health < 25) && (highScore > 1000)) { // expression = (health < 25) && (highScore > 1000)
            highScore = highScore - 1000; // expression: highScore = highScore - 1000
        }

    }

}
