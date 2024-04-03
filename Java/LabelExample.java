import java.awt.*;
import java.awt.event.*;

public class LabelExample
{
    public static void main(String args[])
    {
        Frame f=new Frame("Label Example");

        Label label=new Label("Hello World",Label.CENTER);

        f.add(label);

        f.setSize(300,300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}