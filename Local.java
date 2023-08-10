/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdepositos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Local implements Serializable{
    
    private String nombre;
    private String estado;
    private Usuario propietario;
    private String usuario;
    private String contraseña;
    private ArrayList<Articulo> articulos = new ArrayList();
    private String motivoDeshabilitar;
            
    public Local() {
    }

    public Local(String nombre) {
        this.nombre = nombre;
        this.estado = "Desocupado";
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getMotivoDeshabilitar() {
        return motivoDeshabilitar;
    }

    public void setMotivoDeshabilitar(String motivoDeshabilitar) {
        this.motivoDeshabilitar = motivoDeshabilitar;
    }
    
    
}
