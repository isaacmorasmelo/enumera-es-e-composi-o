import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;

import entities.Order;
import entities.client;
import entities.orderItem;
import entities.product;

public class exercicio_fixação {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat birthDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        client client = new client();
        Order Order = new Order();
        orderItem orderItem = new orderItem();
        product product = new product();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String Email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = birthDate.parse(sc.next());

        System.out.println("Enter order data:");
        orderItem order = new orderItem();

        System.out.println("How many items to this order?");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {
            System.out.printf("Enter %d\n item data:",i);

            System.out.print("Product name: ");
            product.setName(sc.nextLine());

            System.out.print("Product price: ");
            product.setPrice(sc.nextDouble());

            System.out.println("Quantity: ");
            orderItem.setQuantity(sc.nextInt());
        }

        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: ");
        Order.setMoment();
    }
}
