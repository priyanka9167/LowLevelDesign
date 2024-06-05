package Observable;

import Observer.NotificationObserveAlert;

public interface StockObservable {
    public void add(NotificationObserveAlert observer);
    public void remove(NotificationObserveAlert observer);
    public void notifySubscribers();

    public void setStockCount(int newStockAdded);
    public int getStockCount();

}
