import com.stackroute.pe4.NumOfOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NumOfOccurrenceTest {
    NumOfOccurrence numOfOccurrence;

    @Before
    public void setUp() throws Exception {
        numOfOccurrence = new NumOfOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        numOfOccurrence = null;
    }

    @Test
    public void charFreqString_CorrectInput_CorrectOutput() {
        assertEquals(10, numOfOccurrence.numOfOccurInString("Java is java again java again", 'a'));
        assertEquals(0, numOfOccurrence.numOfOccurInString("Java is Simple, again simple again", 'z'));
    }

    @Test
    public void charFreqString_CorrectInput_CorrectOutputFailure() {
        assertNotEquals(2, numOfOccurrence.numOfOccurInString("Java is Simple, again simple again", 'z'));
    }

    @Test(expected = InputMismatchException.class)
    public void charFreqString_InCorrectInput_ThrowInputMisMatchException() {
        numOfOccurrence.numOfOccurInString("", 'a');
        numOfOccurrence.numOfOccurInString("Abcd", '\0');
    }
}
