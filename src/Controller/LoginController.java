package Controller;

import Model.Data;
import Model.User;

public class LoginController {



    public static User checkLogin(String userName, String password){
       if(Data.getUsersList().get(userName)!=null && Data.getUsersList().get(userName).getPassword().equals(password)){
            return Data.getUsersList().get(userName);
       }
       return null;
    }
}
