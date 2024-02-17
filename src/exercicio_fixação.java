
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;

import complemento.OrderStatus;
import entities.Order;
import entities.client;
import entities.orderItem;
import entities.product;


public class exercicio_fixação {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        client client = new client();
        Order order = new Order();
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
        Date birthDate = sdf.parse(sc.next());


        client client1 = new client(name,Email,birthDate);
        System.out.println("Enter order data:");

        sc.nextLine();
        System.out.print("Order status: ");
        String status = sc.nextLine();

        Order Order = new Order(sdf.parse("20/04/2018 11:25:09"), OrderStatus.valueOf(status), client1);

        System.out.println("How many items to this order?");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {

            System.out.printf("Enter %d# item data:\n",i);
            sc.nextLine();

            System.out.print("Product name: ");
            product.setName(sc.nextLine());

            System.out.print("Product price: ");
            product.setPrice(sc.nextDouble());

            System.out.print("Quantity: ");
            orderItem.setQuantity(sc.nextInt());
        }

        System.out.println("ORDER SUMMARY:" + Order.toString());
        System.out.println("Client: " + client.toString());
        System.out.println("Order Items: " + orderItem.toString());

    }
}
