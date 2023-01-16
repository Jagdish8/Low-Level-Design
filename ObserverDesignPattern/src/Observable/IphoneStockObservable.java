package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    public List<NotificationAlertObserver> notificationAlertObserverList;
    public int stockCount;

    public IphoneStockObservable() {
        this.notificationAlertObserverList = new ArrayList<>();
        this.stockCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        notificationAlertObserverList.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(this.stockCount == 0) {
            notifyObservers();
        }
        this.stockCount = this.stockCount + newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
