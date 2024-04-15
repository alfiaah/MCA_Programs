import java.io.*;
import java.awt.*;
import java.awt.event.*;


class TB extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button b1,b2,b3;

	public TB()
	{
		super("Textbox....");
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("Exit");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		setLayout(new FlowLayout());
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(t3);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c=0;
		try
		{
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			if(ae.getSource() == b1)
			{
				c = a + b;
			}
			else if(ae.getSource() == b2)
			{
				c = a- b;
			}
			else 
			{
				System.exit(0);
			}
			t3.setText("" + c);
		}
		catch(Exception e)
		{
		}
	}	
}
class TextBoxExample
{
	public static void main(String args[])
	{
		TB obj = new TB();
		
	}
}