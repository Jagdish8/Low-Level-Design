package beverages;

import base.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public int cost() {
        return 20;
    }

}
