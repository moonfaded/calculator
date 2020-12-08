import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSumTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {0, 0, 0},
            {5252, 2323, 7575},
            {-25, -10, -35},
            {-10, 25, 15},
            {2, -8, -6}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longSumTest(long a, long b, long result) {
    Assert.assertEquals(calculator.sum(a, b), result);
  }
}
