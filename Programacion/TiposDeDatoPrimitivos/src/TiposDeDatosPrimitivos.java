public class TiposDeDatosPrimitivos {
    public static void main(String[] args){

        boolean isOccupied = false;
        System.out.println("isOccupied:" + isOccupied);
        char lastKeyPressed = 'M';
        System.out.println("lastKeyPressed:" + lastKeyPressed);
        int pago = 500000;
        System.out.println("pago: " + pago);
        byte numero = 101;
        System.out.println("numero: " + numero);
        int precioCoche = 21345;
        System.out.println("Precio coche: " + precioCoche);
        byte cantidadCoche = 3;
        System.out.println("Cantidad coche: " + cantidadCoche);
        char scapedKey = '\t';
        System.out.println("scapedKey: " + scapedKey);
        long calculoVelocidad = 8999565321456L;
        System.out.println("calculo velocidad: " + calculoVelocidad);
        String languaje = "Java";
        System.out.println("languaje: " + languaje);
        double impuesto = 2.98;
        System.out.println("impuesto: "  + impuesto);
        double peso1 = 67.5;
        System.out.println("peso1: " + peso1);
        double peso2 = 42.33;
        System.out.println("peso2 " + peso2);
        String centro ="Severo Ochoa";
        System.out.println("centro: " + centro);
        double peso3 = 77.125;
        System.out.println("peso3: " + peso3);
        short edad = 55;
        System.out.println("edad: " + edad);
        char simbolo =  '\u2620';
        System.out.println("simbolo: " + simbolo);
        int totalCoches = cantidadCoche * precioCoche;
        System.out.println("Total de coches: " + totalCoches);
        double totalPeso = peso1 + peso2 + peso3;
        System.out.println("Total peso: " + totalPeso);
        double pesoMedio = (peso1 + peso2 + peso3) / 3;
        System.out.println("El peso medio es: " + pesoMedio);
    }

}
