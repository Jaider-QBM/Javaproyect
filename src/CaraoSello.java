import java.util.Scanner;

public class CaraoSello {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
            int moneda =(int) (Math.random()*2+1);
        
        String name;
        System.out.println("Hola, Como te llamas? ");
        name = lectura.nextLine();

        String eleccion;
        System.out.println(name +" Que vas a elegir cara o sello?");
        eleccion = lectura.nextLine();

        if(eleccion.equals("cara")&& moneda==1){
            System.out.println("Has elegido  cara has ganado");
        }
        else if(eleccion.equals("sello")&& moneda==2){
            System.out.println("Has elegido sello has ganado");
        }
        else{
            System.out.println("Has perdido has elegido " + eleccion);
        }

        lectura.close();
    }
}
