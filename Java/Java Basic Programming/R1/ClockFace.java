import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas {

    public void paint(Graphics g) {
        // Draw the clock face (circle)
        g.setColor(Color.black);
        g.drawOval(100, 100, 300, 300); // (x, y, width, height) - a large circle for the clock face

        // Draw the clock hands
        g.setColor(Color.blue);
        // Shorter hand (hour hand)
        g.drawLine(250, 250, 250, 150); // (x1, y1) center, (x2, y2) end of the shorter hand
        g.setColor(Color.red);
        // Longer hand (minute hand)
        g.drawLine(250, 250, 350, 250); // (x1, y1) center, (x2, y2) end of the longer hand

        // Draw numeric labels (12, 3, 6, 9)
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("12", 235, 135);  // Label for 12
        g.drawString("3", 380, 260);   // Label for 3
        g.drawString("6", 245, 385);   // Label for 6
        g.drawString("9", 120, 260);   // Label for 9

        // Optional: Extra labels for all twelve numbers
        g.drawString("1", 325, 160);
        g.drawString("2", 360, 200);
        g.drawString("4", 360, 300);
        g.drawString("5", 325, 340);
        g.drawString("7", 175, 340);
        g.drawString("8", 140, 300);
        g.drawString("10", 140, 200);
        g.drawString("11", 175, 160);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Clock Face");
        win.setSize(500, 500); // Window size
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add(canvas);
        win.setVisible(true);
    }
}
