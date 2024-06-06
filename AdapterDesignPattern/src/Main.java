import Adaptee.FileFormats;
import Adaptee.XMLFormats;
import Adapter.JsonAdapterImpl;

public class Main {
    public static void main(String[] args) {

        FileFormats xml = new XMLFormats("The data is xml");

        JsonAdapterImpl json = new JsonAdapterImpl(xml);
        json.getJsonFormat();
    }
}