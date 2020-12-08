import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DoubleSqrtTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {1, 1},
            {-2, NaN},
            {144, 12},
            {0.25, 0.5},
            {NaN, NaN},
            {-0, -0}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleSqrtTest(double a, double result) {
    Assert.assertEquals(calculator.sqrt(a), result, 0.001);
  }
}
