public class Main {
    public static void main(String[] args) {

        Item book1 = new Books(1,"book1",ItemType.DRAMA);
        Item book2 = new Books(2,"book2", ItemType.COMEDY);
        Item book3 = new Books(3,"book3", ItemType.FASHION);
        ItemFactoryManager itemFactoryManagerBooks = ItemFactory.getFactory("book") ;
        System.out.println(book1.getPrice());
        itemFactoryManagerBooks.createItem(book1);
        itemFactoryManagerBooks.createItem(book2);
        itemFactoryManagerBooks.createItem(book3);

        Item dvd1 = new DVD(1,"dvd1",ItemType.DRAMA);
        Item dvd2 = new DVD(2,"dvd2", ItemType.COMEDY);
        Item dvd3 = new DVD(3,"dvd3", ItemType.FASHION);
        ItemFactoryManager itemFactoryManagerDvd = ItemFactory.getFactory("dvd");
        itemFactoryManagerDvd.createItem(dvd1);
        itemFactoryManagerDvd.createItem(dvd2);
        itemFactoryManagerDvd.createItem(dvd3);

        Item maga1 = new Magazine(1,"maga1",ItemType.DRAMA);
        Item maga2 = new Magazine(2,"maga2", ItemType.COMEDY);
        Item maga3 = new Magazine(3,"maga3", ItemType.FASHION);
        ItemFactoryManager itemFactoryManagerMaga = ItemFactory.getFactory("magazine");
        itemFactoryManagerMaga.createItem(maga1);
        itemFactoryManagerMaga.createItem(maga2);
        itemFactoryManagerMaga.createItem(maga3);

        User user1 = new User(1,"user1");
        User user2 = new User(2, "user2");

        if (!itemFactoryManagerBooks.assignItem(user1,book1)){
           System.out.println("book not free");
        }

        if (!itemFactoryManagerBooks.assignItem(user2, book1)){
            System.out.println("book not free");
        }







    }
}