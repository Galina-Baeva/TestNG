import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
    @Test
    public void test3 () {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 1, "Good");
        softAssert.assertEquals("abc", "def", "Failed");
        softAssert.assertAll();
    }

}
