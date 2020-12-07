import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSubTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {5.2, 4.6, 0.6}
    };
  }

  @Test(dataProvider = "TestData", groups = "Math")
  public void doubleSubTest(double a, double b, double result) {
    Assert.assertEquals(calculator.sub(a, b), result, 0.001);
  }
}
