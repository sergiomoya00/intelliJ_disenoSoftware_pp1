package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * La clase ConexionSQL tiene como objetivo establecer la conexión con la base de
 * datos que permita la permanencia de los datos
 * @author Felipe Esquivel, Sergio Moya
 */
public class conexionSQL {
    public static Connection conectar() {
        Connection con = null;
        String password = "felipe123"; //contraseña
        String usuario = "Felipe";  //nombre de usuario
        String url = "jdbc:sqlserver://DESKTOP-J8562BL;databaseName=Sistema_Bancario;user=" + usuario + ";password=" + password;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        conectar();
    }
}
