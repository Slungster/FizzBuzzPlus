import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class HikerTest {

    @Test
    public void mutiple_three_only() {
        assertTrue(Hiker.multipleOrContainsThree(21));
        assertFalse(Hiker.multipleOrContainsFive(21));
    }

    @Test
    public void contains_three_only() {
        assertTrue(Hiker.multipleOrContainsThree(31));
        assertFalse(Hiker.multipleOrContainsFive(31));
    }

    @Test
    public void mutiple_five_only() {
        assertTrue(Hiker.multipleOrContainsFive(25));
        assertFalse(Hiker.multipleOrContainsThree(25));
    }

    @Test
    public void contains_five_only() {
        assertTrue(Hiker.multipleOrContainsFive(52));
        assertFalse(Hiker.multipleOrContainsThree(52));
    }

    @Test
    public void multiple_three_and_five() {
        assertTrue(Hiker.multipleOrContainsFive(60));
        assertTrue(Hiker.multipleOrContainsThree(60));
    }

    @Test
    public void contains_three_and_five() {
        assertTrue(Hiker.multipleOrContainsFive(53));
        assertTrue(Hiker.multipleOrContainsThree(53));
    }

    @Test
    public void multiple_three_and_contains_five() {
        assertTrue(Hiker.multipleOrContainsThree(45));
        assertTrue(Hiker.multipleOrContainsFive(45));
    }

    @Test
    public void multiple_five_and_contains_three() {
        assertTrue(Hiker.multipleOrContainsThree(35));
        assertTrue(Hiker.multipleOrContainsFive(35));
    }

    @Test
    public void no_multiple_or_contains_three_or_five() {
        assertFalse(Hiker.multipleOrContainsThree(11));
        assertFalse(Hiker.multipleOrContainsFive(11));
    }

}
