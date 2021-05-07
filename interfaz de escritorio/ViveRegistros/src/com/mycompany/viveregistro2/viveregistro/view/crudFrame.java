
package com.mycompany.viveregistro2.viveregistro.view;

import java.awt.Color;
import javax.swing.UIManager;
import com.mycompany.viveregistro2.viveregistro.ModeloCRUD.Usuario;
import com.mycompany.viveregistro2.viveregistro.ModeloCRUD.usuarioDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class crudFrame extends javax.swing.JFrame {
    
    Usuario us = new Usuario();
    usuarioDAO dao = new usuarioDAO();
    String [] columnas = {"Id", "Nombres", "Apellidos", "Correo", "Contraseña", "Rol"};
    ArrayList<Object[]> datos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    
    
    public crudFrame() {
        initComponents();
        cargar();
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        
        jScrollPane1.getViewport().setBackground(Color.white);
        
    }
    
    public void cargar(){
        modelo.setRowCount(0);
        datos = dao.consultar();
        for(Object[] obj : datos){
            modelo.addRow(obj);
        }
        this.tblDatos.setModel(modelo);
        this.txtId.enable(false);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new rojerusan.RSTableMetro();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("CRUD ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Registro");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Vive");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));

        btnSalir.setBackground(new java.awt.Color(0, 102, 51));
        btnSalir.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setToolTipText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 40, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 70));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 102, 102));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar campos");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 126, 51), 2));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Correo", "Contraseña", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setAltoHead(30);
        tblDatos.setColorBackgoundHead(new java.awt.Color(0, 126, 51));
        tblDatos.setColorFilasForeground1(new java.awt.Color(0, 126, 51));
        tblDatos.setColorFilasForeground2(new java.awt.Color(0, 126, 51));
        tblDatos.setColorForegroundHead(new java.awt.Color(204, 204, 204));
        tblDatos.setColorSelBackgound(new java.awt.Color(0, 126, 51));
        tblDatos.setGrosorBordeFilas(0);
        tblDatos.setGrosorBordeHead(0);
        tblDatos.getTableHeader().setReorderingAllowed(false);
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 840, 280));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 102, 102));
        btnAgregar.setText("Nuevo usuario");
        btnAgregar.setToolTipText("Añadir usuario");
        btnAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 130, 30));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 102, 102));
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modificar usuario");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        btnModificar.setContentAreaFilled(false);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 102, 102));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar un usuario");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 51)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Apellidos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 90, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Correo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 90, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Contraseña");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Rol");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 90, -1));

        txtRol.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRol.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, 30));

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, 30));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 90, 30));

        txtApellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 90, 30));

        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 90, 30));

        txtContraseña.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
       us.setNombres(this.txtNombre.getText());
       us.setApellidos(this.txtApellidos.getText());
       us.setCorreo(this.txtCorreo.getText());
       us.setContraseña(this.txtContraseña.getText());
       us.setRol(this.txtRol.getText());
       dao.agregar(us);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
       us.setId(Integer.parseInt(this.txtId.getText()));
       us.setNombres(this.txtNombre.getText());
       us.setApellidos(this.txtApellidos.getText());
       us.setCorreo(this.txtCorreo.getText());
       us.setContraseña(this.txtContraseña.getText());
       us.setRol(this.txtRol.getText());
       dao.modificar(us);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
       us.setId(Integer.parseInt(this.txtId.getText()));
       dao.eliminar(us);
       cargar();
       limpiar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        this.txtId.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 0)));
        this.txtNombre.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 1)));
        this.txtApellidos.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 2)));
        this.txtCorreo.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 3)));
        this.txtContraseña.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 4)));
        this.txtRol.setText(String.valueOf(this.tblDatos.getValueAt(this.tblDatos.getSelectedRow(), 5)));
        

    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked
    public void limpiar(){
        this.txtId.setText(null);
        this.txtNombre.setText(null);
        this.txtApellidos.setText(null);
        this.txtCorreo.setText(null);
        this.txtContraseña.setText(null);
        this.txtRol.setText(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static rojerusan.RSTableMetro tblDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}