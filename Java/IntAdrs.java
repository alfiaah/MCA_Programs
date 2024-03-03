import java.io.*;
import java.net.InetAddress;
public class IntAdrs {
    public static void main (String[] args) throws Exception
    {
    InetAddress ip=InetAddress.getByName("www.google.com");
    System.out.println(ip.getHostName());
    System.out.println(ip.getHostAddress());
    }
}
