package Controller;

import Model.Data;
import Model.User;

public class LoginController {

    public static void login(String userName, String password){
        User userTemp = Data.getUsersList().get(userName);
        if(userTemp!=null && userTemp.getPassword().equals(password)){
            Data.setConnectedUser(userTemp);
       }
    }
}
