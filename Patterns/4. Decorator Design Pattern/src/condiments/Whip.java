package condiments;

import base.Beverage;
import condimentDecorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WHIP";
    }

}
