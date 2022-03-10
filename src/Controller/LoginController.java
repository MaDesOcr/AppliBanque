package Controller;

import Dao.UserDao;
import Model.Data;
import Model.User;

public class LoginController {

    public static void login(String userName, String password){
        User userTemp = UserDao.getUserByLastName(userName);
        if(userTemp!=null && userTemp.getPassword().equals(password)){
            Data.setConnectedUser(userTemp);
       }
    }
}
