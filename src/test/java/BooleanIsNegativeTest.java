import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BooleanIsNegativeTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {-1},
            {154},
            {0},
            {-25}
    };
  }

  @Test(dataProvider = "TestData")
  public void booleanIsNegative(long a) {
    Assert.assertTrue(calculator.isNegative(a));
  }
}
