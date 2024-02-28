import java.io.*;
class staff
{
 int code;
 String name;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            System.out.println("enter the code and name");
            code=Integer.parseInt(dr.readLine());
            name=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
void disp()
        {
          System.out.println("code="+code);
          System.out.println("name="+name);
         }
}
class faculty extends staff
{
 String dept,subj,res;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the dept,subject and research");
            dept=dr.readLine();
            subj=dr.readLine();
            res=dr.readLine();
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
          System.out.println("sub="+subj);
          System.out.println("reasearch="+res);
         }
}
class officer extends staff
{
 String grade;
 int rank;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the rank and grade");
            rank=Integer.parseInt(dr.readLine());
            grade=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("rank="+rank);
          System.out.println("grade="+grade);
         }
}
 
class typist extends staff
{
 String office,speed;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the office and speed");
            office=dr.readLine();
            speed=dr.readLine();
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("office="+office);
          System.out.println("speed="+speed);
         }
}
class permanent extends typist
{
 int salary;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the salary");
            salary=Integer.parseInt(dr.readLine());
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("salary="+salary);
         }
}
class casual extends typist
{
 int dwage;
 void read()
        {
         DataInputStream dr=new DataInputStream(System.in);
         try
           {
            super.read();
            System.out.println("enter the daily wage");
            dwage=Integer.parseInt(dr.readLine());
           }
          catch(Exception e)
           {
             System.out.println(e);
           }
         }
 void disp()
        {
          super.disp();
          System.out.println("daily wage="+dwage);
         }
}
 
class Pgrm_9_3
{
public static void main(String args[])
{
  staff s=new staff();
  faculty f=new faculty();
  officer o=new officer();
  typist t=new typist();
  permanent p=new permanent();
  casual c=new casual();
  f.read();
  f.disp();
  o.read();
  o.disp();
  t.read();
  t.disp();
  p.read();
  p.disp();
  c.read();
  c.disp();
}
}