import base.Beverage;
import beverages.Espresso;
import condiments.Mocha;
import condiments.Whip;

public class Store {

    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Whip(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }

}
