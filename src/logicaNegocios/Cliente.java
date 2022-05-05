package logicaNegocios;

import java.util.Date;

public class Cliente extends Persona {

    private String codigo;

    public Cliente (String primerApellido, String SegundoApellido, String nombre, int cedula, Date fechaNacimiento, int telefono, String correoElectronico, String codigo){
        super(primerApellido,SegundoApellido,nombre,cedula,fechaNacimiento,telefono,correoElectronico);
        codigo="";
    }
    public void setCodigo(String pCodigo){this.codigo = pCodigo;}

    public String getCodigo(){return codigo;}
}
