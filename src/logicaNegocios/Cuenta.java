package logicaNegocios;

import java.time.LocalDate;

public class Cuenta {

    private int id;
    private String pin;
    private Persona dueno;
    private LocalDate fechaCreacion;
    private int saldo;
    private String status;
    protected int numOperacion;

    public Cuenta(int id, String pin, Persona dueno, LocalDate fechaCreacion, int saldo, String status, int numOperacion) {
        this.id = id;
        this.pin = pin;
        this.dueno = dueno;
        this.fechaCreacion = fechaCreacion;
        this.saldo = saldo;
        this.status = status;
        this.numOperacion = numOperacion;
    }

    public void crearCuenta(){}
}
