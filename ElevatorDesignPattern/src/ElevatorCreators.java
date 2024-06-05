import java.util.ArrayList;
import java.util.List;

public class ElevatorCreators {
    static List<Controller> elevatorsControllersList = new ArrayList<>();
    static LiftStrategy liftStrategy = new oddEvenStrategy();
    static {
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id = 1;
        Controller controller1 = new Controller(elevatorCar1, liftStrategy);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar2.id = 2;
        Controller controller2 = new Controller(elevatorCar2, liftStrategy);

        elevatorsControllersList.add(controller1);
        elevatorsControllersList.add(controller2);

    }
}
