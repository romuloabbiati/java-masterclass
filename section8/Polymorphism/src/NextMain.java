public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "National Lampoon's Day");
//        comedy.watchMovie();
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("Comedy", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
        } else if(unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if(unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }

}
