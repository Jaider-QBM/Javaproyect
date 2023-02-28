import java.util.Scanner;

public class ChallengeEight {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int bolita = (int) (Math.random()*4+1);
        int price, amount, subtotal ,accumulator, counter, red,blue, yellow, total, discount, ticket, change, option, buys;

        accumulator =0;
        counter =0;
        option = 1;
        discount =0;

       
        while(option == 1){
            System.out.println("ingresa el precio del producto");
            price = lectura.nextInt();
            System.out.println("Ingrese la cantidad que quiere llevar: ");
            amount = lectura.nextInt();

            System.out.println("Quieres agregar mas productos:");
            System.out.println("1. SI");
            System.out.println("2. NO");
            option = lectura.nextInt();
        
            counter = counter+1;
            subtotal = price*amount;
            accumulator = accumulator + subtotal;

        }
        
        total = accumulator;

        System.out.println("Total a pagar por tu compra es de: " + total);

        if(bolita == 1 && total>=50000){
            red = (total*10)/100;
            System.out.println("Sacaste la bolita roja obteniendo un 10% eso equivale a " + red + " de su compra ");
            discount = total - red;
            System.out.println("Su total de pagar con descuento  es de "+ discount );
            
        }
        else if(bolita == 2 && total>=50000){
            blue =(total*30)/100;
            System.out.println("Sacaste la bolita amarilla obteniendo  un  30 % eso equivale a " +  blue + " de su compra");
            discount = total - blue;
            System.out.println("Su total de pagar con descuento es de "+ discount);
            
        }
        else if(bolita == 3 && total>=50000){
            yellow = (total*50)/100;
            System.out.println("Sacaste la bolita amarilla obteniendo  un  50 % eso equivale a " +  yellow + " de su compra");
            discount = total - yellow;
            System.out.println("Su total de pagar con descuento es de "+ discount);
            
        }
        else if (bolita == 4 && total>=50000){
            System.out.println("Sacaste la bolita blanca obteniendo la compra gratis");
            discount=0;
        }

        else {
            discount=total;
            System.out.println("No tienes ningun descuento: ");

        }

        System.out.println("Con cuanto vas a pagar esta compra: ");
        ticket = lectura.nextInt();
        change = ticket - discount ;

        
        if(ticket<discount){

            System.out.println("No te alcanza para pagar esta compra");
            System.out.println("Vuelve a introducir el valor a pagar ");
            ticket = lectura.nextInt();
            change = ticket - discount;

            if(change <= 0) {
                System.out.println("No te sobro nada, ten un buen dia :)");
            }
            else if(discount==0){
                System.out.println("Gracias por tu compra");
            }
            else{
                System.out.println("Tu cambio es de: " + change);
            }
        }
        else if (ticket>change){
            System.out.println("No te alcanza para pagar esta compra");
            System.out.println("Vuelve a introducir el valor a pagar ");
            ticket = lectura.nextInt();
            change = ticket - discount;

            if(change <= 0) {
                System.out.println("No te sobro nada, ten un buen dia :)");
            }
            else if(discount==0){
                System.out.println("Gracias por tu compra");
            }
            else{
                System.out.println("Tu cambio es de: " + change);
            }
        }
        else if(change <= 0) {
            System.out.println("No te sobro nada, ten un buen dia :)");
        }
        else if(discount==0){
            System.out.println("Gracias por tu compra");
        }
        else{
            System.out.println("Tu cambio es de: " + change);
        }
        
         
        lectura.close();
    }
}
