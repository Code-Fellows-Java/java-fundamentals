package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TheaterTest {
    Theater basicTheater;
    Theater.TheaterReview[] reviews;

    @Before
    public void setUpBasicShop() {
        this.basicTheater = new Theater("Tyrannus's Tyrannical Theater", 2);
    }

    @Before
    public void setReviews() {
        this.reviews = new Theater.TheaterReview[5];
        this.reviews[0] = new Theater.TheaterReview("The walls are oozing something fierce!", "Golam Jamoo", 4);
        this.reviews[1] = new Theater.TheaterReview("The corn wasn't popped!", "Misses Tris Brisses", 0, "Nope");
    }

    @Test
    public void testShopToString() {
        assertEquals("Should print out: Tyrannus's Tyrannical Theater 0 2",
                "Tyrannus's Tyrannical Theater, 0, 2",
                this.basicTheater.toString()
        );
    }

    @Test
    public void testInstanceTheaterReviews() {
        int previousNumber = this.basicTheater.getNumberOfReviews();
        this.basicTheater.addReview(new Theater.TheaterReview("sample review", "Jarl Balgruf", 3));
        assertTrue("Should increment by 1",
                previousNumber == this.basicTheater.getNumberOfReviews() - 1);
        previousNumber++;
        this.basicTheater.addReview(new Theater.TheaterReview("review with a movie title", "LURR From TPOP8", 3, "Big Boy"));
        assertTrue("Should increment by 1",
                previousNumber == this.basicTheater.getNumberOfReviews() - 1);
    }

    @Test
    public void testAddReview() {
        this.basicTheater.addReview(this.reviews[0]);
        assertEquals("Should have average rating of 4",
                4,
                this.basicTheater.getAvgRat()
        );
        this.basicTheater.addReview(this.reviews[1]);
        assertEquals("Should have average rating of 2",
                2,
                this.basicTheater.getAvgRat()
        );
        this.basicTheater.addReview(this.reviews[2]);
        assertEquals("Should have average rating of 2",
                2,
                this.basicTheater.getAvgRat()
        );
        this.basicTheater.addReview(this.reviews[3]);
        assertEquals("Should have average rating of 1",
                1,
                this.basicTheater.getAvgRat()
        );
        this.basicTheater.addReview(this.reviews[4]);
        assertEquals("Should have average rating of 2",
                2,
                this.basicTheater.getAvgRat()
        );
        assertEquals("Should print out: Tyrannus's Tyrannical Theater, 2, 2",
                "Tyrannus's Tyrannical Theater, 2, 2",
                this.basicTheater.toString()
        );
    }

    @Test
    public void testAddMovies() {
        this.basicTheater.addMovie("Big Boy");
        assertEquals("Should print out:Tyrannus's Tyrannical Theater, 0, 2, Big Boy",
                "Tyrannus's Tyrannical Theater, 0, 2, Big Boy",
                this.basicTheater.toString()
        );
    }

    @Test
    public void testRemoveMoviesGood() {
        this.basicTheater.addMovie("Big Boy");
        this.basicTheater.addMovie("MOVIE the Movie");
        this.basicTheater.removeMovie("Big Boy");
        assertEquals("Should print out:Tyrannus's Tyrannical Theater, 0, 2, MOVIE the Movie",
                "Tyrannus's Tyrannical Theater, 0, 2, MOVIE the Movie",
                this.basicTheater.toString()
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveMoviesBad() {
        this.basicTheater.addMovie("Big Boy 1");
        this.basicTheater.addMovie("MOVIE the Movie");
        this.basicTheater.removeMovie("EXCEPTION");
    }
}
