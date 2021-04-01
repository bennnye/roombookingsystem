package roombooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseSQLHandler {

public static void executeUpdateQuirey(String query){
    
    try {
        
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/roombookingdatabase", "benjamin", "password");
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            statement.executeQuery(query);
        
    } catch (Exception e) {
        System.out.println("Error: " + e);
    }
    
}

public static ResultSet executeQuery(String query){
    
    try {
        
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/roombookingdatabase", "benjamin", "password");
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        ResultSet results = statement.executeQuery(query);
        return results;
        
    } catch (Exception e) {
        System.out.println("Error: " + e);
        return null;
    }
    
}
    
}
