import java.util.List;

public class Record {
    long id;
    String  phoneNumber;
    String name;

    public Record (long id, String  phoneNumber, String name ) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.id + ". "+ this.name + " " + this.phoneNumber;
    }
}
