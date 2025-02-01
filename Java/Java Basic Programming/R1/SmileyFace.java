import java.awt.*;
import javax.swing.JFrame;

public class SmileyFace extends Canvas {

    public void paint(Graphics g) {
        // Draw the face (yellow circle)
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 300, 300); // (x, y, width, height) - a large yellow circle

        // Draw the eyes (two small blue circles)
        g.setColor(Color.blue);
        g.fillOval(170, 180, 50, 50);  // Left eye
        g.fillOval(280, 180, 50, 50);  // Right eye

        // Draw the mouth (red arc for smile)
        g.setColor(Color.red);
        g.drawArc(180, 250, 140, 80, 0, -180); // (x, y, width, height, startAngle, arcAngle)

        // Optional: Add a grid to help with alignment
        g.setColor(Color.black);
        g.setFont(new Font(null));
        for (int X = 0; X < 800; X += 50)
            g.drawString(String.valueOf(X), X, 50);
        for (int Y = 100; Y < 600; Y += 50)
            g.drawString(String.valueOf(Y), 28, Y);

        g.setColor(Color.lightGray);
        for (int X = 0; X < 800; X += 50)
            g.drawLine(X, 0, X, 599);  // vertical lines
        for (int Y = 0; Y < 600; Y += 50)
            g.drawLine(0, Y, 799, Y);  // horizontal lines
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Smiley Face");
        win.setSize(800, 600); // Window size
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmileyFace canvas = new SmileyFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
