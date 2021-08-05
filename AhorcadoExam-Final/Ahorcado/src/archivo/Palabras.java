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

/**
 *
 * @author Erika
 */
public class Palabras {
      private String ruta;
    private int cont;

    public Palabras(String ruta) {
        this.ruta = ruta;
        this.cont=-1;
    }
    public void escribir(List<String> palabras) {
        try {
            FileWriter archivo = new FileWriter(this.ruta);
            BufferedWriter escritura = new BufferedWriter(archivo);
            for (String palabra : palabras) {
                escritura.append(palabra + "\n");
            }
            escritura.close();
            archivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public List<String> leer(){
        List<String> palabras= new ArrayList<>();
        try {
            FileReader archivo = new FileReader(this.ruta);
            BufferedReader lectura = new BufferedReader(archivo);
            String lineanombre="";
            while (lineanombre!=null) {                
                lineanombre=lectura.readLine();
                if (lineanombre!=null) {
                    String palabra= new String(lineanombre);
                    palabras.add(palabra);
                    this.cont++;
                }
            }
            lectura.close();
            archivo.close();
            return palabras;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return palabras;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }  
}