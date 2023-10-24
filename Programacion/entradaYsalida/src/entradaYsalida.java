
import java.util.Scanner;

public class entradaYsalida {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor de tipo byte: ");
        byte valorByte = sc.nextByte();

        System.out.print("Introduce un valor de tipo short: ");
        short valorShort = sc.nextShort();

        System.out.print("Introduce un valor de tipo int: ");
        int valorInt = sc.nextInt();

        System.out.print("Introduce un valor de tipo long: ");
        long valorLong = sc.nextLong();

        System.out.print("Introduce un valor de tipo boolean (true o false): ");
        boolean valorBoolean = sc.nextBoolean();

        System.out.print("Introduce un valor de tipo String: ");
        String valorString = sc.next();


        System.out.println("Tus valores introducidos:");
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("boolean: " + valorBoolean);
        System.out.println("String: " + valorString);

    }
}






