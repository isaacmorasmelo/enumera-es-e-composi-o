package entities;


public class orderItem {

    product product = new product();
    private int quantity;

    private double price = product.getPrice();

    public orderItem() {
    }

    public orderItem(entities.product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public entities.product getProduct() {
        return product;
    }

    public void setProduct(entities.product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
