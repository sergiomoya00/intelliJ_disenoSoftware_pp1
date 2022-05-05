package logicaOperacionesx.Consultas;

import dao.conexionSQL;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class ConsultasComisiones {
    public DefaultTableModel comisioneTotales (){
        DefaultTableModel Comisiones = new DefaultTableModel();
        Connection con = conexionSQL.conectar();
        PreparedStatement ps = con.prepareStatement("");
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

    public DefaultTableModel comisionesPorCuenta(int id){
        DefaultTableModel ComisionCuenta = new DefaultTableModel();
        Connection con = conexionSQL.conectar();
        PreparedStatement ps = con.prepareStatement("");
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
