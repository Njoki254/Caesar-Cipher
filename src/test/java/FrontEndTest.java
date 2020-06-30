import org.junit.*;
import static org.junit.Assert.*;

public class FrontEndTest {
    @Test

    public void runPractice() {
        FrontEnd cipher = new FrontEnd();
        String[] cipher1 = cipher.testPractice();
        assertEquals(new String[]{"The test is working", "Lets proceed"}, cipher1);
    }

}