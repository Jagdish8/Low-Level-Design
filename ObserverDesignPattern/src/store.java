import Observable.IphoneStockObservable;
import Observable.StockObservable;
import Observer.EmailNotificationAlertObserver;
import Observer.MessageNotificationAlertObserver;
import Observer.NotificationAlertObserver;

public class store {

    public static void main(String args[]) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();
        NotificationAlertObserver emailNotificationAlertObserver = new EmailNotificationAlertObserver("asd@gmail.com", iphoneStockObservable);
        NotificationAlertObserver messageNotificationAlertObserver = new MessageNotificationAlertObserver("name", iphoneStockObservable);

        iphoneStockObservable.add(emailNotificationAlertObserver);
        iphoneStockObservable.add(messageNotificationAlertObserver);

        iphoneStockObservable.setStockCount(10);
    }

}
