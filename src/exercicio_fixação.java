
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

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());


        client client = new client(name, email, birthDate);

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order?");
        int quantity = sc.nextInt();

        for (int i = 1; i <= quantity; i++) {

            System.out.printf("Enter %d# item data:\n", i);
            sc.nextLine();

            System.out.print("Product name: ");
            String Pname = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            product product = new product(Pname, price);

            System.out.print("Quantity: ");
            int Pquantity = sc.nextInt();
            orderItem OrderItem = new orderItem(product, Pquantity, price);
            order.addItem(OrderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
    }
}
