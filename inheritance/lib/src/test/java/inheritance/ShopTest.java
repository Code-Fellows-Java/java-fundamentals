package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop newShop;
    Review[] reviews;

    @Before
    public void setNewShop() {
        this.newShop = new Shop("Ape Man's Apothecary", "This Gorilla has gear", 2);
    }
    @Before
    public void setReviews() {
        this.reviews = new Review[5];
        this.reviews[0] = new Review("This place rocks!", "Someone Cool", 4);
        this.reviews[1] = new Review("This place is terrible!", "Someone Bad", 0);
    }
    @Test
    public void testShopToString() {
        assertEquals("Should print out: Ape Man's Apothecary, This Gorilla has gear, 0, 2",
                "Ape Man's Apothecary, This Gorilla has gear, 0, 2",
                this.newShop.toString()
        );
    }

    @Test
    public void testAddReview() {
        this.newShop.addReview(this.reviews[0]);
        assertEquals("Should have average rating of 4",
                4,
                this.newShop.getAvgRat()
        );
        this.newShop.addReview(this.reviews[1]);
        assertEquals("Should have average rating of 2",
                2,
                this.newShop.getAvgRat()
        );
        this.newShop.addReview(this.reviews[2]);
        assertEquals("Should have average rating of 2",
                2,
                this.newShop.getAvgRat()
        );
        this.newShop.addReview(this.reviews[3]);
        assertEquals("Should have average rating of 1",
                1,
                this.newShop.getAvgRat()
        );
        this.newShop.addReview(this.reviews[4]);
        assertEquals("Should have average rating of 2",
                2,
                this.newShop.getAvgRat()
        );
        assertEquals("Should print out: Ape Man's Apothecary, This Gorilla has gear, 2, 2",
                "Ape Man's Apothecary, This Gorilla has gear, 2, 2",
                this.newShop.toString()
        );
    }
}
