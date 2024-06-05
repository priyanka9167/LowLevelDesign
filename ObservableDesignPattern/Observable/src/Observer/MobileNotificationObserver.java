package Observer;

import Observable.StockObservable;

public class MobileNotificationObserver implements NotificationObserveAlert {
    String username;
    StockObservable observable;

    public MobileNotificationObserver(String username){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product in stcok");
    }

    public void sendMsgOnMobile(String username, String msg){
        System.out.println("msg sent to" +username);
    }
}
