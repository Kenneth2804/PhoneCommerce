import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class conectar {
 Connection conn;
 
 public Connection conexion(){
     try {
         Class.forName("org.gjt.mm.mysql.Driver");
       conn =DriverManager.getConnection("jdbc:mysql://localhost/clientes","root","hola");
    //   JOptionPane.showMessageDialog(null, "Conexion establecida");
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Error"+e);
       
     }
     
     
     return conn;
 }
}