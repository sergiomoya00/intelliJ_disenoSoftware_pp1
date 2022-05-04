package logicaValidaciones;

public class ValidacionAlfanumerico {

    private String mensaje;

    /**
     * Metodo para validar si un texto es numerico
     *
     * @param mensaje String que representa el texto por validar
     * @return boolean true si es numerico
     */
    public boolean esNumerico(String mensaje) {
        return mensaje != null && mensaje.matches("^[0-9]*$");}

    /**
     * Metodo para validar si un texto es alfabético
     *
     * @param mensaje String que representa el texto por validar
     * @return boolean true si es alfabético
     */
    public boolean esAlfabetico(String mensaje) {
        return mensaje != null && mensaje.matches("^[a-zA-Z]*$");
    }

}
