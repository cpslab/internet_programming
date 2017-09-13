package chap01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

// 余裕がある人向け
public class If05ExPassword {

  static class UserManager {
    void registerPassword(String pwd) throws ShortPasswordException, NoAlphabetException, NoNumberException {
      // チェック
      if (!isEnoughLength(pwd)) {
        throw new ShortPasswordException();
      }
      if (!isContainsAlphabet(pwd)) {
        throw new NoAlphabetException();
      }
      if (!isContainsNumber(pwd)) {
        throw new NoNumberException();
      }
      // ユーザ情報登録等
      // ...
    }

    static boolean isEnoughLength(String str) {
      return str.length() >= 8;
    }

    static boolean isContainsNumber(String str) {
      return str.matches(".*[0-9].*");
    }

    static boolean isContainsAlphabet(String str) {
      return str.matches(".*[a-zA-Z].*");
    }

    class ShortPasswordException extends Exception {
    }

    class NoNumberException extends Exception {
    }

    class NoAlphabetException extends Exception {
    }

  }

  public static void main(String[] args) {
    UserManager um = new UserManager();
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("Register password \n>");
      String pwd = sc.next();

      try {
        um.registerPassword(pwd);
        System.out.println("Success!");
        break;
      } catch (UserManager.ShortPasswordException e) {
        System.out.println("8文字以上にしてください。");
      } catch (UserManager.NoAlphabetException | UserManager.NoNumberException e) {
        System.out.println("英字と数字を少なくとも１つずつ混ぜてください。");
      }
    };
  }
}
