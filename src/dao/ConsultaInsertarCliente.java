package dao;
import logicaNegocios.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaInsertarCliente {

    public boolean insertarCliente(Persona persona) {
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(Persona.getFechaNacimiento());
        java.sql.Date fechaNacimiento = java.sql.Date.valueOf(formattedDate);
        String datoCliente = "";
        try {
            ps = con.prepareStatement(datoCliente);
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try{
                con.close();
            } catch(SQLException e){
                System.err.println(e);
            }
        }
    }
}
