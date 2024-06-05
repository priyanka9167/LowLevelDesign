package Observable;

import Observer.NotificationObserveAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    public List<NotificationObserveAlert> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationObserveAlert observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserveAlert observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserveAlert observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newstockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = stockCount + newstockCount;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }


}
