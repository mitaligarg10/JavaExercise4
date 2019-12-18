import com.stackroute.pe4.RegExHarry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegExHarryTest {
    RegExHarry regExHarry;

    @Before
    public void setUp() throws Exception {
        regExHarry = new RegExHarry();
    }

    @After
    public void tearDown() throws Exception {
        regExHarry = null;
    }

    @Test
    public void isHarryHere() {
        boolean expected = true;
        boolean actual = regExHarry.isHarryHere("This is Harry.");
        assertEquals(expected, actual);
    }

    @Test
    public void isHarryHereFailure() {
        boolean expected = false;
        boolean actual = regExHarry.isHarryHere("This is Henry.");
        assertEquals(expected, actual);
    }

    @Test
    public void isHarryHereNotNull() {
        boolean actual = regExHarry.isHarryHere("This is henry.");
        assertNotNull(actual);
    }

    @Test
    public void isHarryHereNull() {
        boolean actual = regExHarry.isHarryHere(null);
        assertNotNull(actual);
    }
}
