package dao;
import javax.swing.*;
import java.sql.*;
/**
 * La clase ConexionSQL tiene como objetivo establecer la conexión con la base de
 * datos que permita la permanencia de los datos
 * @author Felipe Esquivel, Sergio Moya
 */
public class conexionSQL {

    Connection con = null;
     String password = "felipe123"; //contraseña
     String usuario = "Felipe";  //nombre de usuario
     int puerto = 1433;
     String db= "Sistema_Bancario";
    public Connection conectar() {
        try {
            String url = "jdbc:sqlserver://localhost:"+puerto+";"+"database = "+db;
            con = DriverManager.getConnection(url, usuario, password);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
        return con;
    }
}
