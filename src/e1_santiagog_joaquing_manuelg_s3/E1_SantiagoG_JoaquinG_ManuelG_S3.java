package e1_santiagog_joaquing_manuelg_s3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_SantiagoG_JoaquinG_ManuelG_S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        while (opcion!=6){

            //El menu de opciones
            System.out.println("1.- Registrar Socio");
            System.out.println("2.- Ver datos del Socio");
            System.out.println("3.- Cancelar Cuota");
            System.out.println("4.- Consultar cuota cancelada");
            System.out.println("5.- Consultar Total de cuotas pagadas por el socio");
            System.out.println("6.- Salir del Programa");
            

            try {
                opcion = sc.nextInt();
                
            switch(opcion){
                case 1:
                    System.out.println("Registrar Socio");
                    socio nuevSocio = new socio();
                    nuevSocio.registrarSocio();
                    break;
                case 2:
                    System.out.println("Ver datos del socio");
                    break;
                case 3:
                    System.out.println("Cancelar Cuota");
                    break;
                case 4:
                    System.out.println("Consultar cuota cancelada");
                    break;
                case 5:
                    System.out.println("Consultar Total de cuotas pagadas por el socio");
                    break;
                case 6:
                    System.out.println("Salir del Programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
                continue;
            }            
            
        }
        sc.close();
    }
    
}
