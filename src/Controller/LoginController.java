package Controller;

import Dao.UserDao;
import Model.Data;
import Model.User;

public class LoginController {

    UserDao userDao = new UserDao();

    public void login(String userId, String password){

        User userTemp = userDao.getUserById(Integer.parseInt(userId));


        if(userTemp!=null && userTemp.getPassword().equals(password)){
            Data.setConnectedUser(userTemp);
       }
    }
}
