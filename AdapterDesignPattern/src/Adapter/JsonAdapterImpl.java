package Adapter;

import Adaptee.FileFormats;
import Adaptee.XMLFormats;

public class JsonAdapterImpl implements JsonFormat {

    public FileFormats fileFormats;

    public JsonAdapterImpl(FileFormats fileFormats) {
        this.fileFormats = fileFormats;
    }


    @Override
    public String getJsonFormat() {
        String format = this.fileFormats.getFileFormats();
        System.out.println(format);
        System.out.println("Converted to String");
        return format+"Converted to Json";
    }
}
