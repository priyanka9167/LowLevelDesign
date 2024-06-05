import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        floorList.add(floor1);
        floorList.add(floor2);

        floor1.pressButton(Direction.UP);

    }
}