/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author Erika
 */
public class Participantes {
     private String ruta;
     
    public Participantes(String ruta){
        this.ruta=ruta;
    }
    public void escribir(List<Persona> personas){
        try {
            FileWriter archivo=new FileWriter(this.ruta);
            BufferedWriter escritura=new BufferedWriter(archivo);
            for (Persona persona: personas) {
                escritura.append(persona.getNombre()+"\n");
                escritura.append(persona.getPalabra()+"\n");
                escritura.append(persona.getIntentos()+"\n");
            }
            escritura.close();
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Persona> leer(){
        List<Persona> personas=new  ArrayList<>();
        try {
            FileReader archivo=new FileReader(this.ruta);
            BufferedReader lectura=new BufferedReader(archivo);
            String lineaNombre="";
            String lineaPalabra="";
            String lineaIntentos="";
            while(lineaIntentos!=null &&lineaNombre !=null ){
                lineaNombre=lectura.readLine();
                lineaPalabra=lectura.readLine();
                lineaIntentos=lectura.readLine();
                if(lineaIntentos!=null&& lineaNombre!=null){
                    Persona e=new Persona(lineaPalabra,lineaNombre, Integer.parseInt(lineaIntentos));
                    personas.add(e);}
            }
            lectura.close();
            archivo.close();
            return personas;  
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return personas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}