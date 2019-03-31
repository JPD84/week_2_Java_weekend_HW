package Instruments ;

public class Pianos extends InstrumentAbstractClass implements IPlay {

    private int stringNo;
    private String instrumentSound;
    private int keys;


    public Pianos( String type, int stringNo, String instrumentSound, int keys, double costBought, double costSold) {
        super(type, costSold, costBought);
        this.stringNo = stringNo;
        this.instrumentSound = instrumentSound;
        this.keys = keys;
    }

    public int getStringNo() {
        return stringNo;
    }

    public void setStringNo(int stringNo) {
        this.stringNo = stringNo;
    }

    public String getInstrumentSound() {
        return instrumentSound;
    }

    public void setInstrumentSound(String instrumentSound) {
        this.instrumentSound = instrumentSound;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String instrumentsound() {
        return this.instrumentSound;
    }
}
