import java.io.*;
class employee
{
 int age,pno,sal;
 String name,address;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            System.out.println("enter the name,age,phnno and address");
            name=dr.readLine();
            age=Integer.parseInt(dr.readLine());
            pno=Integer.parseInt(dr.readLine());
            address=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
void disp()
        {
          System.out.println("name="+name);
          System.out.println("age"+age);
          System.out.println("phone num="+pno);
          System.out.println("address"+address);
         } 
void print(int a)
        {
          sal=a;
          System.out.println("salary="+sal);
          } 
}
class officer extends employee
{
 String specialization;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter specialization");
            specialization=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("specialization="+specialization);

         }
}
class manager extends staff
{
 String dept;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the dept");
            dept=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("dept="+dept);
         }
}
 

 
class Pgrm_9_1
{
public static void main(String args[])
{
  employee e=new employee();
  manager m =new manager();
  officer o=new officer();

  m.read();
  m.disp();
  o.read();
  o.disp();
}
}