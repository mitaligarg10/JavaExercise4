import com.stackroute.pe4.TransposeString;
import org.junit.*;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString = null;
    }

    @Test
    public void transpose() {
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String actual = transposeString.getTranspose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected, actual);
    }

    @Test
    public void transposeNull() {
        String actual = transposeString.getTranspose("");
        assertNull(actual);
    }

    @Test
    public void transposeNotNull() {
        String actual = transposeString.getTranspose("a quick brown fox jumps over the lazy dog");
        assertNotNull(actual);
    }

}
