package JavaSwing.SwingProject;

import java.util.HashMap;

public class IDandPass {
    //! We are going to create a HASHMAP
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    //! CONTRUCTOR
    IDandPass(){
        //* HashMapName.put(input) */
        loginInfo.put("bro", "takoyaki");
        loginInfo.put("fhel", "PASS");
        loginInfo.put("rosifel", "rosipongs");
    }
    protected HashMap<String,String> getLoginInfo(){
        return loginInfo;
    }
}
