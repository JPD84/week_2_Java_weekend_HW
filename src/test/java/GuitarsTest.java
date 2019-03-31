import Instruments.Guitars;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class GuitarsTest {

    Guitars guitars;

    @Before
    public void before(){
        guitars = new Guitars("String instrument", 6, "vibration of strings", 200.5, 240.50);
    }

    @Test
    public void hasType(){
        assertEquals("String instrument", guitars.getType());
    }

    @Test
    public void setType(){
        guitars.setType("Percussion instrument");
        assertEquals("Percussion instrument", guitars.getType());
    }

    @Test
    public void getStringNo(){
        assertEquals(6,guitars.getStringNo());
    }

    @Test
    public void setStringNo(){
        guitars.setStringNo(8);
        assertEquals(8,guitars.getStringNo());
    }

    @Test
    public void getInstrumentSound(){
        assertEquals("vibration of strings",guitars.getInstrumentSound());
    }

    @Test
    public void setInstrumentSound(){
        guitars.setInstrumentSound("vibration of metal plates");
        assertEquals("vibration of metal plates",guitars.getInstrumentSound());
    }

    @Test
    public void getCostBought(){
        assertEquals(200.5,guitars.getCostBought());
    }

    @Test
    public void setCostBought(){
        guitars.setCostBought(210.50);
        assertEquals(210.50,guitars.getCostBought());
    }

    @Test
    public void getCostSold(){
        assertEquals(240.50,guitars.getCostSold());
    }

    @Test
    public void setCostSold(){
        guitars.setCostSold(250.70);
        assertEquals(250.70,guitars.getCostSold());
    }

    @Test
    public void PlaySound() {
        assertEquals("vibration of strings",guitars.instrumentsound());
    }
}
