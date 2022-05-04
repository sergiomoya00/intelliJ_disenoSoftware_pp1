package logicaNegocios;

import java.time.LocalDate;

public class Persona {

    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private int cedula;
    private LocalDate fechaNacimiento;
    private int telefono;
    private String correoElectronico;

    public Persona(String primerApellido, String segundoApellido, String nombre, int cedula, LocalDate fechaNacimiento, int telefono, String correoElectronico) {
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Persona() {
    }
}
