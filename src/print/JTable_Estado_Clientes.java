/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package print;

import config.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class JTable_Estado_Clientes extends javax.swing.JFrame {

    conexion con1 = new conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    int flagBoton = 0;
    int carFlaAct = 0;

    public JTable_Estado_Clientes() {
        initComponents();
        tituloTabla.setText("C1Z_CONTROL_ESTADO_CLIENTES");
        setLocationRelativeTo(null);
        ActualizarBoton.setEnabled(false);
        consulta();
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
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AgregarBoton = new javax.swing.JButton();
        ModificarBoton = new javax.swing.JButton();
        EliminarBoton = new javax.swing.JButton();
        CancelarBoton = new javax.swing.JButton();
        InactivarBoton = new javax.swing.JButton();
        ReactivarBoton = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        SalirBoton = new javax.swing.JButton();
        tituloTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));

        jLabel2.setText("Codigo");

        txtCode.setEditable(false);
        txtCode.setName(""); // NOI18N

        jLabel3.setText("Nombre");

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Estado Registro");

        txtEstado.setEditable(false);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("BASE DE DATOS"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Estado"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES"));

        AgregarBoton.setText("Adicionar");
        AgregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBotonActionPerformed(evt);
            }
        });

        ModificarBoton.setText("Modificar");
        ModificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBotonActionPerformed(evt);
            }
        });

        EliminarBoton.setText("Eliminar");
        EliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBotonActionPerformed(evt);
            }
        });

        CancelarBoton.setText("Cancelar");
        CancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBotonActionPerformed(evt);
            }
        });

        InactivarBoton.setText("Inactivar");
        InactivarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InactivarBotonActionPerformed(evt);
            }
        });

        ReactivarBoton.setText("Reactivar");
        ReactivarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReactivarBotonActionPerformed(evt);
            }
        });

        ActualizarBoton.setText("Actualizar");
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });

        SalirBoton.setText("Salir");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InactivarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ModificarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(ReactivarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EliminarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ActualizarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CancelarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(SalirBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarBoton)
                    .addComponent(ModificarBoton)
                    .addComponent(EliminarBoton)
                    .addComponent(CancelarBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InactivarBoton)
                    .addComponent(ReactivarBoton)
                    .addComponent(ActualizarBoton)
                    .addComponent(SalirBoton))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        tituloTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTabla.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tituloTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila = Tabla.getSelectedRow();
        getFila(fila);
    }//GEN-LAST:event_TablaMouseClicked

    private void AgregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBotonActionPerformed
        // get y llamar a adicionar
        flagBoton = 1;
        agregar();
    }//GEN-LAST:event_AgregarBotonActionPerformed

    private void ModificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBotonActionPerformed
        // TODO add your handling code here:
        flagBoton = 2;
        modificar();
    }//GEN-LAST:event_ModificarBotonActionPerformed

    private void EliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBotonActionPerformed
        // TODO add your handling code here:
        flagBoton = 3;
        eliminar();
    }//GEN-LAST:event_EliminarBotonActionPerformed

    private void CancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBotonActionPerformed
        // TODO add your handling code here:
        cancelar();
    }//GEN-LAST:event_CancelarBotonActionPerformed

    private void InactivarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InactivarBotonActionPerformed
        // TODO add your handling code here:
        flagBoton = 4;
        inactivar();
    }//GEN-LAST:event_InactivarBotonActionPerformed

    private void ReactivarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReactivarBotonActionPerformed
        // TODO add your handling code here:
        flagBoton = 5;
        reactivar();
    }//GEN-LAST:event_ReactivarBotonActionPerformed

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        actualizar();
        consulta();
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirBotonActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTable_Estado_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTable_Estado_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTable_Estado_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTable_Estado_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTable_Estado_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private javax.swing.JButton AgregarBoton;
    private javax.swing.JButton CancelarBoton;
    private javax.swing.JButton EliminarBoton;
    private javax.swing.JButton InactivarBoton;
    private javax.swing.JButton ModificarBoton;
    private javax.swing.JButton ReactivarBoton;
    private javax.swing.JButton SalirBoton;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel tituloTabla;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void consulta() {
        String sql = "select * from c1z_estado_clientes";

        try {
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] estadoClientes = new Object[3];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                estadoClientes[0] = rs.getInt("EstCliCod");
                estadoClientes[1] = rs.getString("EstCliNom");
                estadoClientes[2] = rs.getString("EstCliEstReg");
                modelo.addRow(estadoClientes);
            }
            Tabla.setModel(modelo);

        } catch (Exception e) {
        }
    }

    private void agregar() {
        ActualizarBoton.setEnabled(true);
        txtCode.setEnabled(true);
        txtNombre.setEnabled(true);
        txtEstado.setText("A");
        txtCode.setEditable(true);
        txtNombre.setEditable(true);
        carFlaAct = 1;
    }

    private void actualizar() {
        String codigo = txtCode.getText();
        String nombre = txtNombre.getText();
        String estado = txtEstado.getText();
        switch (flagBoton) {
            case 1:
                //AgregarBoton.setEnabled(false);
                if (((codigo.equals("")) || (nombre.equals("")))) {
                    JOptionPane.showMessageDialog(null, "Falta Ingresar Datos!");
                } else {
                    if ((carFlaAct == 1)) {
                        try {
                            String sql = "insert into c1z_estado_clientes (EstCliCod, EstCliNom, EstCliEstReg) values('" + codigo + "','" + nombre + "','" + estado + "')";
                            conet = con1.getConnection();
                            st = conet.createStatement();
                            st.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Nuevo Estado Cliente Registrado!");
                            limpiarFormulario();
                            desactivarFormulario();
                            limpiarTabla();
                        } catch (Exception e) {
                            System.out.println("Error SQL: " + e);
                        }
                    } else {
                        System.out.println("Flag Error");
                    }
                }
                break;
            case 2:
                //ModificarBoton.setEnabled(false);
                if (((nombre.equals("")))) {
                    JOptionPane.showMessageDialog(null, "Falta Ingresar Nombre!");
                } else {
                    if ((carFlaAct == 1)) {
                        try {
                            String sql = "update c1z_estado_clientes set EstCliNom='" + nombre + "' where EstCliCod=" + codigo;
                            conet = con1.getConnection();
                            st = conet.createStatement();
                            st.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Estado Cliente Actualizado!");
                            limpiarFormulario();
                            desactivarFormulario();
                            limpiarTabla();
                        } catch (Exception e) {
                            System.out.println("Error SQL: " + e);
                        }
                    } else {
                        System.out.println("Flag Error");
                    }
                }
                break;
            case 3:
                //EliminarBoton.setEnabled(false);
                if (carFlaAct == 1) {
                    try {
                        String sql = "update c1z_estado_clientes set EstCliEstReg='*' where EstCliCod=" + codigo;
                        conet = con1.getConnection();
                        st = conet.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Estado Cliente Eliminado!");
                        limpiarFormulario();
                        desactivarFormulario();
                        limpiarTabla();
                    } catch (Exception e) {
                        System.out.println("Error SQL: " + e);
                    }
                }
                break;
            case 4:
                //InactivarBoton.setEnabled(false);
                if (carFlaAct == 1) {
                    try {
                        String sql = "update c1z_estado_clientes set EstCliEstReg='I' where EstCliCod=" + codigo;
                        conet = con1.getConnection();
                        st = conet.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Estado Cliente Inactivado!");
                        limpiarFormulario();
                        desactivarFormulario();
                        limpiarTabla();
                    } catch (Exception e) {
                        System.out.println("Error SQL: " + e);
                    }
                }
                break;
            case 5:
                //ReactivarBoton.setEnabled(false);
                if (estado.equals("*") || estado.equals("I")) {
                    if (carFlaAct == 1) {
                        try {
                            String sql = "update c1z_estado_clientes set EstCliEstReg='A' where EstCliCod=" + codigo;
                            conet = con1.getConnection();
                            st = conet.createStatement();
                            st.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Estado Cliente Reactivado!");
                            limpiarFormulario();
                            desactivarFormulario();
                            limpiarTabla();
                        } catch (Exception e) {
                            System.out.println("Error SQL: " + e);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El estado se encuentra activo");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se realizo ninguna modificacion");
                break;
        }
        flagBoton = 0;

    }

    private void cancelar() {
        carFlaAct = 0;
        limpiarFormulario();
        desactivarFormulario();
        ActualizarBoton.setEnabled(false);
    }

    private void limpiarTabla() {
        for (int i = 0; i <= Tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void limpiarFormulario() {
        String t = "";
        txtCode.setText(t);
        txtNombre.setText(t);
        txtEstado.setText(t);
    }

    private void desactivarFormulario() {
        String t = "";
        txtCode.setEditable(false);
        txtNombre.setEditable(false);
    }

    private void eliminar() {
        ActualizarBoton.setEnabled(true);
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombre = (String) Tabla.getValueAt(fila, 1);
            String estado = (String) Tabla.getValueAt(fila, 2);

            txtCode.setText("" + idc);
            txtCode.setEditable(false);
            txtCode.setEnabled(false);
            txtNombre.setText(nombre);
            txtNombre.setEditable(false);
            txtNombre.setEnabled(false);

            txtEstado.setText(estado);
            txtEstado.setEditable(false);
            txtEstado.setEnabled(false);
            carFlaAct = 1;

            //String sql = "select * from c1z_tipo_clientes";
        }
    }

    private void modificar() {
        ActualizarBoton.setEnabled(true);
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombre = (String) Tabla.getValueAt(fila, 1);
            String estado = (String) Tabla.getValueAt(fila, 2);

            txtCode.setText("" + idc);
            txtCode.setEditable(false);
            txtCode.setEnabled(false);
            txtNombre.setText(nombre);
            txtNombre.setEditable(true);
            txtNombre.setEnabled(true);

            txtEstado.setText(estado);
            txtEstado.setEditable(false);
            txtEstado.setEnabled(false);
            carFlaAct = 1;

        }
    }

    private void inactivar() {
        ActualizarBoton.setEnabled(true);
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombre = (String) Tabla.getValueAt(fila, 1);
            String estado = (String) Tabla.getValueAt(fila, 2);

            txtCode.setText("" + idc);
            txtCode.setEditable(false);
            txtCode.setEnabled(false);
            txtNombre.setText(nombre);
            txtNombre.setEditable(false);
            txtNombre.setEnabled(false);

            txtEstado.setText(estado);
            txtEstado.setEditable(false);
            txtEstado.setEnabled(false);
            carFlaAct = 1;

            //String sql = "select * from c1z_tipo_clientes";
        }
    }

    private void reactivar() {
        ActualizarBoton.setEnabled(true);
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombre = (String) Tabla.getValueAt(fila, 1);
            String estado = (String) Tabla.getValueAt(fila, 2);

            txtCode.setText("" + idc);
            txtCode.setEditable(false);
            txtCode.setEnabled(false);
            txtNombre.setText(nombre);
            txtNombre.setEditable(false);
            txtNombre.setEnabled(false);

            txtEstado.setText(estado);
            txtEstado.setEditable(false);
            txtEstado.setEnabled(false);
            carFlaAct = 1;

            //String sql = "select * from c1z_tipo_clientes";
        }
    }

    private int getFila(int fila) {
        return fila;
    }
}
