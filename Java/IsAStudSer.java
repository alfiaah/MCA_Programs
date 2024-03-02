import java.io.*;
import java.io.Serializable;

class Child implements Serializable
{
    String name;
    Child(String name)
    {
        this.name=name;
    }
}

public class IsAStudSer extends Child 
{
    String address;
    int id;

    public IsAStudSer(String name,String address,int id)
    {
        super(name);
        this.address=address;
        this.id=id;
    }

    public static void main(String args[]) throws Exception
    {
        IsAStudSer s=new IsAStudSer("Alfia","Aluva",006);
        FileOutputStream fout=new FileOutputStream("s.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s);
        out.flush();
    }
    
}
