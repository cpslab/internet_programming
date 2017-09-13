package chap01;

public class If00Base {
  public static void main(String[] args) {
    System.out.println("if (true)");
    if (true) {
      System.out.println("True!");
    } else {
      System.out.println("False");
    }

    System.out.println("if (false)");
    if (false) {
      System.out.println("True!");
    } else {
      System.out.println("False");
    }

    System.out.println("if (1 == 1)");
    if (1 == 1) {
      System.out.println("True!");
    } else {
      System.out.println("False");
    }
  }
}
