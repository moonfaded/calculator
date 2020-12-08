import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongMultTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {5, 4, 20}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longMultTest(long a, long b, long result) {
    Assert.assertEquals(calculator.mult(a, b), result);
  }
}
