package consola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while(!salir){

            System.out.println("1. Crear cuenta"); //Segunda funcionalidad
            System.out.println("2. Listado de clientes"); //Tercera funcionalidad
            System.out.println("3. Listado de cuentas"); //Quinta funcionalidad
            System.out.println("4. Cambiar PIN"); //7ma funcionalidad
            System.out.println("5. Deposito"); //8va funcionalidad
            System.out.println("6. Retiro"); //10ma funcionalidad
            System.out.println("7. Transferencia"); //12va funcionalidad
            System.out.println("8. Consultar tipo de cambio de compra"); //13ra funcionalidad
            System.out.println("9. Consultar tipo de cambio de venta"); //14ta funcionalidad
            System.out.println("10. Consultar Saldo Actual"); //15ta funcionalidad
            System.out.println("11. Consultar Estado de Cuenta."); //17ma funcionalidad
            System.out.println("12. Consultar el estatus de una cuenta."); //19na funcionalidad
            System.out.println("13. Consultar total de ganancias por cobro de comisiones."); //20ma funcionalidad
            System.out.println("14. Consultar ganancias por cobro de comisiones para una cuenta en específico."); //21era funcionalidad
            System.out.println("15. Salir");

            System.out.println("Elija el número de una de las opciones");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Creación de cuenta");
                    break;
                case 2:
                    System.out.println("Listado de clientes registrados");
                    System.out.println("Seleccione el cliente por consultar o digite 1 para salir.");
                    break;
                case 3:
                    System.out.println("Listado de cuentas");
                    System.out.println("Seleccione la cuenta por consultar o digite 1 para salir.");
                    break;
                case 4:
                    System.out.println("Cambio de PIN");
                    break;
                case 5:
                    System.out.println("Depósito");
                    System.out.println("Seleccione la moneda");
                    System.out.println("Colones");
                    System.out.println("Dolares"); //9na funcionalidad
                    break;
                case 6:
                    System.out.println("Retiro");
                    System.out.println("Seleccione la moneda");
                    System.out.println("Colones");
                    System.out.println("Dolares"); //11va funcionalidad
                    break;
                case 7:
                    System.out.println("Transferencia");
                    break;
                case 8:
                    System.out.println("Consulta de tipo de cambio de compra");
                    break;
                case 9:
                    System.out.println("Consulta de tipo de cambio de venta");
                    break;
                case 10:
                    System.out.println("Consulta de saldo actual");
                    System.out.println("Seleccione la moneda");
                    System.out.println("Colones");
                    System.out.println("Dolares"); //16ta funcionalidad
                    break;
                case 11:
                    System.out.println("Consulta de estado de cuenta");
                    break;
                case 12:
                    System.out.println("Consulta de estatus de una cuenta");
                    break;
                case 13:
                    System.out.println("Consulta del total de ganancias por cobro de comisiones");
                    break;
                case 14:
                    System.out.println("Consulta de ganancias por cobro de comisiones para una cuenta");
                    break;
                case 15:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo exiten opciones entre 1 y 15");
            }

        }

    }
}
