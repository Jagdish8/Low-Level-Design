package code.model;

import code.enums.City;
import java.util.List;

public class Theatre {

    int theatreId;
    City city;
    List<Screen> screens;

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theaterId) {
        this.theatreId = theaterId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

}
