import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleTgTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {Math.toRadians(180), 1}
    };
  }

  @Test(dataProvider = "TestData", groups = "Math")
  public void doubleTgTest(double a, double result) {
    Assert.assertEquals(calculator.tg(a), result, 0.001);
  }
}
