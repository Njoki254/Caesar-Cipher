
import org.junit.*;
import static org.junit.Assert.*;
import java.lang.*;


public class DecoderTest {
    Decoder decoded = new Decoder();

    @Test
    public void ValidateInput_validationTestForUserInput(){

        assertEquals("It's working", decoded.ValidateUserInput("",4));

    }
    @Test
    public void testCalculateLength(){
        int message = 7;
        assertEquals(new Integer(message),decoded.calculateLength("message"));
    }
    @Test
    public void testShiftAndDecode(){

        assertEquals("Yzxjyz0hz",decoded.shiftandDecodeCharacters("Decode me", 5) );


    }
    @Test
    public void testGetmessage(){
        assertEquals("Decode me", decoded.getMessage("Decode me"));
    }

    @Test
    public void testGetShiftBy(){
        assertEquals(0, decoded.getShiftBy(0));
    }
    @Test
    public void testGetEncryptedTest(){
        assertEquals("Yzxjyz0hz", decoded.getDecryptedText("Decode me"));
    }



}