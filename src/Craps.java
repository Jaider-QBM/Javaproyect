import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int price, amount, counter, subtotal, accumulator, change, ticket;

        counter =0;
        accumulator =0;

        for(int x=1; x<=5; x++){

            System.out.println("Ingrese el precio del producto");
            price= lectura.nextInt();

            System.out.println("Ingrese la cantidad del producto");
            amount = lectura.nextInt();

            counter = counter+1;

            subtotal = price*amount;

            accumulator = accumulator + subtotal;

        }

        price = accumulator;

        System.out.println("El valor a pagar por su compra " + price);

        System.out.println("Con cuanto vas a pagar");
        ticket = lectura.nextInt();

        change = ticket - price;
        System.out.println("Sus cambio es de " + change);
        change = lectura.nextInt();

        String contacto;
        System.out.println("Cuentas con telefonia exito");
        contacto = lectura.nextLine();

        if(contacto.equalsIgnoreCase("Si")){
            System.out.println("Los minutos que obtuvo en su compra es de " + counter);
        }
        else{
            System.out.println("No te pierdas mas minutos adquiere tu telefonia movil exito");
        }
        lectura.close();
    }
}
