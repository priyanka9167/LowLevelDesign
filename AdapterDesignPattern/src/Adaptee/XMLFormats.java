package Adaptee;

public class XMLFormats implements FileFormats {

    public String data;

    public XMLFormats(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getFileFormats(){
        return this.data;
    }
}
