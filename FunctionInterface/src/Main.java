public class Main {
    public static void main(String[] args) {

//        lambda function implementation
        FunctionInterface functionInterface = (String val) ->
                System.out.println("Val" + val);

        functionInterface.canFly("hello");

//    Consumer functional interface
        Consumer<String> consumer = (String t) ->
                System.out.println(t);


        consumer.consume("Consumer Interface");

//        supplier interface
        Supplier<String> supplier = () -> "this is the data returing";

        System.out.println(supplier.supply());


//    Predictor interface

        Predictor<String, Integer> predictor = (String t) -> Integer.parseInt(t)+Integer.parseInt(t);
        System.out.println(predictor.predict("2"));

    }
}