import java.util.Scanner;

public class SimuladorViaje {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0; 
        do{
            Menu.mostrarMenu();
            opcion  = entrada.nextInt();
            switch (opcion) {
                case 1:
                    Viaje.seleccionarDestino(entrada);
                    break;
                case 2:
                    System.out.println("Saliendo....");
                    break;
            
                default:
                System.out.println("Ingrese una opcion valida.");
                    break;
            }
        }while (opcion != 2); 
        entrada.close();
            
        }
    }

