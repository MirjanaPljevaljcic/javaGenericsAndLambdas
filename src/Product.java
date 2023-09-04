public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Inventory<Product> myInventory = new Inventory<>();

        myInventory.addItem(new Product("Product 1", 10.0));
        myInventory.addItem(new Product("Product 2", 20.0));
        myInventory.addItem(new Product("Product 3", 30.0));

        double priceTotal = myInventory.getAllItems().stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

        System.out.println("Total price of all products: " + priceTotal);
    }
}

