package logicaNegocios;

public class Comision {
    private String tipoOperacion;
    private int cuenta_cargada;
    private int monto;

    public Comision(String pTipoOperacion, int pCuenta_Cargada, int pMonto){
        this.tipoOperacion = pTipoOperacion;
        this.cuenta_cargada = pCuenta_Cargada;
        this.monto = pMonto;
    }

    public void setTipoOperacion(String pTipoOperacion){ this.tipoOperacion = pTipoOperacion;}
    public String getTipoOperacion(){return tipoOperacion;}
    public void setCuenta_cargada(int pCuenta_Cargada){this.cuenta_cargada = pCuenta_Cargada;}
    public int getCuenta_cargada(){return cuenta_cargada;}
    public void setMonto(int pMonto){this.monto = pMonto;}
    public int getMonto(){return  monto;}
}
