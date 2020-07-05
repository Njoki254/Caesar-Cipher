
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;


public class DecoderTest {
    static Decoder decoded = new Decoder();

    //need to set before getting below in the last few tests of getmethods
    static {
        decoded.setMessage("Decode me");
        decoded.setShiftyBy(4);
    }

    @Test
    public void ValidateInput_validationTestForUserInput() {

        assertEquals("It's working", decoded.ValidateUserInput(4));

    }

    @Test
    public void testCalculateLength() {
        int message = 7;
        assertEquals(new Integer(message), decoded.calculateLength("message"));
    }

    @Test
    public void testShiftAndDecode() {

        assertEquals("Yzxjyz0hz", decoded.shiftandDecodeCharacters("Decode me", 5));


    }

    @Test
    public void testGetmessage() {
        assertEquals("Decode me", decoded.getMessage());
    }

    @Test
    public void testGetShiftBy() {
        assertEquals(4, decoded.getShiftBy());
    }
}




