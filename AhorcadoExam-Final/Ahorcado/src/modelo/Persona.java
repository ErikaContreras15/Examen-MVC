/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Erika
 */
public class Persona {
    private String nombre;
    private String palabra;
    private int intentos;
    
    //Constructor
    public Persona(String nombre, String palabra, int intentos) {    
        this.nombre = nombre;
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public Persona(String nombre, int intentos, int aciertos) {
      this.nombre = nombre;
      this.intentos = intentos;
    }

    //Metodos Get y Set
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", palabra=" + palabra + ", intentos=" + intentos + '}';
    }

}