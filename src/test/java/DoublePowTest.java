import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoublePowTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {4, 2, 16}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doublePowTest(double a, double b, double result) {
    Assert.assertEquals(calculator.pow(a, b), result, 0.001);
  }
}
