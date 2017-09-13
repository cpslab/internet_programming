package chap01;

public class If02Grading {
  public static void main(String[] args) {
    int score = 78;
    // int score = 50;

    String grade = "S";

    if (score < 60) {
      grade = "D";
    } else if (score < 70) {
      grade = "C";
    } else if (score < 80) {
      grade = "B";
    } else if (score < 90) {
      grade = "A";
    }
    System.out.println(grade);
  }
}
