
class FinalRoot {
    public void root(final int ver) {

    }

    public final void finalRoot() {

    }
}
final class Final extends FinalRoot {
    final int speed = 10;
    int color = 8;
    public static final String URL = "abc";

    @Override
    public void root(int ver) {
        super.root(10);
    }

    void start() {

    }

    public static final void abc() {  }
}

// class FinalChild extends Final {  }

public class FinalMain {

    public final static void main(String[] args) {
        final Final fnl = new Final();
        fnl.color = 90;
    }
}
