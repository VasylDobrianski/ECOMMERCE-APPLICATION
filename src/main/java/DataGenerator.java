import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

       public static void createCustomer(){

           Address address1Customer1 = new Address("7925","Jones Branch Dr","Suite 3300","22102","VA");
           Address address2Customer1 = new Address("3990","Raven Dr","Suite 1586","99863","FL");
           Address address1Customer2 = new Address("1586","Bluebird Dr","Suite 8600","99632","IL");

           List<Address> customer1AddressList = new ArrayList<>();
           customer1AddressList.add(address1Customer1);
           customer1AddressList.add(address2Customer1);

           Customer customer1 = new Customer(UUID.randomUUID(),"ozzy","ozzy@gmail.com",customer1AddressList);
           Customer customer2 = new Customer(UUID.randomUUID(),"mike","mike@gmail.com");

           StaticConstants.CUSTOMER_LIST.add(customer1);
           StaticConstants.CUSTOMER_LIST.add(customer2);

        }

        public static void createCategory(){

            Category category1 = new Electronic(UUID.randomUUID(),"Electronic");
            Category category2 = new Furniture(UUID.randomUUID(),"Furniture");
            Category category3 = new SkinCare(UUID.randomUUID(),"SkinCare");

            StaticConstants.CATEGORY_LIST.add(category1);
            StaticConstants.CATEGORY_LIST.add(category2);
            StaticConstants.CATEGORY_LIST.add(category3);

        }


}
