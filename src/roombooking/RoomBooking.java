package roombooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class RoomBooking {

    public static void main(String[] args) {
        
        recordDisplay table = new recordDisplay();
        table.setVisible(true);
        
        /* try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/roombookingdatabase", "benjamin", "password");
            Statement stnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            String sql = "select max(customerid) as idnum from app.customer";
            ResultSet rs = stnt.executeQuery(sql);
            rs.next();
            int idvalue = rs.getInt("idnum")+1;
            
            sql = "insert into app.customer (" + idvalue + ", dan, nye, sstl, dan@gmail.com)";
            stnt.executeUpdate(sql);
            
            sql = "delete from app.customer where customername = 'dan'";
            stnt.executeUpdate(sql);
            
            sql = "select ' from app.customer";
            rs = stnt.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("customerid");
                String Fname = rs.getString("customerfname");
                String Lname = rs.getString("customerlname");
                String company = rs.getString("company");
                String email = rs.getString("customeremail");
                
                System.out.println(id + ", " + Fname + ", " + Lname + ", " + company + ", " + email);
            }
            
            con.close();
            stnt.close();
            rs.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }*/
    }
    
}
