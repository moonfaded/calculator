import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleDivTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {30, 5, 6}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleDivTest(double a, double b, double result) {
    Assert.assertEquals(calculator.div(a, b), result, 0.001);
  }
}
