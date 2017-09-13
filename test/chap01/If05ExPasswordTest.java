package chap01;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class If05ExPasswordTest {

  If05ExPassword.UserManager um;

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    um = new If05ExPassword.UserManager();
  }

  @Test
  public void testRegisterPasswordFailed1() throws Exception {
    exception.expect(If05ExPassword.UserManager.NoAlphabetException.class);
    um.registerPassword("111122223333");
  }

  @Test
  public void testRegisterPasswordFailed2() throws Exception {
    exception.expect(If05ExPassword.UserManager.NoNumberException.class);
    um.registerPassword("hissenzamaxa");
  }

  @Test
  public void testRegisterPasswordFailed3() throws Exception {
    exception.expect(If05ExPassword.UserManager.ShortPasswordException.class);
    um.registerPassword("aA0#!");
  }

  @Test
  public void testRegisterPasswordSucecss() throws Exception {
    um.registerPassword("aaaa1111");
    um.registerPassword("N-ZAP85-Great");
  }
}