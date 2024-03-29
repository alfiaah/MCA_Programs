import java.io.*;
import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener
{
    Button b1,b2,b3;
    public ButtonDemo()
    {
        super("Button Demo...");

        b1=new Button("Ok");
        b2=new Button("Cancel");
        b3=new Button("Exit");

        setLayout(new FlowLayout());

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setSize(700,700);
        setVisible(true);
    
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            System.out.println("Button Pressed is Ok");
        }
        else if(ae.getSource()==b2)
        {
            System.out.println("Button Pressed is Cancel");
        }
        else
        {
            System.exit(0);
        }
    }

}

public class ButtonExample
{
    public static void main(String args[])
    {
        ButtonDemo obj=new ButtonDemo();
    }
}