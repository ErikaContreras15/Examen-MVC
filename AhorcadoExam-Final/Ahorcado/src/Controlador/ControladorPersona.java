/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.Persona;
import archivo.Palabras;

/**
 *
 * @author Erika
 */
public class ControladorPersona {
    
    private List<Persona> Persona;
    private Persona seleccionado;
  
    public boolean crear(String nombre,int intentos){
        Persona persona=new Persona(this.leer(), nombre, intentos);
        seleccionado=persona;
        return Persona.add(persona);
    }
    public Persona buscar(String nombre){
        for (Persona persona : Persona) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null;
    }
    public boolean actualizar(String nombre,int intentos){
        Persona persona=this.buscar(nombre);
        if (persona!=null) {
            int posicion=Persona.indexOf(persona);
            persona.setIntentos(intentos);
            persona.setNombre(nombre);
            Persona.set( posicion,persona);
            return true;
        }
        return false;
    }
    
    public String leer(){
        Random r=new Random();
        List<String> lista= new ArrayList<>();
        int n=r.nextInt(lista.size()-1);
        String palabra=lista.get(n);
        return palabra;
    }


    public List<Persona> getAhorcados() {
        return Persona;
    }

    public void setAhorcados(List<Persona> Ahorcados) {
        this.Persona= Persona;
    }

    public Persona getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Persona seleccionado) {
        this.seleccionado = seleccionado;
    }

}


