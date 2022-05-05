package logicaOperacionesx.Consultas;
import dao.conexionSQL;
import logicaNegocios.Cliente;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class ConsultasCliente {

   public boolean insertarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(cliente.getFechaNacimiento());
        java.sql.Date fechaNacimiento = java.sql.Date.valueOf(formattedDate);
        String datoCliente = "insert into persona values ?,?,?,?,?,?,?";
        try {
            ps = con.prepareStatement(datoCliente);
            ps.setString(1,cliente.getSegundoApellido());
            ps.setString(2,cliente.getPrimerApellido());
            ps.setString(3,cliente.getNombre());
            ps.setInt(4,cliente.getCedula());
            ps.setDate(5,fechaNacimiento);
            ps.setInt(6,cliente.getTelefono());
            ps.setString(7,cliente.getCorreoElectronico());
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

    public DefaultComboBoxModel ListarClientes(){
        DefaultComboBoxModel ListaClientes = new DefaultComboBoxModel();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ListaClientes.addElement(rs.getString(1));
            }
            con.close();
            rs.close();
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return ListaClientes;
    }

    public ArrayList buscarClientes (String pPrimerApellido){
        ArrayList ClienteApellido = new ArrayList();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from persona where persona.primer_apellido = ?");
            ps.setString(1,pPrimerApellido);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ClienteApellido.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return ClienteApellido;
    }
}
