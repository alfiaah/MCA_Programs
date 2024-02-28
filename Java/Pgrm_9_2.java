class employee
{
  public void display()
  {
   System.out.println("name of class is employee");
  }
  public void calcsalary()
  {
   System.out.println("salary is 10000");
  }
 
}
class engineer extends employee
{
 public void display()
 {
  super.display();
  System.out.println("name of the class is engineer");
 }
  public void calcsalary()
  { 
   super.calcsalary();
  System.out.println("salary is 20000");
  }
}
class Pgrm_9_2
 {
  public static void main(String args[])
  {
   engineer c1=new engineer();
   c1.display();
   c1.calcsalary();
  }
}