/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_proyecto;
import main_proyecto.main;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Alumnos_Eliminar extends javax.swing.JFrame {
    static Connection conn = null;
    static Statement s = null;
    static ResultSet rs = null;
    DefaultTableModel modelo =  new DefaultTableModel();
    Boolean idFound = false;
    String nombreTabla = "ALUMNOS_COLEGIO";
    
    /**
     * Creates new form Eliminar
     */
    public Alumnos_Eliminar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Insertar = new javax.swing.JButton();
        jButton_Mostrar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Resultados = new javax.swing.JLabel();
        jLabel_Subtitulo1 = new javax.swing.JLabel();
        jLabel_Carnet = new javax.swing.JLabel();
        jTextField_Carnet = new javax.swing.JTextField();
        jButton_Confirmar = new javax.swing.JButton();
        jLabel_NombreTitulo = new javax.swing.JLabel();
        jLabel_ApellidoTitulo = new javax.swing.JLabel();
        jLabel_Subtitulo2 = new javax.swing.JLabel();
        jButton_Eliminar = new javax.swing.JButton();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jButton_Regresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Insertar.setText("Insertar");
        jButton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertarActionPerformed(evt);
            }
        });

        jButton_Mostrar.setText("Mostrar");
        jButton_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarActionPerformed(evt);
            }
        });

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarActionPerformed(evt);
            }
        });

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Titulo.setText("Dar de baja a alumno");

        jLabel1.setText("Resultado:");

        jLabel_Subtitulo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Subtitulo1.setText("Eliminar por");

        jLabel_Carnet.setText("Carnet:");

        jTextField_Carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CarnetActionPerformed(evt);
            }
        });

        jButton_Confirmar.setText("Confirmar");
        jButton_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarActionPerformed(evt);
            }
        });

        jLabel_NombreTitulo.setText("Nombre de alumno");

        jLabel_ApellidoTitulo.setText("Apellido de alumno");

        jLabel_Subtitulo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_Subtitulo2.setText("Datos del alumno a dar de baja");

        jButton_Eliminar.setText("Dar de baja");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jButton_Regresar1.setText("Regresar");
        jButton_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Regresar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Insertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(jButton_Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton_Modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Carnet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_NombreTitulo)
                                    .addComponent(jLabel_ApellidoTitulo))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Nombre)
                                    .addComponent(jTextField_Apellido)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Subtitulo1)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel_Subtitulo2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Regresar1)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel_Titulo)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Titulo)
                    .addComponent(jButton_Regresar1))
                .addGap(21, 21, 21)
                .addComponent(jLabel_Subtitulo1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Carnet)
                    .addComponent(jTextField_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel_Subtitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombreTitulo)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ApellidoTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Confirmar)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Mostrar)
                    .addComponent(jButton_Insertar)
                    .addComponent(jButton_Modificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertarActionPerformed
        // Botón Insertar Registros
        this.setVisible(false);
        Alumnos_Insertar insertar = new Alumnos_Insertar();
        insertar.setVisible(true);
        insertar.pack();
    }//GEN-LAST:event_jButton_InsertarActionPerformed

    private void jButton_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarActionPerformed
        // Botón Mostrar
        this.setVisible(false);
        Alumnos_Mostrar mostrar = new Alumnos_Mostrar();
        mostrar.setVisible(true);
        mostrar.pack();
    }//GEN-LAST:event_jButton_MostrarActionPerformed

    private void jButton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarActionPerformed
        // Botón Modificar
        this.setVisible(false);
        Alumnos_Modificar modificar = new Alumnos_Modificar();
        modificar.setVisible(true);
        modificar.pack();
    }//GEN-LAST:event_jButton_ModificarActionPerformed

    private void jButton_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarActionPerformed
        // Botón para confirmar que se quiere eliminar el registro

        String idRegistro = jTextField_Carnet.getText();
        
        if ((idFound == true) || (jLabel_Resultados.getText().equals("¡Carnet encontrado!"))) {
            try {
                conn = main.Enlace(conn);
                String sqlEliminar = "DELETE FROM " + nombreTabla + " WHERE CARNET='" + idRegistro + "'";
                PreparedStatement psta = conn.prepareStatement(sqlEliminar);
                psta.execute();
                psta.close();
                jLabel_Resultados.setText("¡Registro eliminado de la Base de Datos exitosamente!");
                jTextField_Carnet.setText("");
                jTextField_Nombre.setText("");
                jTextField_Apellido.setText("");
                infoBox("¡La eliminación del Registro ha sido exitosa!","Información");
            } catch (Exception e) {
                jLabel_Resultados.setText("Ocurrió un error al intentar eliminar el registro en la DB.");
                System.out.println("Excepción:");
                e.printStackTrace();
                System.out.println(e.getCause());
            }
        } else {
            jLabel_Resultados.setText("No se pudo eliminar el registro porque no existía en la BD.");
            System.out.println("No se pudo eliminar el registro porque no existía en la BD.");
        }
        
    }//GEN-LAST:event_jButton_ConfirmarActionPerformed

    private void jTextField_CarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CarnetActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_CarnetActionPerformed

    public void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
        }
    
    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // Botón Dar de Baja (Mostrar registro que se quiere eliminar)
        
        String idRegistro = jTextField_Carnet.getText();
        try {
            conn = main.Enlace(conn); // Conexión
            rs = main.EnlEst(rs, nombreTabla); //Query
            ResultSetMetaData rsMd = rs.getMetaData(); //Donde guardamos los resultados
            int cantidadColumnas = rsMd.getColumnCount();
            for (int i=1; i <= cantidadColumnas; i++ ){
                modelo.addColumn(rsMd.getColumnName(i));
            }
            while(rs.next()){
                Object[] fila = new Object[cantidadColumnas];
                for (int i=0; i < cantidadColumnas; i++ ){
                    fila[i] = rs.getObject(i+1);
                    if(i == 0){                        
                        //Para posicionarse en la columna de los IDs
                        if (rs.getObject(i+3).toString().equals(idRegistro) ) {
                            idFound = true;
                            System.out.println("¡ID para eliminar encontrado!");
                            jTextField_Nombre.setText(rs.getObject(i+1).toString());
                            jTextField_Apellido.setText(rs.getObject(i+2).toString()); 
                        }
                    }
                }
                modelo.addRow(fila);
            }
            int cantFilas = modelo.getRowCount();
            rs.close();
            conn.close();
            
            if(idFound = false){
                jLabel_Resultados.setText("ID no encontrado. Por favor intente nuevamente.");
            } else {
                jLabel_Resultados.setText("¡Carnet encontrado!");
                infoBox("¡Carnet encontrado! Por favor confirme los datos y proceda a eliminar.","Confirmación");
            }
            
        } catch (Exception ex) {
            jLabel_Resultados.setText("Ocurrió un error tratando de encontrar el carnet consultado."
                    + "Por favor intente nuevamente.");
            ex.printStackTrace();
        }       
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jButton_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Regresar1ActionPerformed
        // Botón para Regresar a Menú Alumnos
        Menu_Alumnos menu = new Menu_Alumnos();
        menu.setVisible(true);
        this.setVisible(false);
        menu.pack();
    }//GEN-LAST:event_jButton_Regresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Alumnos_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos_Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Confirmar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Insertar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JButton jButton_Mostrar;
    private javax.swing.JButton jButton_Regresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ApellidoTitulo;
    private javax.swing.JLabel jLabel_Carnet;
    private javax.swing.JLabel jLabel_NombreTitulo;
    private javax.swing.JLabel jLabel_Resultados;
    private javax.swing.JLabel jLabel_Subtitulo1;
    private javax.swing.JLabel jLabel_Subtitulo2;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Carnet;
    private javax.swing.JTextField jTextField_Nombre;
    // End of variables declaration//GEN-END:variables
}
