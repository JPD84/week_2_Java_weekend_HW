import Instruments.BassGuitars;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BassGuitarTest {

    BassGuitars bassGuitars;


    @Before
    public void before(){
        bassGuitars = new BassGuitars("String instrument", 4, "vibration of strings", 200.5, 240.50);
    }

    @Test
    public void hasType(){
        assertEquals("String instrument", bassGuitars.getType());
    }

    @Test
    public void setType(){
        bassGuitars.setType("Percussion instrument");
        assertEquals("Percussion instrument", bassGuitars.getType());
    }

    @Test
    public void getStringNo(){
        assertEquals(4,bassGuitars.getStringNo());
    }

    @Test
    public void setStringNo(){
        bassGuitars.setStringNo(8);
        assertEquals(8,bassGuitars.getStringNo());
    }

    @Test
    public void getInstrumentSound(){
        assertEquals("vibration of strings",bassGuitars.getInstrumentSound());
    }

    @Test
    public void setInstrumentSound(){
        bassGuitars.setInstrumentSound("vibration of metal plates");
        assertEquals("vibration of metal plates",bassGuitars.getInstrumentSound());
    }

    @Test
    public void getCostBought(){
        assertEquals(200.5,bassGuitars.getCostBought());
    }

    @Test
    public void setCostBought(){
        bassGuitars.setCostBought(210.50);
        assertEquals(210.50,bassGuitars.getCostBought());
    }

    @Test
    public void getCostSold(){
        assertEquals(240.50,bassGuitars.getCostSold());
    }

    @Test
    public void setCostSold(){
        bassGuitars.setCostSold(250.70);
        assertEquals(250.70,bassGuitars.getCostSold());
    }

    @Test
    public void PlaySound() {
        assertEquals("vibration of strings",bassGuitars.instrumentsound());
    }


    @Test
    public void canCalculateMarkup(){
        assertEquals(40,bassGuitars.calculateMarkup(), 0);


    }

}
