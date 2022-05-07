package logicaOperacionesx.Consultas;

import dao.conexionSQL;
import logicaNegocios.Cuenta;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ConsultasCuentas {

    public boolean CrearCuenta(Cuenta cuenta){
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(cuenta.getFechaCreacion());
        java.sql.Date fechaCreacion = java.sql.Date.valueOf(formattedDate);
        String crearCuenta ="";
        try{
            ps = con.prepareStatement(crearCuenta);
            ps.setInt(1, cuenta.getId());
            ps.setString(2, String.valueOf(cuenta.getDueno()));
            ps.setDate(3, fechaCreacion);
            ps.setInt(4, cuenta.getSaldo());
            ps.setString(5, cuenta.getStatus());
            ps.setString(6,cuenta.getPin());
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){System.err.println(e);}
        }
    }
    public DefaultTableModel listaCuentas(){
        DefaultTableModel listaCuenta = new DefaultTableModel();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from cuenta");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            listaCuenta.addColumn("ID");
            listaCuenta.addColumn("Dueño");
            listaCuenta.addColumn("Fecha de Creacion");
            listaCuenta.addColumn("Saldo");
            listaCuenta.addColumn("Estatus de la cuenta");
            listaCuenta.addColumn("Operaciones Realizadas");
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                listaCuenta.addRow(filas);
            }
            con.close();
            rs.close();
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return listaCuenta;}

    public ArrayList consultarCuenta (int id){
        ArrayList busquedaCuenta = new ArrayList();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                busquedaCuenta.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return busquedaCuenta;
    }

    public ArrayList consultaSaldo (int id){
        ArrayList saldoCuenta = new ArrayList();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                saldoCuenta.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return saldoCuenta;
    }

    public ArrayList consultaEstado(int id){
        ArrayList estadoCuenta = new ArrayList();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                estadoCuenta.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return estadoCuenta;
    }

    public ArrayList estatusCuenta(int id){
        ArrayList estatusCuenta = new ArrayList();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                estatusCuenta.add(rs.getString(1));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return estatusCuenta;
    }

    public DefaultTableModel CargarCuentas(){
        DefaultTableModel cuentas = new DefaultTableModel();
        try {
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from cuenta");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            cuentas.addColumn("Primer Apellido");
            cuentas.addColumn("Segundo Apellido");
            cuentas.addColumn("Nombre Completo");
            cuentas.addColumn("Cedula");
            cuentas.addColumn("Fecha de Nacimiento");
            cuentas.addColumn("Telefono");
            cuentas.addColumn("Correo Electrónico");
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for(int i = 0; i<cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                cuentas.addRow(filas);
            }

        }catch(SQLException e){System.err.println(e);}
        return cuentas;
        }

    }

}
