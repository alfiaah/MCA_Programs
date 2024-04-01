import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample
{
    public static void main(String args[])
    {
        Frame f=new Frame("FlowLayoutExample");

        Panel p=new Panel();
        p.setLayout(new FlowLayout());

        p.add(new Button("b1"));
        p.add(new Button("b2"));
        p.add(new Button("b3"));

        f.add(p);

        f.setSize(300,300);
        f.addWindowListener(new WindowAdapter() {
            
                public void windowClosing(WindowEvent we)
                {
                System.exit(0);
                }
        });
        f.setVisible(true);
    }
}