import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DoubleSinTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {Math.toRadians(30), 0.5},
            {Math.toRadians(90), 1},
            {Math.PI, 0},
            {NaN, NaN},
            {Math.toRadians(-0), 0},
            {Math.toRadians(630), -1}
    };
  }

  @Test(dataProvider = "TestData")
  public void doubleSinTest(double a, double result) {
    Assert.assertEquals(calculator.sin(a), result, 0.001);
  }
}
