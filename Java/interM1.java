import java.io.*;
interface i1
{
	public void disp();
	public void print();
}
class c1 implements i1
{
	public void disp() 
	{
		System.out.println("interface disp");
	}
	public void print()
	{
		System.out.println("interface print");
	}
	public void draw()
	{
		System.out.println("Draw not in interface");
	}
}
class interM1
{
	public static void main(String args[])
	{
		i1 obj = new i1();
		obj.disp();
		obj.print();
		obj.draw();
	}
}