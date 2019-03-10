import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product, Double> products = new HashMap<Product, Double>();

    public Basket() {
    }

    public boolean isProductAlreadyInBasket(Product product) {
        return products.containsKey(product);
    }

    public void addProduct(Product product, double quantity) {
        if (quantity > 0) {
            if (isProductAlreadyInBasket(product)) {
                quantity += products.get(product);
            }
            products.put(product, quantity);
        } else {
            throw new IllegalArgumentException("Ilość nie może być ujemna");
        }
    }

    public void removeProduct(Product product, double quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Ilość nie może być ujemna!");
        } else if (!isProductAlreadyInBasket(product)) {
            System.out.println("Produktu nie ma w koszyku!");
        } else {
            double quantityAfterRemoval = (products.getOrDefault(product, 0.0) - quantity);
            if (quantityAfterRemoval > 0) {
                products.put(product, quantityAfterRemoval);
            } else if (quantityAfterRemoval < 0) {
                throw new IllegalArgumentException("Nie można usunąć więcej produktów niż jest w koszyku!");
            } else {
                products.remove(product);
            }
        }
    }

    public void printBasket() {
        for (Product product : products.keySet()) {
            System.out.println("Produkt: " + product.getName() + " Cena: " + product.getPrice() + "zł Ilość: " + products.get(product));
        }
    }

    public double countBasketValue() {
        double basketValue = 0;
        for (Product product : products.keySet()) {
            basketValue += (product.getPrice() * products.get(product));

        }
        return basketValue;
    }
}