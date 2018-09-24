/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploColecciones;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Equipo e = new Equipo ("U");
        Jugador j1 = new Jugador ("V");
        boolean resultado = e.addJugador(j1);
        
        if(resultado==true){
            System.out.println("Ok");
        }
        else System.out.println("KO");
        
        
        ArrayList<Jugador> lista= e.getJugadores();
        
        for(Jugador jugador: lista){
            System.out.println(jugador.getNombre());
            System.out.println(jugador); // Para hcer esto hay que tener el metodo toString en la clase jugador en este caso
        }
         // Hace lo mismo que el anterior for
        for(int i=0; i<lista.size(); i++){
            Jugador jugador = lista.get(i);
            System.out.println(jugador.getNombre());
        }
    }
}
