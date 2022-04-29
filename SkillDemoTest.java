import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testStringLength() {
        assertEquals(11, SkillDemo.stringLength("hello there"));// this test will now pass.
    }
}
