import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void takesDrink() {
        assertEquals(90, waterbottle.takeDrink());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, waterbottle.emptyBottle());
    }

    @Test
    public void refillBottle() {
        assertEquals(100, waterbottle.refillBottle());
    }
}
