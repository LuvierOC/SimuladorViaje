import java.util.Scanner;

class Viaje {
    static String[] planetas = {"Marte", "Júpiter", "Saturno"};
    static double[] distancias = {225.0, 778.0, 1430.0}; // en millones de km
    static double velocidad = 100000; // km/h
    static double consumoCombustible = 0.5; // litros por km
    static double consumoOxigeno = 2.0; // litros por hora

    static void seleccionarDestino(Scanner scanner) {
        System.out.println("\nSeleccione un planeta de destino:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println((i + 1) + ". " + planetas[i] + " - " + distancias[i] + " millones de km");
        }
        int eleccion = scanner.nextInt();
        if (eleccion < 1 || eleccion > planetas.length) {
            System.out.println("Selección no válida.");
            return;
        } 
        calcularViaje(eleccion - 1);
    }

    static void calcularViaje(int indice) {
        double distanciaKm = distancias[indice] * 1_000_000;
        double tiempoHoras = distanciaKm / velocidad;
        double combustibleNecesario = distanciaKm * consumoCombustible;
        double oxigenoNecesario = tiempoHoras * consumoOxigeno;

        System.out.printf("\nPlaneta seleccionado: %s", planetas[indice]);
        System.out.printf("\nDistancia: %.0f km", distanciaKm);
        System.out.printf("\nTiempo estimado: %.0f horas", tiempoHoras);
        System.out.printf("\nCombustible requerido: %.0f litros", combustibleNecesario);
        System.out.printf("\nOxígeno requerido: %.0f litros\n", oxigenoNecesario);

        Simulacion.simularViaje();
        System.out.println("Finalizacion de la funcion");
    }
}