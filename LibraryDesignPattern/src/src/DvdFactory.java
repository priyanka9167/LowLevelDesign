import java.util.ArrayList;
import java.util.Date;

public class DvdFactory extends ItemFactoryManager {

    private ArrayList<DVD> dvdArrayList = new ArrayList<>();

    public DvdFactory() {
    }

    @Override
    public Item createItem(Item item) {
        DVD dvd = new DVD(item.getId(),item.getName(),item.getType());
        addItem(dvd);
        System.out.println(dvd);
        return dvd;
    }

    @Override
    public void addItem(Item item) {
        DVD dvd = new DVD(item.getId(),item.getName(),item.getType());
        this.dvdArrayList.add(dvd);
    }

    @Override
    boolean assignItem(User user, Item item) {
        if(item.isFree() && item.getUser() == null){
            item.setFree(true);
            item.setUser(user);
            item.setAssignDate(new Date());
            return true;
        }
        return false;
    }

}
