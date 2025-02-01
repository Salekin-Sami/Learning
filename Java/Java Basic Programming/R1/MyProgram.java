import javax.swing.*;
import java.awt.*;

public class MyProgram{
    public static void main(String[] args){
        MyFrame f = new MyFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("Sami ROCKS!!");
        setSize(300,200);
        setLocation(200,200);

        MyPanel panel = new MyPanel();
        Container cp = getContentPane();
        cp.add(panel);
    }
}

class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Hi I'm Sami!",100,100);
    }
}