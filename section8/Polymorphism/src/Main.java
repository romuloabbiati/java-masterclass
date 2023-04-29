import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = new Adventure("National Lampoon's Day");
//        theMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Comedy", "National Lampoon's Day");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print("A for Adventure, C for Comedy, S for Science Fiction and Q to quit: ");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }

}
