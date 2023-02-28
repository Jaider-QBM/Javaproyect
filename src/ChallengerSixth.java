import java.util.Scanner;

public class ChallengerSixth {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int givenone = (int) (Math.random()*6+1);
        int giventwo = (int) (Math.random()*6+1);
        int total = (givenone + giventwo);

        String name;
        System.out.println("Hola, como te llamas");
        name = lectura.nextLine();

        String context;
        System.out.println(name +" Tira los dados");


        if(givenone ==1 && giventwo ==1){
            System.out.println("Has sacado un par de unos HAS GANADO " + givenone +" "+ giventwo );
        }
        else if (total ==3){
            System.out.println("Has sacado la suma de tres HAS GANADO " + total);
        }
        else if(total == 11){
            System.out.println("Has sacado la suma de once HAS GANADO " + total);
        }
        else if(total == 2 ){
            System.out.println("Has optenido la suma " + total+ " con los dados HAS GANADO ");
        }
        else if(total == 12){
            System.out.println("Has optenido la suma " + total+ " con los dados HAS GANADO ");
        }
        else if (total == 7){
            System.out.println("Has sacado la suma de siete HAS GANADO " + total);
        }
        else {
            System.out.println("HAS PERDIDO has sacado " + total);
        }

        lectura.close();
    }
}
