package logicaValidaciones;

public class ValidacionPalabraSecreta {

    private String palabra;
    private String comparacion;

    public void validacionPalabra(){};

    /**
     * Metodo para validar si un texto es numerico
     *
     * @param pPalabra String que representa el texto por validar
     * @param pComparacion string que representa el texto por comparar
     * @return boolean true si ambos textos son iguales
     */
    public boolean validarPalabra(String pPalabra, String pComparacion){
        return pPalabra != null && pPalabra.matches(comparacion);
    }

}
