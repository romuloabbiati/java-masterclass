public class Main {

    public static void main(String[] args) {

        int number = 0;
        while(number < 50) {
            number += 5;
            if(number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if(j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while(isReady);

//        while(true) {
//            if(j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }

//        while(j <= 5) {
//            System.out.println(j);
//            j++;
//        }
    }

}
