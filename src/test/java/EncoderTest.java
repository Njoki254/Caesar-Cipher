import org.junit.*;
import static org.junit.Assert.*;

public class EncoderTest {
    Encoder cipher = new Encoder();

    @Test
    public void testEncodeCipher_EncodesStrings(){
        ;
        assertEquals("It's working", cipher.EncodeMessage("",4));

    }

}