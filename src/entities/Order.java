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

    private List <orderItem> items = new ArrayList<>();
    public Order() {
    }

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

    public void addItem(orderItem item){
        items.add(item);
    }

    public void removeItem(orderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(orderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(Status + "\n");
        sb.append("Client: ");
        sb.append(Client + "\n");
        sb.append("Order items:\n");
        for (orderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price:");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
