import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSubTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {1.01, 2.01, -1},
            {0.0, 0, 0.0},
            {-50852.252, -23.23, -50829.022},
            {-1.0, 2.5, -3.5},
            {0.1, -0.1, 0.2}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleSubTest(double a, double b, double result) {
    Assert.assertEquals(calculator.sub(a, b), result, 0.001);
  }
}
