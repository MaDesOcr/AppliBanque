package Controller;

import Dao.UserDao;
import Model.Data;
import Model.User;

public class LoginController {

    public static void login(String userId, String password){
        User userTemp = UserDao.getUserById(Integer.parseInt(userId));
        if(userTemp!=null && userTemp.getPassword().equals(password)){
            Data.setConnectedUser(userTemp);
       }
    }
}
