import java.io.*;
import java.net.*;
import java.util.Date;

public class DLInter {
    public static void main(String[] args)throws Exception
    {
        int c;
        URL u=new URL("https://dpvipracollege.in/wp-content/uploads/2023/01/Data-Communications-and-Networking-By-Behrouz-A.Forouzan.pdf");
        URLConnection uc=u.openConnection();
        System.out.println("Date: "+new Date(uc.getDate()));
        System.out.println("Content-type: "+uc.getContentType());
        System.out.println("Expires: "+uc.getExpiration());
        System.out.println("Last Modified: "+uc.getLastModified());
        int len=uc.getContentLength();
        System.out.println("Content length: "+len);
        if(len>0)
        {
            FileOutputStream fout=new FileOutputStream("test.pdf");
            InputStream in=uc.getInputStream();
            int i=0;
            while(((c=in.read())!=-1)&&i<len)
            {
                fout.write((char)c);
                i++;
            }
            in.close();
            fout.close();
        }
        else
        {
            System.out.println("No Content Availale");
        }
           
    }
}
