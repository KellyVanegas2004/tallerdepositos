/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdepositos.vistas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import tallerdepositos.Articulo;
import tallerdepositos.Local;
import tallerdepositos.controladores.Controlador;

/**
 *
 * @author VANEGAS
 */
public class VentanaAlmacen extends javax.swing.JFrame {

    private Controlador controlador;
    private Local local;
    private DefaultListModel modelo;
    /**
     * Creates new form VentanaAlmacen
     */
    public VentanaAlmacen(Local local) {
        initComponents();
        controlador = new Controlador();
        this.local = local;
        jListArticulos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
        modelo = new DefaultListModel();
        for (int i = 0; i < local.getArticulos().size(); i++)
        {
            modelo.addElement(local.getArticulos().get(i));
        }
        jListArticulos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListArticulos = new javax.swing.JList<>();
        btnAgregarArticulo = new javax.swing.JButton();
        btnEliminarArticulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDeshabilitarAlmacen = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListArticulos);

        btnAgregarArticulo.setText("AGREGAR ARTICULO");
        btnAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArticuloActionPerformed(evt);
            }
        });

        btnEliminarArticulo.setText("VACIAR LISTA");
        btnEliminarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArticuloActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de Articulos");

        btnDeshabilitarAlmacen.setText("DESHABILITAR ALMACEN");
        btnDeshabilitarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarAlmacenActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR INICIO");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAgregarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeshabilitarAlmacen)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addGap(55, 55, 55))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarArticulo)
                        .addGap(89, 89, 89)
                        .addComponent(btnDeshabilitarAlmacen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArticuloActionPerformed
        // TODO add your handling code here:
        Local localActual = local;
        String nombreArticulo = JOptionPane.showInputDialog("Ingrese el nombre del articulo");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        
        Articulo articulo = new Articulo();
        articulo.setNombre(nombreArticulo);
        articulo.setCantidad(cantidad);
        
        boolean res = controlador.agregarArticulo(local,articulo); 
        if(res){
            JOptionPane.showMessageDialog(null, "Se ha agregado el articulo correctamente a la lista");
        for (int i = 0; i < local.getArticulos().size(); i++)
        {
            modelo.addElement(local.getArticulos().get(i));
        }
        jListArticulos.setModel(modelo);
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un error al agregar el articulo");
        }
        
    }//GEN-LAST:event_btnAgregarArticuloActionPerformed

    private void btnEliminarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArticuloActionPerformed
        // TODO add your handling code here:
        Local localActual = local;
        boolean res = controlador.vaciarListaArticulos(localActual); 
        if(res){
        modelo = new DefaultListModel();
        jListArticulos.setModel(modelo);
        JOptionPane.showMessageDialog(null, "Se ha vaciado la lista de articulos correctamente");
        }else{
        JOptionPane.showMessageDialog(null, "Hubo un error al vaciar la lista de articulos");
        }
    }//GEN-LAST:event_btnEliminarArticuloActionPerformed

    private void btnDeshabilitarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarAlmacenActionPerformed
        // TODO add your handling code here:
        String motivo = JOptionPane.showInputDialog("Ingrese el motivo por el cual quiere deshabilitar el almacen");
        if(motivo.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el motivo por el cual quiere deshabilitar el almacen");
        }else{
            Local localDeshabilitar = local;
            localDeshabilitar.setMotivoDeshabilitar(motivo);
            boolean res = controlador.cambiarEstadoLocal(localDeshabilitar); 
            if(res){
                JOptionPane.showMessageDialog(null, "Se ha deshabilitado el local correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al asignar el local");
            }
            VentanaLocales ventanaLocales = new VentanaLocales();
            ventanaLocales.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_btnDeshabilitarAlmacenActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        ventanaInicioAdmin ventanaAdmin = new ventanaInicioAdmin();
        ventanaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArticulo;
    private javax.swing.JButton btnDeshabilitarAlmacen;
    private javax.swing.JButton btnEliminarArticulo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListArticulos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
