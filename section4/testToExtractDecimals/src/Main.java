public class Main {

    public static void main(String[] args) {


    }


        public static boolean hasTeen(int one, int two, int three) {
            if(isTeen(one) || isTeen(two) || isTeen(three) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isTeen(int number) {
            if(number >= 13 && number <= 19) {
                return true;
            } else {
                return false;
            }
        }

}
