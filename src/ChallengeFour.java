import java.util.Scanner;

public class ChallengeFour {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int hand =(int) (Math.random()*3+1);
        
        String name;
        System.out.println("Hola, como te llamas");
        name = lectura.next();

        String choice;
        System.out.println(name +"Elige piedra papel o tijera ");
        choice = lectura.next();

       

        if(choice.equalsIgnoreCase("piedra") && hand==1){
            System.out.println("Has elegido piedra has quedado empatado en la maquina ");            
        }
        else if(choice.equalsIgnoreCase("piedra")&& hand==2){
            System.out.println("Has elegido piedra la maquina te gano");
        }
        else if(choice.equalsIgnoreCase("piedra")&& hand==3){
            System.out.println("Has elegido piedra has ganado ");
        }


        else if(choice.equalsIgnoreCase("papel")&& hand==2){
            System.out.println("Has elegino papel has quedado empatado con la maquina ");
        }
        else if(choice.equalsIgnoreCase("papel")&& hand==3){
            System.out.println("Has elegido papel has perdido ");
        }
        else if(choice.equalsIgnoreCase("papel")&& hand==1){
            System.out.println("Has elegido papel has ganado ");
        }


        else if(choice.equalsIgnoreCase("tijera")&& hand==3){
            System.out.println("Has elegido tijera has quedado empatado con la maquina");
        }
        else if(choice.equalsIgnoreCase("tijera")&& hand==2){
            System.out.println("Has elgido tijera has ganado");
        }
        else if(choice.equalsIgnoreCase("tijera")&& hand ==1){
            System.out.println("Has elegido tijera la maquina te gano ");
        }
        
        lectura.close();
    }
}
