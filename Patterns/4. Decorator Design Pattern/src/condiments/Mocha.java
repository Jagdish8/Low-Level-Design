package condiments;

import base.Beverage;
import condimentDecorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MOCHA";
    }

}
