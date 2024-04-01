import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample
{
    public static void main(String args[])
    {
        Frame f=new Frame("GridLayoutExample...");

        f.setLayout(new GridLayout(2,3));

        for(int i=1;i<=6;i++)
        {
            Button b=new Button("Button: "+i);
            f.add(b);
        }

        f.setSize(300,300);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}