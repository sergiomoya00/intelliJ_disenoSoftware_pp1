package dao;
import logicaNegocios.Persona;
import logicaNegocios.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaInsertarCliente {

    public boolean insertarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(Persona.getFechaNacimiento());
        java.sql.Date fechaNacimiento = java.sql.Date.valueOf(formattedDate);
        String datoCliente = "";
        try {
            ps = con.prepareStatement(datoCliente);
            ps.setString(1,Persona.getSegundoApellido());
            ps.setString(2,Persona.getPrimerApellido());
            ps.setString(3,Persona.getNombre());
            ps.setInt(4,Persona.getCedula());
            ps.setDate(5,fechaNacimiento);
            ps.setInt(6,Persona.getTelefono());
            ps.setString(7,Persona.getCorreoElectronico());
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
