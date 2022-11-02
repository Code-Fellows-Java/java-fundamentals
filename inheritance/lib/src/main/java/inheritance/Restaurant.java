package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private int priceList;
    private String name;
    private int rating;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int priceList) {
        this.name = name;

        this.rating = 0;

        if (priceList < 1) priceList = 1;
        if (priceList > 4) priceList = 4;
        this.priceList = priceList;

        this.reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name);
        output.append(", ");
        output.append(this.rating);
        output.append(" average rating, ");
        output.append(this.priceList);
        output.append(" price list, ");
        output.append(this.reviews.size());
        output.append(" reviews.");

        return output.toString();
    }
    private int averageRating() {
        int sum = 0;

        for (Review review: this.reviews) {
            sum += review.getRating();
        }
        if (sum == 0) return 0;
        return sum / this.reviews.size();
    }

    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
        }
    }
}
