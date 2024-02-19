package entities;

import complemento.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus Status;
    private client Client;

    private List <orderItem> Items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, client client) {
        this.moment = moment;
        Status = status;
        Client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return Status;
    }

    public void setStatus(OrderStatus status) {
        Status = status;
    }

    public client getClient() {
        return Client;
    }

    public void setClient(client client) {
        Client = client;
    }

    public List<orderItem> getItems() {
        return Items;
    }

    public void addItem(orderItem item){
        Items.add(item);
    }

    public void removeItem(orderItem item){
        Items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(orderItem item : Items){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(moment).append("\n");
        sb.append("Order status: ");
        sb.append(Status).append("\n");
        sb.append("Client: ");
        sb.append(Client).append("\n");
        sb.append("Order items:\n");
        for (orderItem item : Items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price:");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
