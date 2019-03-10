import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    private Product product;

    @Before
    public void setUp(){ product = new Product("Name",10); }

    @Test
    public void getPrice(){
        assertEquals(10, product.getPrice(),0);
    }
    @Test
    public void getName() {
        assertEquals("Name",product.getName());
    }

    @Test (expected = IllegalArgumentException.class)
    public void setWrongPrice() {
        product.setPrice(-5);
    }

    @Test  (expected = IllegalArgumentException.class)
    public void setWrongName() {
        product.setName("");
    }
}