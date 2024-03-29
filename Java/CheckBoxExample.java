import java.io.*;
import java.awt.*;
import java.awt.event.*;

class CheckBoxDemo extends Frame implements ActionListener
{
    Button bsel,bexit;
    TextField t1;
    Checkbox c1,c2,c3;

    public CheckBoxDemo()
    {
        super("CheckBox Demo...");
        c1=new Checkbox("SSLC");
        c2=new Checkbox("+2");
        c3=new Checkbox("BCA");
        t1=new TextField(10);
        bsel=new Button("SELECTED");
        bexit=new Button("EXIT");

        setLayout(new FlowLayout());

        add(c1);
        add(c2);
        add(c3);
        add(t1);
        add(bsel);
        add(bexit);

        bsel.addActionListener(this);
        bexit.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bexit)
        {
            System.exit(0);
        }
        else if(ae.getSource()==bsel)
        {
            String str="";
            if(c1.getState()==true)
            {
                str=c1.getLabel();
            }
            if(c2.getState()==true)
            {
                str=str+" "+c2.getLabel();
            }
            if(c3.getState()==true)
            {
                str=str+" "+c3.getLabel();
            }
            t1.setText(str);
        }
    }
}

class CheckBoxExample
{
    public static void main(String args[])
    {
        CheckBoxDemo obj=new CheckBoxDemo();
    }
}