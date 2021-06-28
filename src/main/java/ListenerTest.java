import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

    @Override
    public void onTestStart (ITestResult result) {
        System.out.println("Test started");
    }
    @Override
    public void onTestSuccess (ITestResult result) {
        System.out.println("Successful running");
    }
    @Override
    public void onTestFailure (ITestResult result) {
        System.out.println("Test is fell down");
    }
    @Override
    public void onTestSkipped (ITestResult result) {
        System.out.println("Test was skipped");
    }

}
