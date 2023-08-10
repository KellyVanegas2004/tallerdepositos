/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdepositos.vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import tallerdepositos.Local;
import tallerdepositos.controladores.Controlador;

/**
 *
 * @author 416-pc13
 */
public class VentanaLocales extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form VentanaLocales
     */
    
    JButton[][] botones = new JButton[4][6];
    public Controlador controlador;
    private Local[][] locales;
    
    
    public VentanaLocales() {
        initComponents();
        controlador = new Controlador();
        locales = controlador.getLocales();
        cargarBotones();
        //validarPosiciones();
        setLocationRelativeTo(this);
    }
    
    
    
      private void cargarBotones() {
        int ancho = 60;
        int alto = 40;
        int separado = 20;
        int localNumero = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {                
                botones[i][j] = new JButton();
                //setBounds(posX, posY, ancho, alto)
                botones[i][j].setBounds(
                        //                        (i * ancho + separado),
                        (j * ancho + separado),
                        (i * alto + separado),
                        ancho, alto);
                botones[i][j].addActionListener(this);
                
                panelPpl.add(botones[i][j]);
                if(locales[i][j].getEstado().equalsIgnoreCase("Desocupado")){
                    botones[i][j].setBackground(Color.WHITE);
                }else if(locales[i][j].getEstado().equalsIgnoreCase("Ocupado")){
                    botones[i][j].setBackground(Color.BLUE);
                } else if (locales[i][j].getEstado().equalsIgnoreCase("Deshabilitado")){
                    botones[i][j].setBackground(Color.DARK_GRAY);
                }
                
                if(i == 1 || j == 2){
                botones[i][j].setText("");
                botones[i][j].setBackground(Color.red);
                botones[i][j].setEnabled(false);
                
                
                }else{
                botones[i][j].setText("C " + String.valueOf(localNumero));
                localNumero++;
                }
                
            }
        }
    }
      
      public void validarPosiciones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j].setBackground(Color.white);
            }
        }
    }
      
      public void actionPerformed(ActionEvent ae) {
          
            for (int i = 0; i < botones.length; i++) {
                for (int j = 0; j < botones[i].length; j++) {
                    if (ae.getSource().equals(botones[i][j])) {
                        Local local = controlador.obtenerLocal(i, j);
                        if (local.getEstado().equalsIgnoreCase("Desocupado")) {
                            VentanaAsignarLocal ventanaAsignar = new VentanaAsignarLocal(local);
                            ventanaAsignar.setVisible(true);
                            this.dispose();
                            //finJuego = true;
                        }else if(locales[i][j].getEstado().equalsIgnoreCase("Ocupado")){
                            
                            String usuario = JOptionPane.showInputDialog("Ingrese el usuario asignado para abrir el almacen");
                            String contrasenia = JOptionPane.showInputDialog("Ingrese la contraseña asignada");
                            
                            if(local.getUsuario().equals(usuario) && local.getContraseña().equals(contrasenia)){
                                VentanaAlmacen ventanaAlmacen = new VentanaAlmacen(local);
                                ventanaAlmacen.setVisible(true);
                                this.dispose();
                            }else{
                            JOptionPane.showMessageDialog(null, "El usuario y/o contraseña ingresada no es correcto, por favor intentelo de nuevo");
                            
                            }
                            
                            
                        } else if (locales[i][j].getEstado().equalsIgnoreCase("Deshabilitado")){
                            JOptionPane.showMessageDialog(null, "Motivo por el cual se ha deshabilitado el almacen es: \n"
                                    +locales[i][j].getMotivoDeshabilitar());
                        }

                    }
                }
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPpl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPpl.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout panelPplLayout = new javax.swing.GroupLayout(panelPpl);
        panelPpl.setLayout(panelPplLayout);
        panelPplLayout.setHorizontalGroup(
            panelPplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        panelPplLayout.setVerticalGroup(
            panelPplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("TALLER DE DEPOSITOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPpl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(panelPpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPpl;
    // End of variables declaration//GEN-END:variables
}
