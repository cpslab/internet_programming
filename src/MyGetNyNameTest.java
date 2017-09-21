import java.net.InetAddress;
import java.net.UnknownHostException;


public class MyGetNyNameTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    try {
      InetAddress address = InetAddress.getByName("www.asahi.com");
      System.out.println(address.getHostAddress());
    } catch (UnknownHostException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }

  }

}
