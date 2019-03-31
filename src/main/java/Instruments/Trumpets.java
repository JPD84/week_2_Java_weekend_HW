package Instruments;

public class Trumpets extends InstrumentAbstractClass implements IPlay  {

    private int valveNo;
    private String instrumentSound;


    public Trumpets(String type, int valveNo,String instrumentSound, double costBought, double costSold) {
        super(type, costBought, costSold);
        this.valveNo = valveNo;
        this.instrumentSound = instrumentSound;

    }

    public int getValveNo() {
        return valveNo;
    }

    public void setValveNo(int valveNo) {
        this.valveNo = valveNo;
    }

    public String getInstrumentSound() {
        return instrumentSound;
    }

    public void setInstrumentSound(String instrumentSound) {
        this.instrumentSound = instrumentSound;
    }

    public String instrumentsound() {
        return this.instrumentSound;
    }
}
