import java.util.Scanner;

public class menuRestaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("***** MENÚ DE SELECCIÓN *****");
        System.out.println("1. Añadir un entrante.");
        System.out.println("2. Añadir un plato principal.");
        System.out.println("3. Elegir postre.");
        System.out.println("4. No sentarme en este restaurante porque...");
        System.out.println("Elige una opción:");

        opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Has seleccionado añadir un entrante");
        }
        if (opcion == 2) {
            System.out.println("Has seleccionado añadir un plato principal");
        }
        if (opcion == 3) {
            System.out.println("Has seleccionado ver el menú de postres");
        }
        if (opcion == 4) {
            System.out.println("Has seleccionado no sentarte en el restaurante");
            System.out.println("1. Local en malas condiciones.");
            System.out.println("2. No dispone de menú vegano.");
            System.out.println("3. Mal servicio.");
            System.out.println("Elige una opción:");

            int opcion2;
            opcion2 = sc.nextInt();

            if (opcion2 == 1) {
                System.out.println("Gracias por su opinión, la tendremos en cuenta para mejorar, esperamos verle pronto");
            }
            if (opcion2 == 2) {
                System.out.println("Gracias por su opinión, la tendremos en cuenta para mejorar, esperamos verle pronto");
            }
            if (opcion2 == 3) {
                System.out.println("Gracias por su opinión, la tendremos en cuenta para mejorar, esperamos verle pronto");
            }
        }
    }
}
