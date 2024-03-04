import java.io.*;
import java.net.*;

public class UDPClient
{
    public static void main(String args[])throws Exception
    {
        DatagramSocket ds=new DatagramSocket();
        byte[] m="Bye".getBytes();
        InetAddress shost=InetAddress.getByName("Localhost");
        DatagramPacket dp=new DatagramPacket(m,3,shost,1234);
        ds.send(dp);
        byte[] buffer=new byte[1000];
        DatagramPacket reply=new DatagramPacket(buffer, buffer.length);
        ds.receive(reply);
        System.out.println("Reply: "+(new String(reply.getData())).trim());   }
}

