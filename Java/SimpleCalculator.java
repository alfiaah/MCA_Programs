import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton equalsButton;
    private JButton clearButton;
    private JPanel panel;

    private double firstNumber;
    private String operator;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(280, 50));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setEditable(false);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        operationButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            operationButtons[i] = new JButton(buttonLabels[i + 12]);
            operationButtons[i].addActionListener(this);
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        for (JButton button : numberButtons) {
            panel.add(button);
        }
        for (JButton button : operationButtons) {
            panel.add(button);
        }
        panel.add(equalsButton);
        panel.add(clearButton);

        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            String secondNumberStr = textField.getText();
            double secondNumber = Double.parseDouble(secondNumberStr);
            double result = 0;
            try {
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        result = firstNumber / secondNumber;
                        break;
                }
                textField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                textField.setText("Error");
            } catch (ArithmeticException ex) {
                textField.setText("Error: " + ex.getMessage());
            }
        } else if (command.equals("C")) {
            textField.setText("");
        } else {
            textField.setText(textField.getText() + command);
        }
        if (!command.equals("=") && !command.equals("C")) {
            operator = command;
            firstNumber = Double.parseDouble(textField.getText());
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
