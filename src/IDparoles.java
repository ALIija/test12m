import java.util.HashMap;

public class IDparoles {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDparoles(){

        logininfo.put("balts", "torte1");
        logininfo.put("Rose", "cat");
        logininfo.put("Ozols56", "tosters");
    }
    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
