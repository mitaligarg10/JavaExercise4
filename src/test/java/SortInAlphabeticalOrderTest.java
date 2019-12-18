import com.stackroute.pe4.SortInAlphabeticalOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

import static org.junit.Assert.*;

public class SortInAlphabeticalOrderTest {
    SortInAlphabeticalOrder sortInAlphabeticalOrder;

    @Before
    public void setUp() throws Exception {
        sortInAlphabeticalOrder = new SortInAlphabeticalOrder();
    }

    @After
    public void tearDown() throws Exception {
        sortInAlphabeticalOrder = null;
    }

    @Test
    public void sortWordsString_CorrectInput_CorrectOutput() {
        List<String> str = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Coconut", "Litchi", "Mango"));
        assertEquals(str, sortInAlphabeticalOrder.sortWordsString("Litchi Banana Apple Coconut Mango"));
    }

    @Test
    public void sortWordsString_CorrectInput_CorrectOutputFailure() {
        List<String> str = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Coconut", "Mango", "Litchi"));
        assertNotEquals(str, sortInAlphabeticalOrder.sortWordsString("Litchi Banana Apple Coconut Mango"));
        assertNotNull(sortInAlphabeticalOrder.sortWordsString("Litchi Banana Apple Mango Coconut"));
    }

    @Test(expected = InputMismatchException.class)
    public void sortWordsString_InCorrectInput_ThrowsInputMismatchException() {
        sortInAlphabeticalOrder.sortWordsString("");
        sortInAlphabeticalOrder.sortWordsString(null);
    }
}
