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
import tallerdepositos.Articulo;
import tallerdepositos.Datos;
import tallerdepositos.Local;
import tallerdepositos.Usuario;
import util.LSE;


/**
 *
 * @author USER
 */
public class Controlador {
    
    Local[][] locales;
    private LSE<Usuario> usuarios;
    private Datos datos;

    
    public Controlador(){
        datos = Singleton.getInstancia().getDatos();
        usuarios = datos.getUsuarios();
        locales = datos.getLocales();
    }

    public Local[][] getLocales() {
        return locales;
    }
    
    public boolean agregarUsuario(Usuario usuario) {
        Usuario aux = buscarUsuario(usuario.getCedula());
        if (aux == null) {
            usuarios.add(usuario);
             guardarTodo();
            return true;
        }
        return false;
    }
       
       public boolean asignarLocal(Local localAsignar) {
        
           for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j <locales[i].length; j++) {
                    
                    if(localAsignar.getNombre().equalsIgnoreCase(locales[i][j].getNombre())){
                        locales[i][j] = localAsignar;
                        guardarTodo();
                        return true;
                    }   
                }
            }
           return false;
       }
       
         public Usuario buscarUsuario(String cedula) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCedula().equals(cedula)) {
                return usuarios.get(i);
            }
        }
        return null;
    }
         
    public Local obtenerLocal(int filas, int columnas){
        return locales[filas][columnas];
    }
    
    public boolean cambiarEstadoLocal(Local local){
        
            for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j <locales[i].length; j++) {
                    
                    if(local.getNombre().equalsIgnoreCase(locales[i][j].getNombre())){
                        local.setEstado("Deshabilitado");
                        locales[i][j] = local;
                        guardarTodo();
                        return true;
                    }   
                }
            }
           return false;
        
    }
    
    
    
    public void guardarTodo() {
        datos.setLocales(locales);
        datos.setUsuarios(usuarios);
        Singleton.getInstancia().setDatos(datos);
        Singleton.getInstancia().escribir();
    }
    
    public boolean agregarArticulo(Local local,Articulo articulo) {
        
        for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j <locales[i].length; j++) {
                    
                    if(local.getNombre().equalsIgnoreCase(locales[i][j].getNombre())){
                        locales[i][j].getArticulos().add(articulo);
                        guardarTodo();
                        return true;
                    }   
                }
            }
           return false;    
    }
    
    public boolean vaciarListaArticulos(Local local) {
        
        for (int i = 0; i < locales.length; i++) {
                for (int j = 0; j <locales[i].length; j++) {
                    
                    if(local.getNombre().equalsIgnoreCase(locales[i][j].getNombre())){
                        ArrayList<Articulo> listaVacia = new ArrayList();
                        locales[i][j].setArticulos(listaVacia); 
                        guardarTodo();
                        return true;
                    }   
                }
            }
           return false;    
    }
    
}
