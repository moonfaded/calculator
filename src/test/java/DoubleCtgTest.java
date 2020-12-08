import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

public class DoubleCtgTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {-(Math.toRadians(45)), -1},
            {Math.toRadians(90), 0},
            {Math.toRadians(315), -1},
            {Math.toRadians(630), 0},
            {Math.PI, POSITIVE_INFINITY},
            {NaN, NaN},
            {-0, -0}
    };
  }

  @Test(dataProvider = "TestData")
  public void doubleCtgTest(double a, double result) {
    Assert.assertEquals(calculator.ctg(a), result, 0.001);
  }
}
