import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongDivTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {1, 0, 0},
            {169, 13, 13},
            {-50, -10, 5},
            {-100, 25, -4},
            {1, -1, -1},
            {1, 3, 0}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longDivTest(long a, long b, long result) {
    Assert.assertEquals(calculator.div(a, b), result);
  }
}
