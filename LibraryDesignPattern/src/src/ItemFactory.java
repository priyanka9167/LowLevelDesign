public class ItemFactory {

    public static ItemFactoryManager getFactory(String choice){
        if(choice.equalsIgnoreCase("book")){
            return new BookFactory();
        } else if (choice.equalsIgnoreCase("dvd")) {
           return  new DvdFactory();
        } else if (choice.equalsIgnoreCase("magazine")) {
            return new MagazineFactory();
        }
        return null;
    }
}
