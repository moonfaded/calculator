import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class DoubleTgTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {Math.PI, 0},
            {Math.toRadians(45), 1},
            {Math.toRadians(90), POSITIVE_INFINITY},
            {NaN, NaN},
            {Math.toRadians(-0), -0},
            {Math.toRadians(405), 1}
    };
  }

  @Test(dataProvider = "TestData")
  public void doubleTgTest(double a, double result) {
    Assert.assertEquals(calculator.tg(a), result, 0.001);
  }
}
