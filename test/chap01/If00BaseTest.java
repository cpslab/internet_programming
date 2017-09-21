package chap01;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class If00BaseTest {
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();


  @Before
  public void before() {
    System.setOut(new PrintStream(out));
  }

  @After
  public void after() {
    System.setOut(null);
  }

  @Test
  public void run() throws Exception {
    If00Base.main(new String[]{});
    Assert.assertThat(out.toString(), Is.is("if (true)\n" +
            "True!\n" +
            "if (false)\n" +
            "False\n" +
            "if (1 == 1)\n" +
            "True!\n"));
  }

}