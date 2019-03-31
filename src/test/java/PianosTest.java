import Instruments.Pianos;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianosTest {

    Pianos pianos;

    @Before
    public void before() {
        pianos = new Pianos("Tuned String instrument",230, "Sound of tuned Strings", 88, 2000, 2400);
    }

    @Test
    public void hasType(){
        assertEquals("Tuned String instrument",pianos.getType());
    }

    @Test
    public void setType(){
        pianos.setType("Brass instrument");
        assertEquals("Brass instrument", pianos.getType());
    }

    @Test
    public void getStringNo(){
        assertEquals(230,pianos.getStringNo());
    }

    @Test
    public void setStringNo(){
        pianos.setStringNo(234);
        assertEquals(234,pianos.getStringNo());
    }

    @Test
    public void getKeys(){
        assertEquals(88,pianos.getKeys());
    }

    @Test
    public void setKeys(){
        pianos.setKeys(90);
        assertEquals(90,pianos.getKeys());
    }

    @Test
    public void getInstrumentSound(){
        assertEquals("Sound of tuned Strings",pianos.getInstrumentSound());
    }

    @Test
    public void setInstrumentSound(){
        pianos.setInstrumentSound("Sound of Brass Wind Instrument");
        assertEquals("Sound of Brass Wind Instrument",pianos.getInstrumentSound());
    }

    @Test
    public void getCostBought(){
        assertEquals(2400.00,pianos.getCostBought());
    }

    @Test
    public void setCostSold(){
        pianos.setCostSold(2500.00);
        assertEquals(2500.00,pianos.getCostSold());
    }

    @Test
    public void PlaySound() {
        assertEquals("Sound of tuned Strings",pianos.instrumentsound());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(400,pianos.calculateMarkup(), 0);


    }


}



