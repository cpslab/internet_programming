package basic;

// xが7.0以上から9以下ならbig number
// xが4以上から7未満ならmiddle number
// xが1以上から4未満ならsmall numberを表示するプログラムを書け
// xがそれ以外(0.5や9.9や-1.4なら)ならout of scopeと表示するプログラムにせよ。
//
// xはdoubleの実数型とする。
// Double.parseDouble()関数をつかうこと

//public class Kadai2 {
//  public static void main(String[] args) {
//    int x = Integer.parseInt(args[0]);
//    /*以下を改造する。**/
//    System.out.println(x + " is Big Number");
//
//  }
//}

public class Kadai2 {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    /*以下を改造する。**/
    System.out.println(x + " is Big Number");
  }
}
