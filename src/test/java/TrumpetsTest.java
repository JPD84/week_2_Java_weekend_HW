import Instruments.Trumpets;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetsTest {

    Trumpets trumpets;

    @Before
    public void before(){
        trumpets = new Trumpets("wind instrument", 3, "vibrating column of air", 350, 450);
    }

    @Test
    public void hasType(){
        assertEquals("wind instrument",trumpets.getType());
    }

    @Test
    public void setType(){
        trumpets.setType("Percussion instrument");
        assertEquals("Percussion instrument",trumpets.getType());

    }

    @Test
    public void getValveNo(){
        assertEquals(3,trumpets.getValveNo());
    }

    @Test
    public void setValveNo(){
        trumpets.setValveNo(4);
        assertEquals(4, trumpets.getValveNo());
    }

    @Test
    public void getInstrumentSound(){
        assertEquals("vibrating column of air", trumpets.getInstrumentSound());
    }

    @Test
    public void setInstrumentSound(){
        trumpets.setInstrumentSound("Wood chyme");
        assertEquals("Wood chyme",trumpets.getInstrumentSound());
    }

    @Test
    public void getCostBought(){
        assertEquals(350.00,trumpets.getCostBought());

    }

    @Test
    public void setCostBought(){
        trumpets.setCostBought(350);
        assertEquals(350.00,trumpets.getCostBought());
    }

    @Test
    public void getCostSold(){
        assertEquals(450.00,trumpets.getCostSold());
    }

    @Test
    public void PlaySound() {
        assertEquals("vibrating column of air",trumpets.instrumentsound());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100,trumpets.calculateMarkup(), 0);


    }

}
