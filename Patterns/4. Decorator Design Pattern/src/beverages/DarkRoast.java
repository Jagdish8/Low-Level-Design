package beverages;

import base.Beverage;

public class DarkRoast extends Beverage {

    DarkRoast() {
        description = "DARK ROAST";
    }

    @Override
    public int cost() {
        return 10;
    }

}
