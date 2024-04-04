import java.lang.*;

class CThread extends Thread 
{
    int n;
    public CThread(int a)
    {
        n=a;
    }
    public void run() 
    {
        try
        {
            int i;
            for(i=n;i>0;i--)
            {
                System.out.println(i);
                if(i==3)
                {
                    stop();
                }
                sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            
        }
    }
}

public class MThread
{
    public static void main(String args[])
    {
        CThread t1=new CThread(10);
        CThread t2=new CThread(15);
        System.out.println("Before Thread");
        t1.start();
        System.out.println("Between Thread");
        t2.start();
        System.out.println("After Thread");
    }
}