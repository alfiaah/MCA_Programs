import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;
    private JPanel lightPanel;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 350);
        setLayout(new BorderLayout());

        // Radio Buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1));
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        add(radioPanel, BorderLayout.WEST);

        // Light Panel
        lightPanel = new JPanel();
        lightPanel.setBackground(Color.LIGHT_GRAY);
        add(lightPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            lightPanel.setBackground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            lightPanel.setBackground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            lightPanel.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrafficLightSimulator simulator = new TrafficLightSimulator();
            simulator.setVisible(true);
        });
    }
}
