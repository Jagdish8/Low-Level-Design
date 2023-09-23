package base;

public abstract class Beverage {
    public String description = "unknown description";

    public String getDescription() {
        return description;
    }

    public abstract int cost();

}
