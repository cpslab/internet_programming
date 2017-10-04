package basic;

public class ArrayPractice {
  public static void main(String[] args) {

    int a = 0;
    String b = "hoge";
    boolean c = true;
    int[] intArray = new int[100];

    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = i * 2;
    }

    int sum = 0;
    System.out.println(intArray.length);
    for (int i = 0; i < intArray.length; i++) {
      sum += intArray[i];
    }
    System.out.println(sum);
  }
}
