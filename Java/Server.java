import java.io.*;
import java.net.*;

class Server 
{
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(1684);
        Socket s= ss.accept();
        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        out.writeUTF("Welcome Client");
        String str=in.readUTF();
        System.out.println("Client says: "+str);
        System.in.read();
    }
}