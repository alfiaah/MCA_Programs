import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BoxLayoutExample 
{
    public static void main(String args[])
    {
        Frame f=new Frame();

        Panel p1=new Panel();

        for(int i=0;i<5;i++)
        {
            Button b=new Button("Button : "+(i+1));
            p1.add(b); 
        }

        p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));

        f.add(p1);

        Panel p2=new Panel();

        for(int i=0;i<5;i++)
        {
            Button b=new Button("Button : "+(i+1));
            p2.add(b); 
        }

        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));

        f.add(p2);

        f.setLayout(new GridLayout(2,1)); 

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

    