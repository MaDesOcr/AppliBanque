package Dao;

import Model.Data;
import Model.User;
import config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class UserDao {

    DBConfig dbConfig = new DBConfig();
    public HashMap<Integer, User> getUsers(){
        return Data.getUsersMap();
    }

    /*public User getUserByLastName(String lastName){
        return Data.getUsersMap().get(lastName);
    }*/

    public User getUserById(Integer userID) {
        DBConfig dbConfig = new DBConfig();
        Connection con = null;
        String firstName = null, lastName = null , password = null;
        try {
            con = dbConfig.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from User where id = ?;");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                firstName = rs.getString("firstname");
                lastName = rs.getString("lastname");
                password = rs.getString("password");
                //System.out.println(result);
            }
            System.out.println(firstName + " " + lastName + " " + " " + password + ".");
            dbConfig.closeResultSet(rs);
            dbConfig.closePreparedStatement(ps);
        }catch (Exception ex){
            System.out.println("Error");

        }finally {
            dbConfig.closeConnection(con);
        }




        return null;
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
