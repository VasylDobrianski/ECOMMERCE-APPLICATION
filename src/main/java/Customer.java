import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id;
    private String userName;
    private String email;
    private List<Address> address;

    //overloaded constructors due to the need for two options


    //type name;
    //class=Address name=Address

    //ArrayList<Address> abc = new ArrayList<>();
    //List preferred - polymorphism
    //Always put interface portion - Interface abc = new Class(); ---> polymorphism


    public Customer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }


    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }
}
