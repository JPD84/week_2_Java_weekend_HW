import Instruments.Trumpets;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetsTest {

    Trumpets trumpets;

    @Before
    public void before(){
        trumpets = new Trumpets("wind instrument", 3, "vibrating column of air", 350.90, 420.50);
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
        assertEquals(350.90,trumpets.getCostBought());

    }

    @Test
    public void setCostBought(){
        trumpets.setCostBought(360.50);
        assertEquals(360.50,trumpets.getCostBought());
    }

    @Test
    public void getCostSold(){
        assertEquals(420.50,trumpets.getCostSold());
    }

    @Test
    public void PlaySound() {
        assertEquals("vibrating column of air",trumpets.instrumentsound());
    }

}
