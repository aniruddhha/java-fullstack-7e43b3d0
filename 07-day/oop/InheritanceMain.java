class Config { // parent/base/super
    
    String usNm;
    String pass;

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
        cfg.usNm = "abc";
        cfg.pass = "abc";
        cfg.validateUsNm();
        cfg.validatePass();

        DbConfig dbCfg = new DbConfig();
        dbCfg.usNm = "abc";
        dbCfg.pass = "abc";
        dbCfg.validateUsNm();
        dbCfg.validatePass();
        dbCfg.validateUrl();

        NwConfig nwCfg = new NwConfig();
        nwCfg.usNm = "abc";
        nwCfg.pass = "abc";
        nwCfg.validateUsNm();
        nwCfg.validatePass();
        nwCfg.validateProtocol();
    }
}
