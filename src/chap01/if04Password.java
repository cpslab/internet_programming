package chap01;

import java.util.Scanner;

public class if04Password {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Register password \n>");
      String pwd = sc.next();

      // 8文字以上であるか
      if (pwd.length() < 8) {
        System.out.println("8文字以上にしてください。");
        continue;
      }

      // 英数字を両方含んでいるか
      if (!pwd.matches(".*[0-9].*") || !pwd.matches(".*[a-zA-Z].*")) {
        System.out.println("英字と数字を少なくとも１つずつ混ぜてください。");
        continue;
      }
      break;
    }
    System.out.printf("Success!");
  }
}
