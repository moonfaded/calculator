import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSumTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {5.2, 4.6, 9.8}
    };
  }

  @Test(dataProvider = "TestData", groups = "Math")
  public void doubleSumTest(double a, double b, double result) {
    Assert.assertEquals(calculator.sum(a, b), result, 0.001);
  }
}
