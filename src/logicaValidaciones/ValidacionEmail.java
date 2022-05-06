package logicaValidaciones;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class ValidacionEmail {

    public static boolean isValidEmailAddress(String email) {
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
        isValidEmailAddress("s.a.moyas.00@hotmail.com");
    }
}
