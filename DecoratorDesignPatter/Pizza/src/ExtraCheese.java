public class ExtraCheese extends ExtraToppings{
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }

    @Override
    public String toString() {
        return "ExtraCheese{" +
                "basePizza=" + basePizza +
                '}';
    }
}
