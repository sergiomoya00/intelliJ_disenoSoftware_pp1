package logicaOperacionesx.Consultas;

import dao.conexionSQL;
import logicaOperaciones.Comision;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class ConsultasComisiones {

    public boolean IngresarComision(Comision comision){
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        String datoComisiones = "insert into comisiones values ?,?,?";
        try{
            ps = con.prepareStatement(datoComisiones);
            ps.setString(1, comision.getTipoOperacion());
            ps.setInt(2, comision.getCuenta_cargada());
            ps.setInt(3, comision.getMonto());
            return true;
        } catch(SQLException e){
            System.err.println(e);
            return false;}
        finally {
            try{
                con.close();
            } catch (SQLException e){System.err.println(e);}
        }
    }
    public DefaultTableModel comisionesTotales () throws SQLException {
        DefaultTableModel Comisiones = new DefaultTableModel();
        Connection con = conexionSQL.conectar();
        PreparedStatement ps = con.prepareStatement("select sum (monto) from comisiones");
        try{
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            Comisiones.addColumn("Total Generado por Comisiones");
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                Comisiones.addRow(filas);}
        } catch(SQLException e){System.err.println(e);}
        return Comisiones;
    }

    public DefaultTableModel comisionesPorCuenta(int id) throws SQLException {
        DefaultTableModel ComisionCuenta = new DefaultTableModel();
        Connection con = conexionSQL.conectar();
        PreparedStatement ps = con.prepareStatement("select sum (monto) from comisiones where cuenta_cargada = ?");
        try{
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            ComisionCuenta.addColumn("Total comisiones en la cuenta");
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int j = 0; j<cantidadColumnas; j++){
                    filas[j] = rs.getObject(j+1);
                }
                ComisionCuenta.addRow(filas);
            }
        }catch(SQLException e){System.err.println(e);}
        return ComisionCuenta;
    }

}
