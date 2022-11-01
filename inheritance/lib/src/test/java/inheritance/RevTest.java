package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RevTest {
    @Test public void testReviewInstantiate() {
        Review testReview = new Review("The possum was divine", "Ruckus P. Morgan", 2);
    }

    @Test
    public void testReviewToString() {
        Review testReview = new Review("The frog soup was hoppin'", "Big Jones", 2);

        assertEquals("Should be: Big Jones, 2, The frog soup was hoppin'",
                "Big Jones, 2, The frog soup was hoppin'",
                testReview.toString()
        );
    }
}
