import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void secondTest (){
        int n=1;
        Assert.assertEquals(n, 1, "False");
        System.out.println("Hi");
    }
}
