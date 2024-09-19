package com.mycompany.user.igu;

import com.mycompany.user.logic.Controladora;
import com.mycompany.user.logic.User;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {

    Controladora control;
    User user;
    

    public PrincipalAdmin(Controladora control, User user) {
        initComponents();
        this.control = control;
        this.user = user;
       
    }

    PrincipalAdmin() {
       
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUser = new javax.swing.JTable();
        btnCrear = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        btnBorrar = new javax.swing.JToggleButton();
        btnRecargar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        txtNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA ADMINISTRADOR DE USUARIOS");

        jtUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtUser);

        btnCrear.setText("Crear Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar Usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar Tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNombreUser.setEditable(false);
        txtNombreUser.setText("jTextField1");
        txtNombreUser.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRecargar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrear)
                            .addComponent(btnEditar)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnCrear)
                        .addGap(33, 33, 33)
                        .addComponent(btnEditar)
                        .addGap(33, 33, 33)
                        .addComponent(btnBorrar)
                        .addGap(28, 28, 28)
                        .addComponent(btnRecargar)
                        .addGap(36, 36, 36)
                        .addComponent(btnSalir)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

         CreateUser create = new CreateUser(control);
        create.setVisible(true);
        create.setLocationRelativeTo(null);


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        // Validamos que la tabla no este vacía
        if (jtUser.getRowCount() > 0) {

            //validamos que se halla seleccionado una fila
            if (jtUser.getSelectedRow() != -1) {
                
                
                //obtenemos el id de la fila seleccionada 
              
                int id = Integer.parseInt( String.valueOf(jtUser.getValueAt(jtUser.getSelectedRow(), 0)));
                 
                EditUser edit = new EditUser(control, id);
                edit.setVisible(true);
                edit.setLocationRelativeTo(null);
                

            }else{
                JOptionPane.showMessageDialog(null, "Deve seleccionár un elemento de la tabla");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tabla vacia.. no hay usuarios a modificar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTabla2();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       
        
          // Validamos que la tabla no este vacía
        if (jtUser.getRowCount() > 0) {

            //validamos que se halla seleccionado una fila
            if (jtUser.getSelectedRow() != -1) {
                
                
                //obtenemos el id de la fila seleccionada 
              
                int id = Integer.parseInt( String.valueOf(jtUser.getValueAt(jtUser.getSelectedRow(), 0)));
                 
               
                control.eliminarUsuario(id);
                
                JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito");
              
                cargarTabla2();

            }else{
                JOptionPane.showMessageDialog(null, "Deve seleccionár un elemento de la tabla");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tabla vacia.. no hay usuarios a modificar");
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        this.txtNombreUser.setText(user.getUser());
        
         cargarTabla2();
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBorrar;
    private javax.swing.JToggleButton btnCrear;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnRecargar;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUser;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla2() {

        DefaultTableModel modeloTabla2 = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {

                return false;
            }

        };

        String titulos[] = {"Id", "User", "Password", "Rol"

        };

        modeloTabla2.setColumnIdentifiers(titulos);

        List<User> listUser = control.traerUsuarios();

        if (listUser != null) {

            //Recorremos la lista
            for (User us : listUser) {

                //Validamos que solo cuente los usuarios comunes (sin privilegios) de la vase de datos
                //Obtenemos los datos que necesitamos de ese usuario y lo guardamos en un vector de objetos 
                Object objeto[] = {us.getId(), us.getUser(), us.getPassword(), us.getRol().getNombreRol()

                };

                //Agregamos el objeto a la tabla creando una fila
                modeloTabla2.addRow(objeto);

            }

            jtUser.setModel(modeloTabla2);

        }

    }
}
