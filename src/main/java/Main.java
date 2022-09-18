import balance.Balance;
import balance.CustomerBalance;
import balance.GiftCardBalance;
import category.Category;
import discount.Discount;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws Exception {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer:");
        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++){
            System.out.println("Type " + i + " for customer: " + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());
        //System.out.println("Customer selected: " + customer.getUserName()); (TEST LINE)

        while (true){

            System.out.println("What would you like to do --> Just type id for selection");

            for (int i = 0; i < prepareMenuOptions().length; i++){
                System.out.println(i + "-" + prepareMenuOptions()[i]);
            }

            int menuSelection = scanner.nextInt();

            switch (menuSelection){
                case 0: //List Categories
                    for (Category category : StaticConstants.CATEGORY_LIST){
                        System.out.println("Category Code:" + category.generateCategoryCode() + " Category Name: " + category.getName());
                    }
                    break;

                case 1: //List Products
                    try {
                        for (Product product : StaticConstants.PRODUCT_LIST){
                            System.out.println("Product Name: " + product.getName() + " Product Category Name: " + product.getCategoryName());
                        }
                    }catch (Exception e){
                        System.out.println("Product could not print because category not found for product name: " + e.getMessage().split(",")[1]);
                    }
                    break;

                case 2: //List Discount
                    for (Discount discount : StaticConstants.DISCOUNT_LIST){
                        System.out.println("Discount Name: " + discount.getName() + " discount threshold amount " + discount.getThresholdAmount());
                    }
                    break;

                case 3: //See Balance
                    CustomerBalance cBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());
                    double totalBalance = cBalance.getBalance()+gBalance.getBalance();
                    System.out.println("Total Balance: " + totalBalance);
                    System.out.println("Customer Balance: " + cBalance.getBalance());
                    System.out.println("Gift Card Balance: " + gBalance.getBalance());

                    break;
                case 4: //Add Balance

                    break;
                case 5: //Place Order

                    break;
                case 6: //See Cart

                    break;
                case 7: //Order Details

                    break;
                case 8: //See Address

                    break;
                case 9: //Close Application

                    break;
            }


        }

    }


    private static CustomerBalance findCustomerBalance(UUID customerId){
        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST){
            if (customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);

        return customerBalance;
    }

    public static GiftCardBalance findGiftCardBalance(UUID customerId){
        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST){
            if (giftCardBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance) giftCardBalance;
            }
        }

        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

        return giftCardBalance;
    }

    private static String[] prepareMenuOptions(){
        return new String[]{"List Categories:","List Products:","List Discount","See Balance","Add Balance","Place Order","See Cart","Order Details","See Address","Close Application"};
    }

}
