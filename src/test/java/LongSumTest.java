import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSumTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {5, 4, 9}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longSumTest(long a, long b, long result) {
    Assert.assertEquals(calculator.sum(a, b), result);
  }
}
