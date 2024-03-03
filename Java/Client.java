import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]) throws Exception {
        Socket s=new Socket("localhost",1684);
        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        String str=in.readUTF();
        System.out.println("Server says: "+str);
        out.writeUTF("Bye");
        System.in.read();
    }
}
