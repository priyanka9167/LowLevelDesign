public class DVD extends Item{
    int price = 30;

    public DVD(int id, String name, ItemType type){
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
        return "DVD{" +
                "price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", isFree=" + isFree +
                ", user=" + user +
                '}';
    }
}
