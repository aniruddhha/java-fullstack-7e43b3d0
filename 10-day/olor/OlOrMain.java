
class Device {

    public static int battery(int id) {
        return 0;
    }

    public static int battery(String name) {
        return 0;
    }

    public void connect(int ver) { }
    
    public void connect(String url) { }

    // public int connect() { return 0; } 
}

class Mobile extends Device {

    public static int battery(int id) {
        return 0;
    }

    @Override // annotation 
    public void connect(int ver) {
        super.connect(ver);
    }

    @Override
    public void connect(String url) {
        super.connect(url);
    }

    
}


public class OlOrMain {
    
    public static void main(String[] args) {
        
    }
}
