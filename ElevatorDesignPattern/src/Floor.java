public class Floor {
    int floorNumber;
    ExternalButtonDispatcher externalButtonDispatcher;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }

    public void pressButton(Direction direction){
        System.out.println(floorNumber);
        externalButtonDispatcher.submitRequest(floorNumber, direction);
    }
}
