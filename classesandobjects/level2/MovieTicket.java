package classesandobjects.level2;

public class MovieTicket {
    String movieName;
    Integer seatNumber, price;

    MovieTicket(String movieName, Integer seatNumber, Integer price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("movie name: " + this.movieName + "\nseat number: " + this.seatNumber + "\nprice: " + this.price);
    }

    public static void main(String[] args) {
        MovieTicket mt1 = new MovieTicket("Dhurandhar", 5, 100);
        mt1.getDetails();
    }
}
