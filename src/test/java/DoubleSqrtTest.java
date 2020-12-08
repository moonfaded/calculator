import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSqrtTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {121, 11}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleSqrtTest(double a, double result) {
    Assert.assertEquals(calculator.sqrt(a), result, 0.001);
  }
}
