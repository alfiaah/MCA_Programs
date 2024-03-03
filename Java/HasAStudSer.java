import java.io.*;

class Address {
    String no, city, state;

    public Address(String no, String city, String state) {
        this.no = no;
        this.city = city;
        this.state = state;
    }
}

public class HasAStudSer implements Serializable {
    int id;
    String name;
    transient Address address; // Marking Address as transient to avoid serialization

    public HasAStudSer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String args[]) throws Exception {
        Address addr = new Address("123", "City", "State");
        HasAStudSer student = new HasAStudSer(1, "John", addr);

        // Serialization
        FileOutputStream fout = new FileOutputStream("ss.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(student);
        out.flush();
    }
}
