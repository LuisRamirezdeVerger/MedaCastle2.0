package juego;

import java.util.*;
import extras.Temp;

public class Minijuego {
    
    public static void miniJuegoBola() {
        //El escondite de la bola
        Scanner sc = new Scanner(System.in);
        System.out.println("Al entrar en la habitación, te encuentras con un juglar con aspecto de duende. ");
        Temp.Temporizador(2000);
        System.out.println("¡Bienvenido a mi morada! - Te dice con una sonrisa mientras se frota las manos. ");
        Temp.Temporizador(2000);
        System.out.println("Me siento muy generoso hoy, así que te propongo un juego. ");
        Temp.Temporizador(2000);
        System.out.println("Tendrás que adivinar en qué posición se encuentra la bola. ");
        Temp.Temporizador(2000);
        System.out.println("No gastes todos tus intentos en adivinar el vaso correcto o ... ");
        Temp.Temporizador(2000);
        System.out.println("¿Cuántos intentos necesitas para encontrar la llave? Pronto lo sabrás. ");
        Temp.Temporizador(2000);
        System.out.println("Divisas un vaso con una bola dentro y dos vasos vacíos. ");
        Temp.Temporizador(2000);
        System.out.println("El juglar comienza a mover los vasos rápidamente. ");
        Temp.Temporizador(2000);
        System.out.println("Ha sido tan rápido que no has podido seguir el vaso que contiene la bola. ");
        System.out.println("¿En qué posición crees que está la bola? - Te pregunta. ");
        System.out.println("Introduce un número entero del 1 al 3: ");
        try {
            int bola = (int) (Math.random() * 3) + 1;
            int intentos = 3;
            int respuesta = 0;
            boolean encontrado = false;
            while (intentos > 0 && !encontrado) {
                respuesta = sc.nextInt();
                if (respuesta == bola) {
                    System.out.println("¡Imposible! No deberías haber acertado... ");
                    encontrado = true;
                } else {
                    System.out.println("Jajajaja, ¡no has acertado! ");
                    intentos--;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("¡Eso no es un número! Se nota que eres de letras... ");
        }
        
    }
}
