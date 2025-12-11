package PEO;
import java.util.Scanner;
import java.util.Arrays; // Necesario para imprimir el array

public class Vaixell {
    
    public static void main(String[] args) {
        Vaixell p = new Vaixell();
        p.principal(); 
    }

    public void principal(){
        
        Scanner escaner = new Scanner(System.in); 
        
        int tablerojugadorA[] = new int[40];
            
        colocarAutomatico(tablerojugadorA, "Jugador AI");


        System.out.println("");
        System.out.println("--- INICI DEL JOC ---");
        System.out.println("");
        


        escaner.close();
    }
    
    
    public void colocarAutomatico(int[] tablero, String nombreJugador) {
        int medida = tablero.length;
        int posicion_aleatoria;
        
        System.out.println("\n--- Colocación automática de 5 barcos para La IA" + " ---");

        for(int i = 0; i < 5; i++) {
            boolean casilla_ocupada = true;
            
            while (casilla_ocupada) {
                
                posicion_aleatoria = (int) (Math.random() * medida);

                if (tablero[posicion_aleatoria] == 0) { 
                    casilla_ocupada = false;
                    
                    tablero[posicion_aleatoria] = 1;
                }
                
            }
        }
        System.out.println("------------------");
        System.out.println(" Barcos Colocados");
        System.out.println("------------------");
    }

}