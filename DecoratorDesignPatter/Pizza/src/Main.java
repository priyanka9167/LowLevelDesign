public class Main {
    public static void main(String[] args) {
       BasePizza veggiePizza = new Veggie();
       BasePizza extraCheese = new ExtraCheese(veggiePizza);
       System.out.println("The cost of" +extraCheese.toString()+ "is " +extraCheese.cost());


    }
}