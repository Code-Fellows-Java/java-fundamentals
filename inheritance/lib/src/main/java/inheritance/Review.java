package inheritance;

public class Review {
    private String body;
    private String author;
    private int rating;

    public Review(String body, String author, int rating) {
        this.body = body;
        this.author = author;

        if (rating < 0) rating = 0;
        if (rating > 5) rating = 5;
        this.rating = rating;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.author);
        output.append(", ");
        output.append(this.rating);
        output.append(", ");
        output.append(this.body);
        return output.toString();
    }

    public String getBody() { return this.body; }
    public String getAuthor() { return this.author; }

    public int getRating() {
        return this.rating;
    }
}
