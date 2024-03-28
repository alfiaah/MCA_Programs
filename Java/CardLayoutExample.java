import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample
{
    public static void main(String args[])
    {
        Frame f=new Frame("CardLayoutExample...");

        Panel p=new Panel();
        CardLayout cl = new CardLayout();
        p.setLayout(cl);

        Panel card1=new Panel();
        card1.add(new Label("Card 1 Content"));

        Panel card2=new Panel();
        card2.add(new Label("Card 2 Content"));

        Panel card3=new Panel();
        card3.add(new Label("Card 3 Content"));

        p.add(card1,"Card 1");
        p.add(card2,"Card 2");
        p.add(card3,"Card 3");

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