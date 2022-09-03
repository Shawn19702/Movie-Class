public class Movie {

    //properties or attributes or instance variables or fields
    public String title;
    public String genre;
    public int rating;

    //default constructor
    public Movie(){

    }

    //parameterized constructor
    public Movie(String title, String Genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    //method
    public void playit() {
        System.out.println("Playing the movie" + " " + this.title + " " + "the genre is" + " " + this.genre + " " +
                "and the rating is" + " " + this.rating);
    }


}
