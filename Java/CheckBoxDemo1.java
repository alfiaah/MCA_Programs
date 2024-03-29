import java.io.*;
import java.awt.*;
import java.awt.event.*;
class CBD extends Frame implements ActionListener, ItemListener
{
	Button bsel,b3;
	TextField t1;
	Checkbox c1,c2,c3;

	public CBD()
	{
		super("Checkbox Demo....");
		t1 = new TextField(10);
		bsel = new Button("SELECTED");
		b3 = new Button("Exit");
		c1 = new Checkbox(" UG ");
		c2 = new Checkbox(" PG ");
		c3 = new Checkbox(" PhD ");
		setLayout(new FlowLayout());
		add(c1);		
		add(c2);		
		add(c3);		
		add(t1);
		add(bsel);
		add(b3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	
		bsel.addActionListener(this);
		b3.addActionListener(this);
		

		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b3)
		{
			System.exit(0);
		}
		else if(ae.getSource() == bsel)
		{
			String str = "";
			if(c1.getState() == true)
			{
				str = c1.getLabel();
			}
			if(c2.getState() == true)
			{
				str = str + c2.getLabel();
			}
			if(c3.getState() == true)
			{
				str = str + c3.getLabel();
			}
			t1.setText(str);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = "";
		if(ie.getSource() == c1)
		{
			if(c1.getState() == true)
			{
				str = c1.getLabel();
			}
			else
			{
				c2.setState(false);
				c3.setState(false);
			}
		}
		if(ie.getSource() == c2)
		{
			if(c2.getState() == true)
			{
				c1.setState(true);
				str = c1.getLabel() + c2.getLabel();
			}
			else
			{
				c3.setState(false);
			}
		}
		if(ie.getSource() == c3)
		{
			if(c3.getState() == true)
			{
				c1.setState(true);
				c2.setState(true);
				str = c1.getLabel() + c2.getLabel() + c3.getLabel();
			}
		}
		t1.setText(str);
	}
}

class CheckBoxDemo1
{
	public static void main(String args[])
	{
		CBD obj = new CBD();
	}
}