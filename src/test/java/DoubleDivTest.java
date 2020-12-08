import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DoubleDivTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {0.0, 0, NaN},
            {500.25, 23.0, 21.75},
            {-2.5, -1.0, 2.5},
            {-1.0, 2.5, -0.4},
            {0.01, -0.001, -10}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleDivTest(double a, double b, double result) {
    Assert.assertEquals(calculator.div(a, b), result, 0.001);
  }
}
