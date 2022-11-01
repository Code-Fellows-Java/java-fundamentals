package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResTest {
    @Test
    public void testRestaurantInstantiate() {
        Restaurant restaurant = new Restaurant("Mama Voudon's Hamburger Bar.", 4);
    }

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Nick's Pizza Canyon.", 2);

        assertEquals("Beautiful eatery with high-class salami, rating: 4, price list: 2, 0 reviews.",
                "Nick's Pizza Canyon., 0 average rating, 2 price list, 0 reviews.",
                restaurant.toString()
        );
    }

    @Test
    public void testRestaurantAddReview() {
        Restaurant restaurant = new Restaurant("Big Copper's Bolognese.", 3);
        Review testReview = new Review("Tasty meats, and sweet treats", "Frank Zappa", 4);

        restaurant.addReview(testReview);
    }

}
