/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteCtrl;
import controller.FacturaCtrl;
import controller.ModeloFactura;
import controller.ProductoCtrl;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vanes
 */
public class Factura extends javax.swing.JInternalFrame {

    private DefaultTableModel tablaDetalleModel;
    int clicTabla;

    public Factura() {
        initComponents();
        tablaDetalleModel = (DefaultTableModel) tblProductosFactura.getModel();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarClienteFactura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreBuscado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoProductoBuscado = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtProductoBuscado = new javax.swing.JTextField();
        btnAgregarProductoFactura = new javax.swing.JButton();
        btnEliminarProductoFactura = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductosFactura = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadFactura = new javax.swing.JTextField();
        btnAgregarFactura = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoFactura = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Codigo cliente:");

        jLabel2.setText("Gestionar Factura");

        btnBuscarClienteFactura.setText("Buscar Cliente");
        btnBuscarClienteFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteFacturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre cliente:");

        txtNombreBuscado.setEditable(false);
        txtNombreBuscado.setFocusable(false);

        jLabel4.setText("codigo producto a comprar:");

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Informacion:");

        txtProductoBuscado.setEditable(false);
        txtProductoBuscado.setFocusable(false);

        btnAgregarProductoFactura.setText("Agregar producto");
        btnAgregarProductoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoFacturaActionPerformed(evt);
            }
        });

        btnEliminarProductoFactura.setText("Eliminar producto");
        btnEliminarProductoFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoFacturaActionPerformed(evt);
            }
        });

        tblProductosFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Cantidad"
            }
        ));
        tblProductosFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosFacturaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductosFactura);

        jLabel6.setText("Cantidad comprada:");

        btnAgregarFactura.setText("Agregar Factura");
        btnAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFacturaActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo factura:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel2)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregarFactura)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigoProductoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBuscarProducto))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNombreBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtProductoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCodigoFactura))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarClienteFactura))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidadFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregarProductoFactura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminarProductoFactura)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoProductoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProductoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProductoFactura)
                    .addComponent(btnEliminarProductoFactura)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidadFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarFactura)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteFacturaActionPerformed
        int codigo = Integer.parseInt(txtBuscarCodigo.getText());
        ClienteCtrl.instancia().buscarClientePorNumIdentidad(codigo);
        if(ClienteCtrl.instancia().getCliente() == null){
            JOptionPane.showMessageDialog(this, "El cliente debe de estar registrado para facturar");
            limpiarCamposCliente();
        }else{
            txtNombreBuscado.setText(ClienteCtrl.instancia().getCliente().getNombre().concat(" ")
                    .concat(ClienteCtrl.instancia().getCliente().getApellido())); 
        }
    }//GEN-LAST:event_btnBuscarClienteFacturaActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        int codigo = Integer.parseInt(txtCodigoProductoBuscado.getText());
        ProductoCtrl.instancia().buscarProductoPorCodigo(codigo);
        if(ProductoCtrl.instancia().getProducto()== null){
            JOptionPane.showMessageDialog(this, "El producto no se encuentra registrado");
            limpiarCamposProducto();
        }else{
            txtProductoBuscado.setText(ProductoCtrl.instancia().getProducto().getNombre().concat(" , Precio: ")
                    .concat(Double.toString(ProductoCtrl.instancia().getProducto().getPrecio()))); 
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarProductoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoFacturaActionPerformed
        tablaDetalleModel.addRow(new Object[]{txtCodigoProductoBuscado.getText(),ProductoCtrl.instancia().getProducto().getNombre(),ProductoCtrl.instancia().getProducto().getPrecio(),txtCantidadFactura.getText()});
        limpiarCamposProducto();
    }//GEN-LAST:event_btnAgregarProductoFacturaActionPerformed

    private void tblProductosFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosFacturaMouseClicked
        
        clicTabla = tblProductosFactura.rowAtPoint(evt.getPoint());
        
        Long codigoProducto = Long.parseLong((String) tblProductosFactura.getValueAt(clicTabla, 0));
        String nombreProducto = "" + tblProductosFactura.getValueAt(clicTabla, 1);
        int cantidadProducto = Integer.parseInt((String) tblProductosFactura.getValueAt(clicTabla, 3));
        
        txtCodigoProductoBuscado.setText(String.valueOf(codigoProducto));
        txtProductoBuscado.setText(nombreProducto);
        txtCantidadFactura.setText(String.valueOf(cantidadProducto));
        
        
    }//GEN-LAST:event_tblProductosFacturaMouseClicked

    private void btnEliminarProductoFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoFacturaActionPerformed
        DefaultTableModel tablaProducto = (DefaultTableModel) tblProductosFactura.getModel();
        int fila = tblProductosFactura.getSelectedRow();
        if(fila >=0){
            tablaProducto.removeRow(fila);
        }
        limpiarCamposProducto();
    }//GEN-LAST:event_btnEliminarProductoFacturaActionPerformed

    private void btnAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFacturaActionPerformed
       /*FacturaCtrl.instancia().addFacturas(txtCodigoFactura.getText(), (Cliente) txtBuscarCodigo.getText(), , title);
       FacturaCtrl.instancia().addFacturas(title, cliente, almacen, title);*/
    }//GEN-LAST:event_btnAgregarFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFactura;
    private javax.swing.JButton btnAgregarProductoFactura;
    private javax.swing.JButton btnBuscarClienteFactura;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarProductoFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductosFactura;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtCantidadFactura;
    private javax.swing.JTextField txtCodigoFactura;
    private javax.swing.JTextField txtCodigoProductoBuscado;
    private javax.swing.JTextField txtNombreBuscado;
    private javax.swing.JTextField txtProductoBuscado;
    // End of variables declaration//GEN-END:variables

   
    public void limpiarCamposCliente(){
        txtBuscarCodigo.setText("");
        txtNombreBuscado.setText("");
        
    }
    public void limpiarCamposProducto(){
        txtCodigoProductoBuscado.setText("");
        txtProductoBuscado.setText("");
        txtCantidadFactura.setText("");
    }
}
