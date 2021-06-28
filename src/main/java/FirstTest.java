import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {

    @Parameters({"parm"})
    @Test
    public void firstTest (String parm){
        System.out.println("first test " + parm);
    }
}
