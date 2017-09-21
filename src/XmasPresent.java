import java.io.Serializable;


public class XmasPresent implements Serializable {

  String message = "クリスマスおめでとうｗ(^ ^)w";
  String present = "中身はないよー";
  String from = "X氏";

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPresent() {
    return present;
  }

  public void setPresent(String present) {
    this.present = present;
  }


}
