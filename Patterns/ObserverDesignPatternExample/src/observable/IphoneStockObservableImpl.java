package observable;

import observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {

    List<NotificationAlertObserver> observers;
    int count;

    public IphoneStockObservableImpl() {
        observers = new ArrayList<>();
        count = 0;
    }

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        if(! observers.contains(notificationAlertObserver)) {
            observers.add(notificationAlertObserver);
        }
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update();
        });
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(count == 0) {
            notifyObservers();
        }
        count = count + newStockCount;
    }

    @Override
    public int getStockCount() {
        return count;
    }
}
