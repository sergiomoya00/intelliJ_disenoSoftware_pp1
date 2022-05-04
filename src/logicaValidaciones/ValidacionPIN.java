package logicaValidaciones;

import javax.swing.*;

public class ValidacionPIN {

    private String pin;

    public void validacionPIN(){};

    /**
     * Metodo para validar si un la contraseña cumple con la longitud solicitada
     *
     * @param pPIN String que representa el texto por validar
     * @return boolean true la lingitud del PIN es la esperada
     */
    public boolean validarLongitud(String pPIN){
        int minimo = 6;
        return pPIN.length() >= minimo;
    }
    /**
     * Metodo para validar si el PIN cumple con los requerimientos solicitados
     *
     * @param pPIN String que representa el texto por validar
     * @return boolean true si el PIN contiene los elementos esperados
     */
    public boolean validarPIN(String pPIN){
        if (validarLongitud(pPIN)){
            return pPIN.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=S+$).{8,}$");
        }
        return false;
    }
}
