package Observer;

import Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver {

    public String emailAddress;
    public StockObservable stockObservable;

    public EmailNotificationAlertObserver(String emailAddress, StockObservable stockObservable) {
        this.emailAddress = emailAddress;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        this.sendMessage();
    }

    private void sendMessage() {
        System.out.println("Email sent to " + this.emailAddress);
    }

}
