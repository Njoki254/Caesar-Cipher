
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;


public class EncoderTest {
    static Encoder encoded = new Encoder();

    //need to set before getting below in the last few tests of getmethods
    static {
        encoded.setMessage("Decode me");
        encoded.setShiftyBy(4);
    }

    @Test
    public void ValidateInput_validationTestForUserInput() {

        assertEquals("It's working", encoded.ValidateUserInput(4));

    }

    @Test
    public void testCalculateLength() {
        int message = 7;
        assertEquals(new Integer(message), encoded.calculateLength("message"));
    }

    @Test
    public void testShiftAndDecode() {

        assertEquals("Yzxjyz0hz", encoded.shiftandEncodeCharacters("Decode me", 5));


    }

    @Test
    public void testGetmessage() {
        assertEquals("Decode me", encoded.getMessage());
    }

    @Test
    public void testGetShiftBy() {
        assertEquals(4, encoded.getShiftBy());
    }
}