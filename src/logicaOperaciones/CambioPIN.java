package logicaOperaciones;

import dao.conexionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CambioPIN {
    public boolean cambioPIN(int id, String PIN) {
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        String datoCliente = "update cuenta_Persona set pin = ? where id = ?";
        try {
            ps = con.prepareStatement(datoCliente);
            ps.setString(1, PIN);
            ps.setInt(2, id);
            return true;
        }catch (SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            } catch(SQLException e){System.err.println(e);}
        }
    }
}
