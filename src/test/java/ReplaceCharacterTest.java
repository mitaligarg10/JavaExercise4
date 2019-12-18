import com.stackroute.pe4.ReplaceCharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter;

    @Before
    public void setUp() throws Exception {
        replaceCharacter = new ReplaceCharacter();
    }

    @After
    public void tearDown() throws Exception {
        replaceCharacter = null;
    }

    @Test
    public void replaceChars_CorrectInput_CorrectOuput() {
        assertEquals("faity fry", replaceCharacter.replaceChars("daily dry"));
        assertEquals("ftftftf", replaceCharacter.replaceChars("dldldld"));
    }

    @Test
    public void replaceChars_CorrectInput_CorrectOuputFailure() {
        assertNotEquals("ftry fryqw", replaceCharacter.replaceChars("daily dry"));
        assertNotEquals("ftfggtfww", replaceCharacter.replaceChars("dldldld"));
        assertNotNull(replaceCharacter.replaceChars("UP Bhawan"));
    }

    @Test(expected = InputMismatchException.class)
    public void replaceChars_InCorrectInput_ThrowInputMisMatchException() {
        replaceCharacter.replaceChars("");
        replaceCharacter.replaceChars(null);
    }
}
