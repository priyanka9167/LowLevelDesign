import java.util.List;

public class InternalButton {
    InternalButtonDispatcher dispatcher = new InternalButtonDispatcher();
    int[] availableButtons = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int buttonsSelected;

    public void pressButton(int destination, ElevatorCar elevatorCar){
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}
