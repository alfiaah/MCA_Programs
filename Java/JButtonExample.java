import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends JFrame implements ActionListener {
    JButton b1, b2, b3;

    public ButtonDemo() {
        super("Button Demo...");

        b1 = new JButton("Ok");
        b2 = new JButton("Cancel");
        b3 = new JButton("Exit");

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            System.out.println("Button Pressed is Ok");
        } else if (ae.getSource() == b2) {
            System.out.println("Button Pressed is Cancel");
        } else {
            System.exit(0);
        }
    }
}

public class JButtonExample {
    public static void main(String args[]) {
        new ButtonDemo();
    }
}
