package Observer;

import Observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserveAlert {
        String emailId;
        StockObservable observable;

        public EmailNotificationObserver(String emailId){
            this.observable = observable;
            this.emailId = emailId;
        }

    @Override
    public void update() {
        sendMail(emailId, "product stock up hurry up");
    }

    public void sendMail(String emailId, String msg){

            System.out.println("Email sent to" +emailId);
    }
}
