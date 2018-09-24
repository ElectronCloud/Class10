/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploDiccionario;

import EjemploColecciones.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Equipo e = new Equipo ("U");
        Jugador j1 = new Jugador (123, "V");
        e.addJugador(j1);
        
        HashMap jugadores = e.getJugadores();
        
        //Buscar por clave
        Jugador jugador = (Jugador)jugadores.get(123);
        
        System.out.println(jugador.getNombre());
        
        Collection jgs = jugadores.values();
        
        for (Object jg : jgs) {
            System.out.println(jg);
        }
        
    }
}
