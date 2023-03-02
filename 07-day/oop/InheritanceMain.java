class Config { // parent/base/super
    
    // access modifiers
    // public, private, protected, default
    private String usNm; 
    private String pass;

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

    boolean validateUsNm() {
        return false;
    }

    boolean validatePass() {
        return false;
    }
}

// is a relationship
// Db Config is a Config
class DbConfig extends Config { // child/derived/sub
    String url;

    boolean validateUrl() {
        return false;
    }
}

class NwConfig extends Config {
    String protocol;

    boolean validateProtocol() {
        return false;
    }
}

public class InheritanceMain {

    public static void main(String[] args) {
        
        Config cfg = new Config();
        cfg.setUsNm("abc");
        cfg.setPass("pqr");
        // cfg.usNm = "abc";
        // cfg.pass = "abc";
        cfg.validateUsNm();
        cfg.validatePass();

        DbConfig dbCfg = new DbConfig();
        // dbCfg.usNm = "abc";
        // dbCfg.pass = "abc";
        cfg.setUsNm("abc");
        cfg.setPass("pqr");
        dbCfg.validateUsNm();
        dbCfg.validatePass();
        dbCfg.validateUrl();

        NwConfig nwCfg = new NwConfig();
        // nwCfg.usNm = "abc";
        // nwCfg.pass = "abc";
        cfg.setUsNm("abc");
        cfg.setPass("pqr");
        nwCfg.validateUsNm();
        nwCfg.validatePass();
        nwCfg.validateProtocol();
    }
}
