/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploDiccionario;

import EjemploColecciones.*;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Equipo {
    private String nombre;
    private HashMap<Integer,Jugador> jugadores; //Integer para datos tipo int

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashMap<>();
    }
    
    public boolean addJugador(Jugador jugador){
        Jugador j = this.jugadores.put(jugador.getCedula(), jugador);
        if(j!=null){
            return true;
        }
        else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public HashMap getJugadores(){
    return this.jugadores;
}    
    
}
