import java.util.ArrayList;

abstract class ItemFactoryManager {

//    abstract Item findIfAvailable(Item item);
//    abstract ArrayList<Item> getAllItems();



    abstract void addItem(Item item);

    abstract Item createItem(Item item);

    abstract boolean assignItem(User user, Item item);



}
