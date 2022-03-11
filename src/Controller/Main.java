package Controller;

import Model.AddDataTest;
import config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {


    public static void main(String [] args){
      /*  DBConfig dbConfig = new DBConfig();

        Connection con = null;
        String result;
        try {
            con = dbConfig.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from User;");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                result = rs.getString(1);
                System.out.println(result);
            }
            dbConfig.closeResultSet(rs);
            dbConfig.closePreparedStatement(ps);
        }catch (Exception ex){

        }finally {
            dbConfig.closeConnection(con);
        }
*/


        AddDataTest.addDataForTest();

        MainMenuController mainMenuController = new MainMenuController();
        mainMenuController.mainMenu();

    }
}
