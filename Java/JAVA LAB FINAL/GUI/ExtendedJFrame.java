import javax.swing.*;

public class ExtendedJFrame extends JFrame {
    public ExtendedJFrame() {
        setTitle("My First GUI Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ExtendedJFrame frame = new ExtendedJFrame();
        frame.setVisible(true);
    }
}