import java.util.Scanner;

public class ChallengeNine {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int currency =(int) (Math.random()*2+1);
        int budget, acumulador, contador, dinero, opcion, gano, perdio, incluido;

        contador =0;
        opcion =1;
        gano =0;

        String name;
        System.out.println("Hola como te llamas?");
        name = lectura.nextLine();

        System.out.println("Ingresa el dinero que tienes disponible apostar el dia de hoy");
        budget = lectura.nextInt();

        while(opcion == 1){

            contador = contador +1;
            System.out.println("Cuanto vas apostar en el carisellazo");
            dinero = lectura.nextInt();

            String eleccion;
            System.out.println(" Que vas a elegir cara o sello ");
            eleccion = lectura.next();

            if(dinero<=budget){
                if(eleccion.equalsIgnoreCase("Cara") && currency == 1 || eleccion.equalsIgnoreCase("Sello") && currency == 2){
                    System.out.println("Has elegido  cara has ganado");
                    gano = dinero*2;
                    acumulador = budget + gano;
                    System.out.println("Tu dinero que tienes disponible para apostar es de: " + budget);
                }
    
                else{
                    System.out.println("Has perdido has elegido has elegido " + eleccion +  "y has perdido tu apuesta  " + dinero);
                    perdio = budget - dinero;
                    acumulador = budget - dinero;
                    System.out.println("Tu dinero que tienes disponible para apostar es de: " + budget);
                }
            }
            else{
                System.out.println("No te alcanza para apostar por que tu presupuesto se agoto, NO PUEDES APOSTAR MAS, ten un buen dia" );
            } 
            
            System.out.println( name + " Quieres jugar otra vez  carisellazo");
            System.out.println("1. SI");
            System.out.println("2. NO");
            opcion = lectura.nextInt();

        }

        System.out.println("Has jugado " + contador + " el dimero que acumulaste es de " + budget );
    }
}
