import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleCtgTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {Math.toRadians(360), 1}
    };
  }

  @Test(dataProvider = "TestData")
  public void doubleCtgTest(double a, double result) {
    Assert.assertEquals(calculator.ctg(a), result, 0.001);
  }
}
