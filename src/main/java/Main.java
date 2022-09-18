import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

                    break;
                case 1: //List Products

                    break;
                case 2: //List Discount

                    break;
                case 3: //See Balance

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

    private static String[] prepareMenuOptions(){
        return new String[]{"List Categories:","List Products:","List Discount","See Balance","Add Balance","Place Order","See Cart","Order Details","See Address","Close Application"};
    }

}
