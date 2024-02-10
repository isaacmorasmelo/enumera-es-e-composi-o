import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;

import entities.client;
import entities.orderItem;
import entities.product;

public class exercicio_fixação {
    public static void main(String[] args) {

        SimpleDateFormat birthDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        product pd = new product();
        orderItem orderItem = new orderItem();
        client client = new client();

        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String Email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = birthDate.parse(sc.next());
    }
}
