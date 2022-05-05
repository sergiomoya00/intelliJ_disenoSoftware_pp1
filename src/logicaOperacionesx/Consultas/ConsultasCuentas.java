package logicaOperacionesx.Consultas;

import dao.conexionSQL;
import logicaNegocios.Cuenta;

import javax.lang.model.type.ArrayType;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ConsultasCuentas {

    public boolean CrearCuenta(Cuenta cuenta){
        PreparedStatement ps;
        Connection con = conexionSQL.conectar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(Cuenta.getFechaCreacion());
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
    public DefaultComboBoxModel listaCuentas(){
        DefaultComboBoxModel listaCuenta = new DefaultComboBoxModel();
        try{
            Connection con = conexionSQL.conectar();
            PreparedStatement ps = con.prepareStatement("select * from cuenta");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listaCuenta.addElement(rs.getString(1));
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

}
