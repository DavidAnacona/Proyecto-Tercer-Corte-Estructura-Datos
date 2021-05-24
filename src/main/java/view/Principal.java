package view;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        opGestionarCliente = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        opGestionarProducto = new javax.swing.JMenuItem();
        menuAlmacen = new javax.swing.JMenu();
        opGestionarAlmacen = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opGestionarFactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        menuCliente.setText("Cliente");

        opGestionarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opGestionarCliente.setText("Gestionar Cliente");
        opGestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGestionarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(opGestionarCliente);

        jMenuBar1.add(menuCliente);

        menuProducto.setText("Producto");

        opGestionarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opGestionarProducto.setText("Gestionar Producto");
        opGestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGestionarProductoActionPerformed(evt);
            }
        });
        menuProducto.add(opGestionarProducto);

        jMenuBar1.add(menuProducto);

        menuAlmacen.setText("Almacen");

        opGestionarAlmacen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opGestionarAlmacen.setText("Gestionar Almacen");
        opGestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGestionarAlmacenActionPerformed(evt);
            }
        });
        menuAlmacen.add(opGestionarAlmacen);

        jMenuBar1.add(menuAlmacen);

        jMenu1.setText("Factura");

        opGestionarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opGestionarFactura.setText("Gestionar Factura");
        opGestionarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGestionarFacturaActionPerformed(evt);
            }
        });
        jMenu1.add(opGestionarFactura);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opGestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGestionarClienteActionPerformed
        Cliente cliente = new Cliente();
        escritorio.add(cliente);
        cliente.show();
    }//GEN-LAST:event_opGestionarClienteActionPerformed

    private void opGestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGestionarProductoActionPerformed
        Productos productos = new Productos();
        escritorio.add(productos);
        productos.show();
    }//GEN-LAST:event_opGestionarProductoActionPerformed

    private void opGestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGestionarAlmacenActionPerformed
        Almacen almacen = new Almacen();
        escritorio.add(almacen);
        almacen.show();
    }//GEN-LAST:event_opGestionarAlmacenActionPerformed

    private void opGestionarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGestionarFacturaActionPerformed
        Factura factura = new Factura();
        escritorio.add(factura);
        factura.show();
    }//GEN-LAST:event_opGestionarFacturaActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAlmacen;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenuItem opGestionarAlmacen;
    private javax.swing.JMenuItem opGestionarCliente;
    private javax.swing.JMenuItem opGestionarFactura;
    private javax.swing.JMenuItem opGestionarProducto;
    // End of variables declaration//GEN-END:variables
}
