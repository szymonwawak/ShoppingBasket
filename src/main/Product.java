public class Product {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Nie można podać ujemnej ceny");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nie można podać pustej nazwy");
        }
    }


}
