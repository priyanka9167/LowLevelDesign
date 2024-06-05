public class Books extends Item{
    int price = 20;

    public Books(int id, String name, ItemType type){
        super(id, name, type);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", isFree=" + isFree +
                ", user=" + user +
                ", price=" + price +
                '}';
    }
}
