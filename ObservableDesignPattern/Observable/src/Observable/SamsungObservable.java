package Observable;

import Observer.NotificationObserveAlert;

import java.util.ArrayList;
import java.util.List;

public class SamsungObservable implements StockObservable {
    public List<NotificationObserveAlert> notifierList = new ArrayList<>();
    public int stockCount;


    @Override
    public void add(NotificationObserveAlert observer) {
        notifierList.add(observer);
    }

    @Override
    public void remove(NotificationObserveAlert observer) {
        notifierList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserveAlert observer: notifierList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        stockCount += newStockAdded;
        if(stockCount > 0){
            notifySubscribers();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
