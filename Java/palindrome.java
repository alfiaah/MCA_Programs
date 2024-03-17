import java.io.*;

class palindrome
{
    public static void main(String args[]) throws Exception
    {
        int num,n,rev=0,dig;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no: ");
        num=Integer.parseInt(in.readLine());
        n=num;
        while(n>0)
        {
            dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==num)
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");
    }
}