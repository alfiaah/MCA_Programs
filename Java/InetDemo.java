import java.net.*;

public class InetDemo
{
    public static void main(String args[]) throws Exception
    {
        InetAddress in=InetAddress.getByName("www.rajagiri.edu");
        System.out.println("The InetAddress is: "+in);
        System.out.println("The Host is: "+in.getHostName());
        System.out.println("The Ip is: "+in.getHostAddress());

        //Your System

        InetAddress ind=InetAddress.getLocalHost();
        System.out.println("My InetAddress is: "+ind);
        System.out.println("My Host is: "+ind.getHostName());
        System.out.println("My Ip is: "+ind.getHostAddress());
    }
}