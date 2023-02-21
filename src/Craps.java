import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int precio, cantidad, contador, subtotal, acumulador, cambio, billete;

        contador =0;
        acumulador =0;

        for(int x=1; x<=5; x++){

            System.out.println("Ingrese el precio del producto");
            precio= lectura.nextInt();

            System.out.println("Ingrese la cantidad del producto");
            cantidad = lectura.nextInt();

            contador = contador+1;

            subtotal = precio*cantidad;

            acumulador = acumulador + subtotal;

        }

        precio = acumulador;

        System.out.println("El valor a pagar por su compra " + precio);

        System.out.println("Con cuanto vas a pagar");
        billete = lectura.nextInt();

        cambio = billete - precio;
        System.out.println("Sus cambio es de " + cambio);
        cambio = lectura.nextInt();

        String contacto;
        System.out.println("Cuentas con telefonia exito");
        contacto = lectura.nextLine();

        if(contacto.equalsIgnoreCase("Si")){
            System.out.println("Los minutos que obtuvo en su compra es de " + contador);
        }
        else{
            System.out.println("No te pierdas mas minutos adquiere tu telefonia movil exito");
        }
        lectura.close();
    }
}
