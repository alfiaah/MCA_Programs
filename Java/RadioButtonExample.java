import java.io.*;
import java.awt.*;
import java.awt.event.*;


class RBD extends Frame implements ActionListener
{
	Button bsel,b3;
	TextField t1;
	Checkbox c1,c2,c3;
	
	CheckboxGroup cg;

	public RBD()
	{
		super("Checkbox Demo....");
		t1 = new TextField(10);
		bsel = new Button("SELECTED");
		b3 = new Button("Exit");
		
		cg = new CheckboxGroup();
		
		c1 = new Checkbox(" Male " , cg , true);
		c2 = new Checkbox(" Female ", cg,false);
		c3 = new Checkbox(" TG ", cg,false);
	
		setLayout(new FlowLayout());
		add(c1);		
		add(c2);		
		add(c3);		
		add(t1);
		add(bsel);
		add(b3);

		bsel.addActionListener(this);
		b3.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
        		public void windowClosing(WindowEvent windowEvent){
            			setVisible(false);
				System.exit(0);
         		}
		});

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
				str = c2.getLabel();
			}
			if(c3.getState() == true)
			{
				str = c3.getLabel();
			}
			t1.setText(str);
		}
	}
}
class RadioButtonDemo
{
	public static void main(String args[])
	{
		RBD obj = new RBD();
	}
}