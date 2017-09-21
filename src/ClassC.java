public class ClassC {

  String name = "classC";
  int value = 100;

  public static void main(String arsg[]) {

    ClassC c = new ClassC();
    System.out.println(c.name);
  }


  ClassC() {
    System.out.println("constractor ClassC");

  }

  public int getValue() {
    return value;
  }

}
