package bankmanagementsystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","PASSWORD");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}