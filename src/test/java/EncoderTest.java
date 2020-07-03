
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;


public class EncoderTest {
    Encoder encoded = new Encoder();

    @Test
    public void ValidateInput_validationTestForUserInput(){

        assertEquals("It's working", encoded.ValidateUserInput("",4));

    }
    @Test
    public void testCalculateLength(){
        int message = 7;
        assertEquals(new Integer(message),encoded.calculateLength("message"));
    }
    @Test
    public void testShiftAndEncode(){

        assertEquals("Ijhtij0rj",encoded.shiftandEncodeCharacters("Decode me", 5) );


    }
    @Test
    public void testGetmessage(){
        assertEquals("Encode me", encoded.getMessage("Encode me"));
    }

    @Test
    public void testGetShiftBy(){
        assertEquals(0, encoded.getShiftBy(5));
    }
    @Test
    public void testGetEncryptedTest(){
        assertEquals("Ijhtij0rj", encoded.getEncryptedText("encode me"));
    }


}