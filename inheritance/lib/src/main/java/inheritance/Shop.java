package inheritance;

import java.util.ArrayList;

public class Shop {
        private String name;
        private String description;
        private int priceList;
        private int averageRating;
        private int subTotalRating;
        private int numberOfReviews;
        private ArrayList<Review> reviews;

        public Shop(String name, String description, int priceList) {
            this.name = name;
            this.description = description;
            this.priceList = priceList;
            this.averageRating = 0;
            this.subTotalRating = 0;
            this.numberOfReviews = 0;
            this.reviews = new ArrayList<>();
        }

        public int getAvgRat() {
            return this.averageRating;
        }

        public String toString() {
            StringBuilder output = new StringBuilder();

            output.append(this.name);
            output.append(", ");
            output.append(this.description);
            output.append(", ");
            output.append(this.averageRating);
            output.append(", ");
            output.append(this.priceList);

            return output.toString();
        }

        public void addReview(Review review) {
            this.reviews.add(review);
            this.subTotalRating += review.getRating();
            this.numberOfReviews++;
            this.averageRating = this.subTotalRating / this.numberOfReviews;
        }
}
