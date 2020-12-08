import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongMultTest extends AbstractTest{

  @DataProvider(name = "TestData")
  public Object[][] TestData() {
    return new Object[][] {
            {1, 0, 0},
            {0, 0, 0},
            {-5, -10, 50},
            {-10, 25, -250},
            {1, -1, -1}
    };
  }

  @Test(dataProvider = "TestData", groups = {"Math"})
  public void longMultTest(long a, long b, long result) {
    Assert.assertEquals(calculator.mult(a, b), result);
  }
}
