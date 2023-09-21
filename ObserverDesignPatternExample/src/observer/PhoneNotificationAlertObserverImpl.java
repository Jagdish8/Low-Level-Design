package observer;

import observable.StockObservable;

public class PhoneNotificationAlertObserverImpl implements NotificationAlertObserver {

    String phoneNumber;
    StockObservable stockObservable;

    public PhoneNotificationAlertObserverImpl(String phoneNumber, StockObservable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Text sent to " + this.phoneNumber);
    }
}
