package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Theater {
    private String name;
    private int priceList;
    private int averageRating;
    private int subTotalRating;
    private int numberOfReviews;
    private ArrayList<Review> reviews;
    private Set<String> movies;

    public Theater(String name, int priceList) {
        this.name = name;
        this.priceList = priceList;
        this.averageRating = 0;
        this.subTotalRating = 0;
        this.numberOfReviews = 0;
        this.reviews = new ArrayList<>();
        this.movies = new HashSet<>();
    }

    public int getAvgRat() {
        return this.averageRating;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        boolean removed = this.movies.remove(movie);
        if (!removed) {
            throw new IllegalArgumentException("Nope");
        }
    }

    public void addReview(TheaterReview review) {
        this.reviews.add(review);
        this.subTotalRating += review.getRating();
        this.numberOfReviews++;
        this.averageRating = this.subTotalRating / this.numberOfReviews;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name);
        output.append(", ");
        output.append(this.averageRating);
        output.append(", ");
        output.append(this.priceList);
        for (String movie: this.movies) {
            output.append(", ");
            output.append(movie);
        }

        return output.toString();
    }

    public static class TheaterReview extends Review {
        private String movie;

        public TheaterReview(String body, String author, int rating) {
            super(body, author, rating);
            this.movie = "";
        }

        public TheaterReview(String body, String author, int rating, String movie) {
            super(body, author, rating);
            this.movie = movie;
        }

        @Override
        public String toString() {
            StringBuilder output = new StringBuilder();

            output.append(this.getBody());
            output.append(", ");
            output.append (this.getAuthor());
            output.append(", ");
            output.append(this.getRating());
            if (!Objects.equals(this.movie, "")) {
                output.append(", ");
                output.append(this.movie);
            }
            return output.toString();
        }
    }
}
