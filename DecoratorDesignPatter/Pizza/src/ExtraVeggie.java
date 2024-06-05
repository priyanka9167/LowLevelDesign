public class ExtraVeggie extends ExtraToppings{

    BasePizza basePizza;
    public ExtraVeggie(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }

    @Override
    public String toString() {
        return "ExtraVeggie{" +
                "basePizza=" + basePizza +
                '}';
    }
}
