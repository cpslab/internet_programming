package chap01;

import java.util.Scanner;

public class If03Input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("点数を入力してください。");
    int point = sc.nextInt(); // 入力受け取り

    String resultText = isPassing(point) ? "合格" : "不合格"; // 三項演算子
    System.out.println(resultText);
  }

  static boolean isPassing(int point) {
    return point >= 80;
  }

}
