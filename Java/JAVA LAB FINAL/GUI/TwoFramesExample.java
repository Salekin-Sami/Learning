import javax.swing.*;

public class TwoFramesExample {
    public static void main(String[] args) {
        JFrame masterFrame = new JFrame("Master Frame");
        masterFrame.setSize(400, 300);
        masterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame tempFrame = new JFrame("Temporary Frame");
        tempFrame.setSize(300, 200);
        tempFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        masterFrame.setVisible(true);
        tempFrame.setVisible(true);
    }
}