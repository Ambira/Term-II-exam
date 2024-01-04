import models.Tshirt;
import models.Order;
// importing from models

public class Main {
    public static void main(String[] args) {


        //Creating Tshirt Objects
        Tshirt tshirt1 = new Tshirt("Gorkhali Batman", 572, 1235, "Karuna", "\"Graphic text: You either die a hero or live long enough to see yourself be a villain\"", new String[]{"XL", "Medium", "Large"});

        Tshirt tshirt2 = new Tshirt("Madiens", 456, 6481, "Madiens", "\"For and from Madiens\"", new String[]{"Small", "Medium", "Large"});

        Tshirt tshirt3 = new Tshirt("Nepal Flag", 459, 1780, "Weezy", "\"Weezy band!\"", new String[]{"Small", "Medium", "Large"});

        // Describe the T-shirts
        tshirt1.describeTshirt();
        tshirt2.describeTshirt();

        // Creating multiple Order (object)
        Order order1 = new Order("Gopal Sharma", "9886756465",
                new String[]{"572", "681"}, new int[]{1235, 1780});

        Order order2 = new Order("Hari Poudel", "9876543210",
                new String[]{"572"}, new int[]{1235});


        // Printing bill for both orders
        order1.printBill();
        order2.printBill();

    }

}
