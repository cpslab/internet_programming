package testHelper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class JUnitIOTestBase {

  protected ByteArrayOutputStream out = new ByteArrayOutputStream();
  protected StandardInputSnatcher in = new StandardInputSnatcher();

  @BeforeClass
  public static void setUpClass() {
  }

  @AfterClass
  public static void tearDownClass() {
  }

  @Before
  public void before() {
    System.setOut(new PrintStream(out));
    System.setIn(in);
  }

  @After
  public void after() {
    System.setOut(null);
    System.setIn(null);
  }
}
