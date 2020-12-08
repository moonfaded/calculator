import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongDivTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {24, 4, 6}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longDivTest(long a, long b, long result) {
    Assert.assertEquals(calculator.div(a, b), result);
  }
}
