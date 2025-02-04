import java.util.Random;

class Simulacion {
    static void simularViaje() {
        System.out.println("\nIniciando viaje...");
        Random random = new Random();
        for (int i = 0; i <= 100; i += 20) {
            System.out.printf("Progreso: %d%%\n", i);
            if (random.nextInt(100)  < 15) {
                System.out.println("¡Evento inesperado! Fallo en el sistema.");

            }
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
        System.out.println("¡Llegaste a tu destino!");
    }
}
