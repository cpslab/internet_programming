package chap01;

public class If00Base {
  public static void main(String[] args) {
    System.out.printf("if (true)");
    if (true) {
      System.out.printf("True!");
    } else {
      System.out.printf("False");
    }

    System.out.printf("if (false)");
    if (false) {
      System.out.printf("True!");
    } else {
      System.out.printf("False");
    }

    System.out.printf("if (1 == 1)");
    if (1 == 1) {
      System.out.printf("True!");
    } else {
      System.out.printf("False");
    }
  }
}
