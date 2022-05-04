package logicaValidaciones;

import javax.swing.*;

public class ValidacionPIN {

    private String pin;

    public void validacionPIN(){};

    /**
     * Metodo para validar si un texto es numerico
     *
     * @param pPIN String que representa el texto por validar
     * @return boolean true la lingitud del PIN es la esperada
     */
    public boolean validarLongitud(String pPIN){
        int minimo = 6;
        return pPIN.length() >= minimo;
    }
    /**
     * Metodo para validar si un texto es numerico
     *
     * @param pPIN String que representa el texto por validar
     * @return boolean true si el PIN contiene los elementos esperados
     */
    public boolean validarPIN(String pPIN){
        if (validarLongitud(pPIN)){ //dflsdkjfhsldkfhlskdhf
            return pPIN.matches("a-zA-Z0-9");
        }

        return false;
    }
}
