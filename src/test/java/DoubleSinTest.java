import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSinTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {Math.toRadians(90), 1}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleSinTest(double a, double result) {
    Assert.assertEquals(calculator.sin(a), result, 0.001);
  }
}
