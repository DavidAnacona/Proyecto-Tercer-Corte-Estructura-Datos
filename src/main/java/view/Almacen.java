package view;

import controller.AlmacenCtrl;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import persist.AlmacenDAO;

public class Almacen extends javax.swing.JInternalFrame {

    private DefaultListModel modelo;
    
    public Almacen() {
        initComponents();
        inicializarComponentes();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoAlmacen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreSede = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlmacenes = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Almacenes");
        setName("Almacen"); // NOI18N

        jLabel1.setText("Gestionar Almacenes");

        jLabel2.setText("Codigo almacen:");

        jLabel3.setText("Nombre sede:");

        jLabel4.setText("Direccion:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lstAlmacenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstAlmacenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstAlmacenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        activarCamposAlmacen(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(lstAlmacenes.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this,"Debe seleccionar primero un registro");
        }else{
            activarCamposAlmacen(true);
            lstAlmacenes.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AlmacenCtrl.instancia().addAlmacen(txtCodigoAlmacen.getText(), txtNombreSede.getText(), txtDireccion.getText());
        limpiarCampos();
        activarCamposAlmacen(false);
        JOptionPane.showMessageDialog(this, "Registro Adicionado con exito");
        cargarListaAlmacenes();
        guardarAlmacen();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        AlmacenCtrl.instancia().modificarAlmacen(txtCodigoAlmacen.getText(), txtNombreSede.getText(), txtDireccion.getText());
        limpiarCampos();
        activarCamposAlmacen(false);
        lstAlmacenes.setEnabled(true);
        cargarListaAlmacenes();
        JOptionPane.showMessageDialog(this, "Registro modificado con exito");
        guardarAlmacen();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!lstAlmacenes.isSelectionEmpty()){
            AlmacenCtrl.instancia().eliminarAlmacen();
            limpiarCampos();
            activarCamposAlmacen(false);
            cargarListaAlmacenes();
            JOptionPane.showMessageDialog(this, "Registro eliminado con exito");
            guardarAlmacen();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lstAlmacenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstAlmacenesMouseClicked
        if(lstAlmacenes.isEnabled() == true){
            int index = lstAlmacenes.getSelectedIndex();
            AlmacenCtrl.instancia().buscarAlmacen(index);
            txtCodigoAlmacen.setText(String.valueOf(AlmacenCtrl.instancia().getAlmacen().getCodigoAlmacen()));
            txtNombreSede.setText(AlmacenCtrl.instancia().getAlmacen().getNombreSede());           
            txtDireccion.setText(AlmacenCtrl.instancia().getAlmacen().getDireccion());
        }
    }//GEN-LAST:event_lstAlmacenesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstAlmacenes;
    private javax.swing.JTextField txtCodigoAlmacen;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreSede;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
        cargarListaAlmacenes();
    }

    private void cargarListaAlmacenes() {
        modelo = new DefaultListModel();
        
        AlmacenCtrl.instancia().getListaAlmacen().inicio();
        for(int i=0; i<AlmacenCtrl.instancia().getListaAlmacen().size(); i++){
            modelo.addElement(AlmacenCtrl.instancia().getListaAlmacen().next());
        }
        lstAlmacenes.setModel(modelo);
        lstAlmacenes.updateUI();
    }
    
    private void limpiarCampos(){
        txtCodigoAlmacen.setText("");
        txtNombreSede.setText("");
        txtDireccion.setText("");
    }
    
    private void activarCamposAlmacen(boolean b) {
        txtCodigoAlmacen.setEnabled(b);
        txtNombreSede.setEnabled(b);
        txtDireccion.setEnabled(b);
    }

    private void guardarAlmacen() {
        AlmacenDAO.instancia().guardarAlmacen(AlmacenCtrl.instancia().getListaAlmacen());
    }
}
