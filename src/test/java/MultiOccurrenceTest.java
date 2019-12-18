import com.stackroute.pe4.MultiOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiOccurrenceTest {
    MultiOccurrence multiOccurrence;

    @Before
    public void setUp() throws Exception {
        multiOccurrence = new MultiOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        multiOccurrence = null;
    }

    @Test
    public void occurrenceMatcherString() {
        String expected = "Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29";
        String actual = multiOccurrence.occurrenceMatcher("She sells seashells by the seashore", "se");
        assertEquals(expected, actual);
    }

    @Test
    public void occurrenceMatcherStringNotNull() {
        String actual = multiOccurrence.occurrenceMatcher("She sells seashells by the seashore", "se");
        assertNotNull(actual  );
    }
}
