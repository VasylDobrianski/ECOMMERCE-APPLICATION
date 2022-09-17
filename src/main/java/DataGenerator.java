import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

       public static void createCustomer(){

           Address address1Customer1 = new Address("7925","Jones Branch Dr","Suite 3300","22102","VA");
           Address address2Customer1 = new Address("3990","Raven Dr","Suite 1586","99863","FL");
           Address address1Customer2 = new Address("1586","Bluebird Dr","Suite 8600","99632","IL");

           List<Address> customer1Address1 = new ArrayList<>();

           Customer customer1 = new Customer(UUID.randomUUID(),"ozzy","ozzy@gmail.com",address1Customer1);

        }


    }
}
