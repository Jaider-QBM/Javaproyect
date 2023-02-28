import java.util.Scanner;

public class ChallengeSeventh {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int bolita = (int) (Math.random()*3+1);
        int buys, discount, red, blue, yellow, white, subtotal, amount;

        String name;
        System.out.println("Hola como te llamas?");
        name = lectura.nextLine();

        System.out.println("Ingresa el precio del producto");
        buys = lectura.nextInt();

        System.out.println("Ingresa la cantidad que quieres llevar");
        amount = lectura.nextInt();

        subtotal = buys*amount;
        System.out.println("El total a pagar es de: " +  subtotal);

        if(buys>=50000 && bolita ==1){
            red = (subtotal*10)/100;
            System.out.println("Sacaste la bolita roja obteniendo un 10% eso equivale a " + red + " de su compra ");
            discount = subtotal - red;
            System.out.println("Su total de pagar es de "+ discount );
        }
        else if(buys>=50000 && bolita == 2){
            blue =(subtotal*30)/100;
            System.out.println("Sacaste la bolita azul obteniendo un 30%  eso equivale a " + blue +" de su compra");
            discount = subtotal - blue;
            System.out.println("Su total de pagar es de " + discount );
        }
        else if(buys>=50000 && bolita == 3){
            yellow = (subtotal*50)/100;
            System.out.println("Sacaste la bolita amarilla obteniendo  un  50 % eso equivale a " +  yellow + " de su compra");
            discount = subtotal - yellow;
            System.out.println("Su total de pagar es de " + yellow );
        }
        else{
            System.out.println("Sacaste la bolita blanca obteniendo la compra gratis");
        }

        lectura.close();
    }
}
