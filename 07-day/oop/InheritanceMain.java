class Config { // parent/base/super
    
    // access modifiers
    // public, private, protected, default
    private String usNm; 
    private String pass;
    protected int ver;

    public String getUsNm() {
        return usNm;
    }

    public void setUsNm(String usNm) {
        this.usNm = usNm;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public boolean validateUsNm() {
        return false;
    }

    public boolean validatePass() {
        return false;
    }
}

// is a relationship
// Db Config is a Config
class DbConfig extends Config { // child/derived/sub
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean validateUrl() {
        return false;
    }
}

class NwConfig extends Config {
    private String protocol;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public boolean validateProtocol() {
        return false;
    }
}

public class InheritanceMain {

    public static void main(String[] args) {
        
        Config cfg = new Config();
        cfg.ver = 10;
        cfg.setUsNm("abc");
        cfg.setPass("pqr");
        // cfg.usNm = "abc";
        // cfg.pass = "abc";
        cfg.validateUsNm();
        cfg.validatePass();

        DbConfig dbCfg = new DbConfig();
        // dbCfg.usNm = "abc";
        // dbCfg.pass = "abc";
        dbCfg.setUsNm("abc");
        dbCfg.setPass("pqr");
        dbCfg.ver = 10;
        
        dbCfg.validateUsNm();
        dbCfg.validatePass();
        dbCfg.validateUrl();
        dbCfg.setUrl("http://google.com");
        

        NwConfig nwCfg = new NwConfig();
        // nwCfg.usNm = "abc";
        // nwCfg.pass = "abc";

        nwCfg.ver = 10;
        nwCfg.setUsNm("abc");
        nwCfg.setPass("pqr");

        nwCfg.validateUsNm();
        nwCfg.validatePass();
        nwCfg.validateProtocol();
        nwCfg.setProtocol("http://");
    }
}
