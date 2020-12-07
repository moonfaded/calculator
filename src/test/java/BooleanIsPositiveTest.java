import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BooleanIsPositiveTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {5}
    };
  }

  @Test(dataProvider = "TestData", groups = "Math")
  public void booleanIsPositive(long a) {
    Assert.assertTrue(calculator.isPositive(a));
  }
}
