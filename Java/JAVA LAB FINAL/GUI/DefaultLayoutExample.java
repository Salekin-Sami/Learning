import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DefaultLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Default Layout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout()); // Set layout manager

        frame.add(new JLabel("Label"));
        frame.add(new JTextField("TextBox", 20)); // Set preferred width for text field
        frame.add(new JButton("Button"));

        frame.setVisible(true);
    }
}