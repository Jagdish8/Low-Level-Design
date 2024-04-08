import observable.IphoneStockObservableImpl;
import observable.StockObservable;
import observer.EmailNotificationAlertObserverImpl;
import observer.NotificationAlertObserver;
import observer.PhoneNotificationAlertObserverImpl;

public class Store {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();
        NotificationAlertObserver emailNotificationAlertObserver = new EmailNotificationAlertObserverImpl("asd@gmail.com", iphoneStockObservable);
        NotificationAlertObserver messageNotificationAlertObserver = new PhoneNotificationAlertObserverImpl("name", iphoneStockObservable);

        iphoneStockObservable.add(emailNotificationAlertObserver);
        iphoneStockObservable.add(messageNotificationAlertObserver);

        iphoneStockObservable.setStockCount(10);
    }
}
