package config;


import java.sql.*;

public class DBConfig {


    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/prod","root","rootroot");
    }

    public void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
    }

    public void closePreparedStatement(PreparedStatement ps) {
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
            }
        }
    }

    public void closeResultSet(ResultSet rs) {
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
            }
        }
    }
}