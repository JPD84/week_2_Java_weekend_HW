package Instruments;

import Shop.ISell;

public class Guitars extends InstrumentAbstractClass implements IPlay, ISell {

    private int stringNo;
    private String instrumentSound;


    public Guitars(String type, int stringNo, String instrumentSound, double costBought, double costSold) {
        super(type, costBought, costSold);
        this.stringNo = stringNo;
        this.instrumentSound = instrumentSound;
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

    public String instrumentsound() {
        return this.instrumentSound;
    }

    public double calculateMarkup() {
        return this.getCostSold() - this.getCostBought();
    }

}




