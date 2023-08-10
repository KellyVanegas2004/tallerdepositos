/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdepositos;

import java.io.Serializable;
import java.util.ArrayList;
import util.LSE;

/**
 *
 * @author user
 */
public class Datos implements Serializable{
    
    private Local[][] locales;
    
    private LSE<Usuario> usuarios;

    public Datos() {
        
    }  
    
    public void iniciar() {
        usuarios =  new LSE<Usuario>();
        locales = new Local[4][6];
        
        int cont = 0;
        for (int i = 0; i < locales.length; i++) {
            for (int j = 0; j < locales[i].length; j++) {
                locales[i][j] = new Local();
                locales[i][j].setEstado("Desocupado");
                locales[i][j].setNombre("C"+cont);
                cont++;
            }
        }
    }  

    public Datos(Local[][] locales, LSE<Usuario> usuarios) {
        this.locales = locales;
        this.usuarios = usuarios;
    }
    
    public Local[][] getLocales() {
        return locales;
    }

    public void setLocales(Local[][] locales) {
        this.locales = locales;
    }

    public LSE<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LSE<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
  
    
    
}
