package chap02;

import basic.Kadai2;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import testHelper.JUnitIOTestBase;


public class Kadai2Test extends JUnitIOTestBase {
  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Test
  public void small() {
    Kadai2.main(new String[]{"1.0"});
    Assert.assertThat(out.toString(), CoreMatchers.containsString("Small"));
  }

  @Test
  public void small2() {
    Kadai2.main(new String[]{"3.99"});
    Assert.assertThat(out.toString(), CoreMatchers.containsString("Small"));
  }


  @Test
  public void middle() {
    Kadai2.main(new String[]{"4.5"});
    Assert.assertThat(out.toString(), CoreMatchers.containsString("Middle"));
  }

  @Test
  public void big() {
    Kadai2.main(new String[]{"7.99"});
    Assert.assertThat(out.toString(), CoreMatchers.containsString("Big"));
  }

  @Test
  public void without() {
    Kadai2.main(new String[]{"0.1"});
    Assert.assertThat(out.toString(), Is.is("out of scope\n"));
  }

  @Test
  public void without2() {
    Kadai2.main(new String[]{"9.1"});
    Assert.assertThat(out.toString(), Is.is("out of scope\n"));
  }

  @Test
  public void without3() {
    Kadai2.main(new String[]{"-10"});
    Assert.assertThat(out.toString(), Is.is("out of scope\n"));
  }
}

