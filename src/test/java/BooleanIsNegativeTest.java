import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BooleanIsNegativeTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {-5}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void booleanIsNegative(long a) {
    Assert.assertTrue(calculator.isNegative(a));
  }
}
