package basic;

import java.awt.*;
import java.awt.event.*;

public class Face {
  public static void main(String[] args) {
    new Face();
  }

  Face() {
    FaceFrame f = new FaceFrame();
    f.setSize(800, 800);
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    f.setVisible(true);
  }

  // ここから上は、当面、意味を考えないこととする。
// 下では、オブジェクトを作るので、メソッドにstaticが入らない
//
  class FaceFrame extends Frame {

    int w;
    int h;
    int xStart;
    int yStart;

    public void paint(Graphics g) {
      // この中には、g.drawLine というのは入ってこない
      // Graphicsクラス(型のようなもの---今は--)のgという変数はメソッドに渡す
      w = 200;
      h = 200;
      xStart = 50;
      yStart = 50;

      drawRim(g);
      drawBrow(g, 30);
      //drawEye(g, 10);
      drawNose(g, 40);
      drawMouth(g, 100);
    }

    public void drawRim(Graphics g) {  // wが横幅、hが縦幅
      g.drawLine(50, 50, 50 + w, 50);
      g.drawLine(50, 50, 50, 50 + h);
      g.drawLine(50, 50 + h, 50 + w, 50 + h);
      g.drawLine(50 + w, 50, 50 + w, 50 + h);
    }

    public void drawBrow(Graphics g, int bx) { // xは目の幅 呼ばれる方(=定義する方)

    }

    public void drawNose(Graphics g, int nx) { // xは鼻の長さ

    }

    public void drawMouth(Graphics g, int mx) { // xは口の幅
      int xMiddle = 50 + w / 2;
      int yMiddle = 50 + h - 20;
      g.drawLine(xMiddle - mx / 2, yMiddle, xMiddle + mx / 2, yMiddle);
    }

    public void drawEye(Graphics g, int r) { // rは目の半径
      g.drawOval(xStart + 45, yStart + 65, r, r);

    }

  }


}
