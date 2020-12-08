import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSumTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {0.0, 0, 0.0},
            {500.252, 23.23, 523.482},
            {-2.5, -1.0, -3.5},
            {-1.0, 2.5, 1.5},
            {0.1, -0.3, -0.2}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void doubleSumTest(double a, double b, double result) {
    Assert.assertEquals(calculator.sum(a, b), result, 0.001);
  }
}
