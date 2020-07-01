import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;


public class EncoderTest {
    Encoder cipher = new Encoder();

    @Test
    public void ValidateInput_validationTestForUserInput(){

        assertEquals("It's working", cipher.ValidateUserInput("",4));

    }
    @Test
    public void testCalculateLength(){
        int message = 7;
        assertEquals(new Integer(message),cipher.calculateLength("message"));
    }
    @Test
    public void testShiftAndEncode(){

        assertEquals("Ijhtij0rj",cipher.shiftandEncodeCharacters("Decode me", 5) );


    }


}