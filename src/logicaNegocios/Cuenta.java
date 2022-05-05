package logicaNegocios;

import java.util.Date;

public class Cuenta {

    private int id;
    private String pin;
    private Persona dueno;
    private Date fechaCreacion;
    private int saldo;
    private String status;
    protected int numOperacion;

    public Cuenta(int id, String pin, Persona dueno, Date fechaCreacion, int saldo, String status, int numOperacion) {
        this.id = id;
        this.pin = pin;
        this.dueno = dueno;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
        this.status = status;
        this.numOperacion = numOperacion;
    }

    public void crearCuenta(){}

    public void setId(int pID){this.id = pID;}
    public int getId(){return id;}
    public void setPin(String pPIN){this.pin = pPIN;}
    public String getPin (){return pin;}
    public void setDueno (Persona pDueno){this.dueno = pDueno;}
    public Persona getDueno(){return dueno;}
    public void setFechaCreacion (Date pFechaCreacion){this.fechaCreacion = pFechaCreacion;}
    public Date getFechaCreacion(){return fechaCreacion;}
    public void setSaldo (int pSaldo){this.saldo = pSaldo;}
    public int getSaldo(){return saldo;}
    public void setStatus(String pStatus){this.status = pStatus;}
    public String getStatus(){return status;}
    public void setNumOperacion(int pNumOperacion){this.numOperacion = pNumOperacion;}
    public int getNumOperacion(){return numOperacion;}
}
