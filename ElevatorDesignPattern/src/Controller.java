import java.util.PriorityQueue;

public class Controller {

   PriorityQueue<Integer> upMinPQ;
   PriorityQueue<Integer> downMaxPQ;
   ElevatorCar elevatorCar;

   LiftStrategy liftStrategy;

    public Controller(ElevatorCar elevatorCar, LiftStrategy liftStrategy) {
        this.elevatorCar = elevatorCar;
        this.liftStrategy = liftStrategy;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b - a);
    }

    public void submitExternalRequest(int floor, Direction direction){
        System.out.println("========Controller========");
        System.out.println(direction);
       liftStrategy.strategy(floor,direction);
    }
}
