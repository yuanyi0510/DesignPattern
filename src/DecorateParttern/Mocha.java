package DecorateParttern;

public class Mocha extends  CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesectrption() {
        return beverage.getDesectrption()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }
}
