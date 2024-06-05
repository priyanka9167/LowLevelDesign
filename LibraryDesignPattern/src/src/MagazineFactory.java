import java.util.ArrayList;
import java.util.Date;

public class MagazineFactory extends  ItemFactoryManager{

    public ArrayList<Magazine> magazineArrayList = new ArrayList<>();

    public MagazineFactory() {
    }

    @Override
    public Item createItem(Item item) {
        Magazine magazine = new Magazine(item.getId(),item.getName(),item.getType());
        addItem(magazine);
        System.out.println(magazine);
        return magazine;
    }

    @Override
    public void addItem(Item item) {
        Magazine magazine = new Magazine(item.getId(),item.getName(),item.getType());
        this.magazineArrayList.add(magazine);
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
