import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DoublePowTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {1, 2, 1},
            {0.0, 0, 1},
            {2, -1, 0.5},
            {-1.0, 2, 1},
            {2.5, 3, 15.625},
            {0.0, 1, 0},
            {25, NaN, NaN},
            {NaN, 2, NaN}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doublePowTest(double a, double b, double result) {
    Assert.assertEquals(calculator.pow(a, b), result, 0.001);
  }
}
