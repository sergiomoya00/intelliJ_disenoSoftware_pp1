package logicaValidaciones;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class ValidacionEmail {

    /**
     * Metodo para validar si el formato del email es correcto.
     *
     * @param email String que representa el email por validar.
     * @return boolean true si el formato del email es valido.
     */
    public static boolean validarDireccionEmail(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        validarDireccionEmail("s.a.moyas.00@hotmail.com");
    }
}
