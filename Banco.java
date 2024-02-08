import java.util.Scanner;

public class Banco {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombreUsuario;
        int PIN;
        int opcion;
        double saldo = 1000;


        System.out.println("Inserte el nombre de usuario: ");
        nombreUsuario = sc.nextLine();

        System.out.println("Ingrese su PIN: ");
        PIN = sc.nextInt();

        System.out.println("Seleccione la acción a realizar: ");
        System.out.println("1. CONSULTAR SALDO");
        System.out.println("2. RETIRAR DINERO ");
        System.out.println("3. INGRESAR DINERO ");
        System.out.println("4. CAMBIO DE PIN");
        opcion = sc.nextInt();


        switch(opcion)
        {
            case 1:
                System.out.println("CONSULTA DE SALDO");
                System.out.println(nombreUsuario + ", su saldo es de " + saldo + " soles");
                break;
            case 2:
                System.out.println("RETIRAR SALDO");
                System.out.println("SALDO ACTUAL: " + saldo + " soles");
                System.out.println("Ingrese la cantidad de dinero a retirar: ");
                int dineroRetiro = sc.nextInt();
                if(dineroRetiro > saldo)
                {
                    System.out.println("Operación NO EXITOSA. Saldo a retirar mayor a saldo actual. Intente de nuevo.");
                } else {
                    System.out.println("SALDO RETIRADO EXITOSAMENTE. ");
                    System.out.println("NUEVO SALDO: " + (saldo- dineroRetiro));
                }
                break;
            case 3:
                System.out.println("INGRESAR DINERO");
                System.out.println("SALDO: " + saldo + " pesos");
                System.out.println("Ingrese la cantidad de dinero a depositar: ");
                int dineroDeposito = sc.nextInt();
                System.out.println("DEPOSITO REALIZADO EXITOSAMENTE. ");
                System.out.println("NUEVO SALDO: " + (saldo + dineroDeposito));
                break;
            case 4:
                System.out.println("CAMBIO PIN");
                System.out.println("Ingrese su PIN Actual para confirmar su identidad: ");
                int pinInicio = sc.nextInt();

                if(pinInicio != PIN)
                {
                    System.out.println("PIN INVALIDO. OPERACION CANCELADA. ");

                } else {
                    System.out.println("PIN confirmado, ingrese su nueva clave: ");
                    int NuevoPIN = sc.nextInt();
                    if(NuevoPIN == PIN)
                    {
                        System.out.println("Su nuevo PIN no puede ser igual al PIN anterior. OPERACION CANCELADA.");

                    } else {
                        System.out.println("El PIN fue CAMBIADO EXITOSAMENTE.");
                    }
                }
                break;
            default:
                System.out.println("OPCION NO VALIDA. INTENTE DE NUEVO.");




        }



    }
}