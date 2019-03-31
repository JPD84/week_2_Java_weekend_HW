import Instruments.Guitars;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Guitars guitars;


    @Before
    public void before(){
        guitars = new Guitars("String instrument", 6, "vibration of strings", 200.5, 240.50);
        shop = new Shop("Ray's Music Shop");
    }

    @Test
    public void getName(){
        assertEquals("Ray's Music Shop",shop.getName());
    }

    @Test
    public void setName(){
        shop.setName("Jim's Music Shop");
        assertEquals("Jim's Music Shop",shop.getName());
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStockItem(){
        shop.addStock(guitars);
        assertEquals(1,shop.countStock());
    }

    @Test
    public void canRemoveStockItem(){
        shop.addStock(guitars);
        shop.removeStock(guitars);
        assertEquals(0,shop.countStock());
    }

}


