package logicaValidaciones;

public class VerificacionPIN {

    public boolean VerificarPIN(String PinIngresado, String PinComparacion){
        return PinIngresado != null && PinIngresado.matches(PinComparacion);
    }
}
