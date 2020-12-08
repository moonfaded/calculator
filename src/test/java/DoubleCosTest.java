import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DoubleCosTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {NaN, NaN},
            {Math.toRadians(-90), 0},
            {Math.toRadians(60), 0.50},
            {Math.toRadians(720), 1},
            {Math.toRadians(-0), 1}
    };
  }

  @Test(dataProvider = "TestData")
  public void doubleCosTest(double a, double result) {
    Assert.assertEquals(calculator.cos(a), result, 0.001);
  }
}
