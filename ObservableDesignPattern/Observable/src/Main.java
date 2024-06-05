import Observable.IphoneObservable;
import Observable.SamsungObservable;
import Observable.StockObservable;
import Observer.EmailNotificationObserver;
import Observer.MobileNotificationObserver;
import Observer.NotificationObserveAlert;

public class Main {
    public static void main(String[] args){
        StockObservable iphoneStock = new IphoneObservable();
        StockObservable samsungStock = new SamsungObservable();
        NotificationObserveAlert obs1 = new EmailNotificationObserver("xyz1@gmail.com");
        NotificationObserveAlert obs2 = new EmailNotificationObserver("xy@gmail.com");
        NotificationObserveAlert obs3 = new EmailNotificationObserver("priyanka@gmail.com");

        NotificationObserveAlert obsM1 = new MobileNotificationObserver("Priyanka");
        NotificationObserveAlert obsM2 = new MobileNotificationObserver("Darshan");
        NotificationObserveAlert obsM3 = new MobileNotificationObserver("Devrai");



        iphoneStock.add(obs1);
        iphoneStock.add(obsM1);
        iphoneStock.add(obs3);

        samsungStock.add(obsM2);
        samsungStock.add(obs2);
        samsungStock.add(obsM3);




        iphoneStock.setStockCount(10);
        samsungStock.setStockCount(20);
    }
}