public class ClassA {

  String name = "classA";

  public static void main(String arsg[]) {

    ClassA a = new ClassA();
    System.out.println(a.name);

    InnerClassB b = new InnerClassB();
    System.out.println(b.name);

    ClassC c = new ClassC();
    System.out.println("Class c' value is=" + c.getValue());
  }


  ClassA() {
    System.out.println("constractor ClassA");


  }


  static class InnerClassB {

    String name = "Inner ClassB";

    InnerClassB() {
      System.out.println("constractor ClassB");
    }

  }//inner ClassB end
}
