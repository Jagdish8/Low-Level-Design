package observer;

import observable.StockObservable;

public class EmailNotificationAlertObserverImpl implements NotificationAlertObserver {

    public String email;
    public StockObservable stockObservable;

    public EmailNotificationAlertObserverImpl(String e, StockObservable stockObservable) {
        email = e;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to " + this.email);
    }
}
