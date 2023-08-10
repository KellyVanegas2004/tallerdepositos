/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdepositos.controladores;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import tallerdepositos.Datos;
import tallerdepositos.Local;

/**
 *
 * @author briantafur
 */
public class Singleton {

    private static Singleton INSTANCIA = new Singleton();
    private Datos datos;

    private Singleton() {
      datos = obtener();
    }

    public Datos getDatos() {
        return datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    
    

    public static Singleton getInstancia() {
        return INSTANCIA;
    }

    public void escribir() {
        try {
            FileOutputStream archivo = 
                    new FileOutputStream("datos.dat");
            ObjectOutputStream escritor = 
                    new ObjectOutputStream(archivo);
            escritor.writeObject(datos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public Datos obtener() {
        try {      
            FileInputStream archivo = 
                    new FileInputStream("datos.dat");
            ObjectInputStream lector = 
                    new ObjectInputStream(archivo);
            return  (Datos) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            Datos d = new Datos();
            d.iniciar();
           return  d;
        }
    }
       

}
