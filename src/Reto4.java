import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int mano =(int) (Math.random()*3+1);
        
        String name;
        System.out.println("Hola, como te llamas");
        name = lectura.next();

        String eleccion;
        System.out.println(name +"Elige piedra papel o tijera ");
        eleccion = lectura.next();

       

        if(eleccion.equalsIgnoreCase("piedra") && mano==1){
            System.out.println("Has elegido piedra has quedado empatado en la maquina ");            
        }
        else if(eleccion.equalsIgnoreCase("piedra")&& mano==2){
            System.out.println("Has elegido piedra la maquina te gano");
        }
        else if(eleccion.equalsIgnoreCase("piedra")&& mano==3){
            System.out.println("Has elegido piedra has ganado ");
        }


        else if(eleccion.equalsIgnoreCase("papel")&& mano==2){
            System.out.println("Has elegino papel has quedado empatado con la maquina ");
        }
        else if(eleccion.equalsIgnoreCase("papel")&& mano==3){
            System.out.println("Has elegido papel has perdido ");
        }
        else if(eleccion.equalsIgnoreCase("papel")&& mano==1){
            System.out.println("Has elegido papel has ganado ");
        }

        else if(eleccion.equalsIgnoreCase("tijera")&& mano==3){
            System.out.println("Has elegido tijera has quedado empatado con la maquina");
        }
        else if(eleccion.equalsIgnoreCase("tijera")&& mano==2){
            System.out.println("Has elgido tijera has ganado");
        }
        else if(eleccion.equalsIgnoreCase("tijera")&& mano ==1){
            System.out.println("Has elegido tijera la maquina te gano ");
        }
        
        lectura.close();
    }
}
