package logicaOperacionesx.Consultas;
import dao.conexionSQL;
import logicaNegocios.Cliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

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

    public DefaultTableModel ListarClientes(){
        DefaultTableModel ListaClientes = new DefaultTableModel();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                ListaClientes.addRow(filas);
            }
            con.close();
            rs.close();
        }
        catch(SQLException e){
            System.err.println(e.toString());
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
