import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BooleanIsPositiveTest extends AbstractTest{

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
  public void booleanIsPositive(long a) {
    Assert.assertTrue(calculator.isPositive(a));
  }
}
