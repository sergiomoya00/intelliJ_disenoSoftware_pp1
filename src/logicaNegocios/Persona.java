package logicaNegocios;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private int cedula;
    public Date fechaNacimiento;
    private int telefono;
    private String correoElectronico;

    public Persona(String primerApellido, String segundoApellido, String nombre, int cedula, Date fechaNacimiento,
                   int telefono, String correoElectronico) {
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
    //Métodos accesores
    public void setPrimerApellido(String pPrimerApellido){ pPrimerApellido = primerApellido;}
    public String getPrimerApellido (){return primerApellido;}
    public void setSegundoApellido(String pSegundoApellido){pSegundoApellido = segundoApellido;}
    public String getSegundoApellido(){return segundoApellido;}
    public void setNombre(String pNombre){pNombre = nombre;}
    public String getNombre(){return nombre;}
    public void setCedula (int pCedula){pCedula = cedula;}
    public int getCedula (){return cedula;}
    public void setFechaNacimiento(Date fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    public Date getFechaNacimiento(){return fechaNacimiento;}
    public void setTelefono (int pTelefono){pTelefono = telefono;}
    public int getTelefono (){return telefono;}
    public void setCorreoElectronico (String pCorreo){pCorreo = correoElectronico;}
    public String getCorreoElectronico(){return correoElectronico;}
}
