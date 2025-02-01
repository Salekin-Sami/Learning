import java.util.ArrayList;
import java.util.List;

// Movie class
class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    // Constructor
    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>(); // Initialize reviews list
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Method to get all reviews
    public List<String> getReviews() {
        return reviews;
    }

    // Method to display movie details
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.print("Actors: ");
        for (String actor : actors) {
            System.out.print(actor + " ");
        }
        System.out.println();
        System.out.println("Reviews: ");
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            for (String review : reviews) {
                System.out.println("- " + review);
            }
        }
        System.out.println();
    }
}

// Main class to demonstrate the Movie class
public class MovieDemo {
    public static void main(String[] args) {
        // Create a list of actors
        List<String> actors = new ArrayList<>();
        actors.add("Actor A");
        actors.add("Actor B");
        actors.add("Actor C");

        // Create a Movie object
        Movie movie = new Movie("The Great Movie", "John Doe", actors);

        // Add reviews
        movie.addReview("An amazing film with a gripping storyline.");
        movie.addReview("Fantastic performances by the cast!");

        // Display movie information and reviews
        movie.displayMovieInfo();
    }
}
