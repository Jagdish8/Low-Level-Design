package Observer;

import Observable.StockObservable;

public class MessageNotificationAlertObserver implements NotificationAlertObserver {

    public String name;
    public StockObservable stockObservable;

    public MessageNotificationAlertObserver(String name, StockObservable stockObservable) {
        this.name = name;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        this.sendMessage();
    }

    private void sendMessage() {
        System.out.println("Text sent to " + this.name);
    }

}
