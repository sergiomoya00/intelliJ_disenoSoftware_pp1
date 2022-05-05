package logicaNegocios;

import java.util.Date;

public class Operacion {

    private String tipoOperacion;
    private Date fecha;
    private boolean hayCargo;
    private int monto;

    public boolean validarNumOperacion(int numOperacion){
        return true;
    }

    public void setTipoOperacion(String pTipoOperacion){this.tipoOperacion = pTipoOperacion;}
    public String getTipoOperacion(){return tipoOperacion;}
    public void setFecha(Date pFecha){this.fecha = pFecha;}
    public Date getFecha(){return fecha;}
    public void setHayCargo (boolean pHayCargo){this.hayCargo = pHayCargo;}
    public boolean getHayCargo(){return hayCargo;}
    public void setMonto (int pMonto){this.monto = pMonto;}
    public int getMonto(){return monto;}
}
