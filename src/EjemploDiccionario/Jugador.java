/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploDiccionario;

import EjemploColecciones.*;

/**
 *
 * @author Estudiante
 */
public class Jugador {
    private int cedula;
    private String nombre;

    public Jugador(int cedula, String nombre) {
        this.cedula= cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Jugador{" + "cedula=" + cedula + ", nombre=" + nombre + '}';
    }
    
}
