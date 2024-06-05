import java.util.List;

public class ExternalButtonDispatcher {
    public List<Controller> controllerList = ElevatorCreators.elevatorsControllersList;

    public void submitRequest(int floor, Direction direction){
        System.out.println("========ExternalButtonDispatcher========");
        System.out.println(direction);
        for (Controller controller: controllerList){

            int id = controller.elevatorCar.id;
            System.out.println(id);
            if(id%2 == 1 && floor%2==1){
              controller.submitExternalRequest(floor, direction);
            } else if (id%2 == 0 && floor%2 == 0) {
               controller.submitExternalRequest(floor,direction);
            }
        }
    }
}
