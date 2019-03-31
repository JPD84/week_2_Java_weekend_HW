package Instruments;

import Shop.ISell;

public abstract class InstrumentAbstractClass implements ISell, IPlay {

    private String type;
    private double costBought;
    private double costSold;

    public InstrumentAbstractClass(String type, double costBought, double costSold){
        this.type = type;
        this.costSold = costSold;
        this.costBought = costBought;
    }

    public String getType(){
        return type;
    }

    public String setType(String type){
        this.type = type;
        return type;

    }

    public double getCostBought() {
        return costBought;
    }

    public void setCostBought(double costBought) {
        this.costBought = costBought;
    }

    public double getCostSold() {
        return costSold;
    }

    public void setCostSold(double costSold) {
        this.costSold = costSold;
    }
}
