import java.util.ArrayList;
import java.util.Date;

public class BookFactory extends ItemFactoryManager {

    private int id;
    private String name;
    private ItemType type;

    private ArrayList<Books> booksList = new ArrayList<>();


    public BookFactory() {
    }


    @Override
    public Item createItem(Item item) {
        Books books = new Books(item.getId(),item.getName(),item.getType());
        addItem(books);
        System.out.println(books);
        return books;
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

    @Override
    public void addItem(Item item) {
        Books books = new Books(item.getId(),item.getName(),item.getType());
        this.booksList.add(books);
    }








}
