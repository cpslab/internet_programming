package chap01;

import basic.Calc2;
import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import testHelper.JUnitIOTestBase;


public class Calc2Test extends JUnitIOTestBase {
  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Test
  public void run() {
    in.inputln("1");
    in.inputln("2");
    Calc2.main(null);
    Assert.assertThat(out.toString(), Is.is("一つ目の数字は?:" +
            "二つ目の数字は?:" +
            "3\n"));
  }

  @Test
  public void run2() {
    in.inputln("-10");
    in.inputln("100");
    Calc2.main(null);
    Assert.assertThat(out.toString(), Is.is("一つ目の数字は?:" +
            "二つ目の数字は?:" +
            "90\n"));
  }
}