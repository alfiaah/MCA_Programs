import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample
{
    public static void main(String args[])
    {
        Frame f=new Frame("BorderLayoutExample");

        Panel p=new Panel();
        p.setLayout(new BorderLayout());

        Button nb=new Button("North");
        Button sb=new Button("South");
        Button eb=new Button("East");
        Button wb=new Button("West");
        Button cb=new Button("Center");

        p.add(nb,BorderLayout.NORTH);
        p.add(sb,BorderLayout.SOUTH);
        p.add(eb,BorderLayout.EAST);
        p.add(wb,BorderLayout.WEST);
        p.add(cb,BorderLayout.CENTER);

        f.add(p);

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