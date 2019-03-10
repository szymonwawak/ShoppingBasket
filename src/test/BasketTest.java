import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    private Basket basket;
    private Product product1;
    private Product product2;
    private Product product3;

    @Before
    public void setUp(){
        basket = new Basket();
        product1 = new Product("P1",5);
        product2 = new Product("P2",2);
        product3 = new Product("P3",1);
        basket.addProduct(product1,4);
        basket.addProduct(product2,2);
    }
    @Test
    public void isProductAlreadyInBasket() {
        assertFalse(basket.isProductAlreadyInBasket(product3));
    }

    @Test
    public void addProduct() {
        basket.addProduct(product3,5);
        assertTrue(basket.isProductAlreadyInBasket(product3));
    }

    @Test
    public void removeProductTotally() {
        basket.removeProduct(product2,2);
        assertFalse(basket.isProductAlreadyInBasket(product2));
    }

    @Test
    public void countBasketValue() {
        assertEquals(24,basket.countBasketValue(),0);
    }
}