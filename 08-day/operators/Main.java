public class Main {
    private int ver;
    
    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setVer(10);
        m.getVer();
    }
}

