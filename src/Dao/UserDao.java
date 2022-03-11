package Dao;

import Model.Data;
import Model.User;
import config.DBConfig;

import java.util.HashMap;

public class UserDao {

    DBConfig dbConfig = new DBConfig();
    public HashMap<Integer, User> getUsers(){
        return Data.getUsersMap();
    }

    /*public User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }*/

    public User getUserById(Integer userTO) {

        return Data.getUsersMap().get(userTO);
    }

    public User getConnectedUser(){
        return Data.getConnectedUser();
    }

    public HashMap<Integer, User> getFriendMapFromUser() {
        return Data.getConnectedUser().getFriendMap();
    }

    public void disconnectUser() {
        Data.setConnectedUser(null);
    }
}


/*public void save(User user){
        Connection con = null;
        int result=-1;
        try {
            con = dataBaseConfig.getConnection();
            PreparedStatement ps = con.prepareStatement(DBConstants.
            );
            ps.setString();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                result = rs.getInt(1);;
            }
            dataBaseConfig.closeResultSet(rs);
            dataBaseConfig.closePreparedStatement(ps);
        }catch (Exception ex){

        }finally {
            dataBaseConfig.closeConnection(con);
        }
    }
    */
