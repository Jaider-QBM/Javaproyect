import java.util.Scanner;

public class RetoTwo {
    public static void main(String[] args) {
        Scanner lectura  = new Scanner(System.in);
        double cantidad, total, efectivo, devuelto;
        System.out.println("Ingrese la cantidad de objetos");
        cantidad = lectura.nextDouble();

        total = cantidad + 10000;
        System.out.println("El dinero total a pagar es " + total);

        System.out.println("Ingrese la cantidad con el que vas a pagar");
        efectivo = lectura.nextDouble();

        devuelto = efectivo - total;
        System.out.println("El total a pagar es " + total+ "mil, se recibe " + efectivo + "mil, y el cambio es de " + devuelto+ "mil." );

        lectura.close();
    }
}
