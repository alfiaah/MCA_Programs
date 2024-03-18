import java.io.*;
class Person{
    int age;
    String name;
    public Person() {
	age = 0;
	name = "";
    }
    public Person(int a,String n) {
	age = a;
	name = n;
    }
    public void disp()
    {
        System.out.println("Name :  " + name + " Age :" + age);
    }
}
class Teacher extends Person{
    String subj;
    public Teacher(int a,String n,String s)
    {
	super(a,n);
	subj = s;
    }
    public void disp()
    {
        super.disp();
        System.out.println("Subject : " + subj);
    }
}
public class supr
{
	public static void main(String[] args) {
		Person p;
		Teacher t,s;
		p = new Person(25,"sss");
		t = new Teacher(35,"ddd","cs");
		s = new Teacher();
		p.disp();
		t.disp();
	}
}