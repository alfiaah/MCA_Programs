import java.net.*;

public class UrlCls {
    public static void main(String args[]) throws Exception {
        URL obj = new URL("https://www.unacademy.com");
        System.out.println(obj.getProtocol());
        System.out.println(obj.getHost());
        System.out.println(obj.getPort());
        System.out.println(obj.getFile());
    }
}
