package logicaValidaciones;

public class ValidacionSaldo {

    private int saldo;
    private int monto;

    public void validacionSaldo(){};

    /**
     * Metodo para validar si un texto es numerico
     *
     * @param pSaldo int que representa el saldo de la cuenta
     * @param pMonto int que representa el número por validar
     * @return boolean true si el monto es menor o igual al saldo disponible
     */
    public boolean validarSaldo(int pSaldo, int pMonto){
        return pSaldo >= pMonto;
    }

}
