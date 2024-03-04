import java.io.*;
import java.net.*;

public class UDPServer
{
    public static void main(String args[])throws Exception
    {
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] buffer=new byte[1000];
        DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
        ds.receive(dp);
        System.out.println("From Client: "+(new String(dp.getData())).trim());
        System.out.println("Client Port: "+dp.getPort());
        DatagramPacket reply=new DatagramPacket("From Server Ok".getBytes(),"From Server Ok".length(),dp.getAddress(),dp.getPort());
        ds.send(reply);
    }
}