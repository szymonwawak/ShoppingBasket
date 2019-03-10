public class Main {

    public static void main(String[] args) {

        Basket someBasket = new Basket();

        try {
            Product product1 = new Product("Banany", 3.3);
            Product product2 = new Product("Chipsy", 5);
            Product product3 = new Product("Pasta do zębów", 10);
            Product product4 = new Product("Żel pod prysznic", 10);
            someBasket.addProduct(product1, 6);
            someBasket.addProduct(product2, 4);
            someBasket.addProduct(product3, 1);

            System.out.println("\nWartość koszyka: " + someBasket.countBasketValue() + "\n");
            someBasket.printBasket();

            someBasket.removeProduct(product1, 3);
            someBasket.removeProduct(product3, 1);
            someBasket.removeProduct(product4, 2); //deleting product that is not "inside" basket

            System.out.println("\nWartość koszyka po modyfikacji: " + someBasket.countBasketValue() + "\n");
            someBasket.printBasket();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
