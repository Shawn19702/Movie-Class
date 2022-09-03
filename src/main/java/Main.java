public class Main {

    public static void main(String[] args) {

        //creating an object with the default constructor
        Movie one = new Movie();
        //objectName.propertyName
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in the Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playit();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;



    }
}