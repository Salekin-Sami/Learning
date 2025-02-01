import javax.swing.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField fahrenheitField = new JTextField(10);
        JTextField celsiusField = new JTextField(10);
        celsiusField.setEditable(false);
        JButton convertButton = new JButton("Convert");

        convertButton.addActionListener(e -> {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusField.setText(String.format("%.2f", celsius));
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Fahrenheit:"));
        frame.add(fahrenheitField);
        frame.add(new JLabel("Celsius:"));
        frame.add(celsiusField);
        frame.add(convertButton);

        frame.setVisible(true);
    }
}