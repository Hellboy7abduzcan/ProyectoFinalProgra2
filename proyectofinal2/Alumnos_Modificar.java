/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_proyecto;
import main_proyecto.main;
import static alumnos_proyecto.Alumnos_Eliminar.conn;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Alumnos_Modificar extends javax.swing.JFrame {
    static Connection conn = null;
    static Statement s = null;
    static ResultSet rs = null;
    DefaultTableModel modelo =  new DefaultTableModel();
    String nombreTabla = "ALUMNOS_COLEGIO";

    
    /**
     * Creates new form Modificar
     */
    public Alumnos_Modificar() {
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

        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_Resultados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Apellido = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Apellido = new javax.swing.JTextField();
        jButton_ModificarRegistro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Fecha = new javax.swing.JTextField();
        jLabel_Fecha = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel_Direccion = new javax.swing.JLabel();
        jLabel_Sexo = new javax.swing.JLabel();
        jComboBox_Sexo = new javax.swing.JComboBox<>();
        jButton_Regresar6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Insertar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Titulo.setText("Modificar datos de alumno");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Resultado:");

        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Modificar por");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Campos a editar");

        jLabel_Nombre.setText("Nombre");

        jLabel_Apellido.setText("Apellido");

        jTextField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreActionPerformed(evt);
            }
        });

        jButton_ModificarRegistro.setText("Modificar");
        jButton_ModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModificarRegistroActionPerformed(evt);
            }
        });

        jLabel_Fecha.setText("Fecha");

        jLabel_Direccion.setText("Dirección");

        jLabel_Sexo.setText("Sexo");

        jComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        jButton_Regresar6.setText("Regresar");
        jButton_Regresar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Regresar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Regresar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(296, 296, 296))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Apellido)
                                        .addComponent(jLabel_Fecha)
                                        .addComponent(jLabel_Nombre))
                                    .addGap(93, 93, 93)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_Nombre)
                                        .addComponent(jTextField_Fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField_Apellido, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_Direccion)
                                        .addComponent(jLabel_Sexo))
                                    .addGap(87, 87, 87)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jTextField_Direccion)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_ModificarRegistro)
                                .addGap(41, 41, 41)))
                        .addGap(1, 1, 1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Titulo)
                    .addComponent(jButton_Regresar6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_ModificarRegistro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Apellido)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Fecha)
                    .addComponent(jTextField_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Direccion)
                    .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Sexo)
                    .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botón Mostrar

        this.setVisible(false);
        Alumnos_Mostrar mostrar = new Alumnos_Mostrar();
        mostrar.setVisible(true);
        mostrar.pack();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Botón Eliminar
        this.setVisible(false);
        Alumnos_Eliminar eliminar = new Alumnos_Eliminar();
        eliminar.setVisible(true);
        eliminar.pack();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botón Insertar Registros
        this.setVisible(false);
        Alumnos_Insertar insertar = new Alumnos_Insertar();
        insertar.setVisible(true);
        insertar.pack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_ModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModificarRegistroActionPerformed
        // Botón Modificar
        String idRegistro = jTextField_ID.getText();
        Boolean idFound = false;
        
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
                    fila[i] = rs.getObject(3);
                    if(i == 0){
                        //Para posicionarse en la columna de los IDs
                        //System.out.println("Item: " + rs.getObject(3).toString());
                        if (rs.getObject(3).toString().equals(idRegistro) ) {
                            idFound = true;
                            System.out.println("¡ID  para modificar encontrado!");
                    }
                    }
                }
                modelo.addRow(fila);
            }
            int cantFilas = modelo.getRowCount();
            rs.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        if (idFound == true){
            //Realizar la modificación
            String nombre_Registro = jTextField_Nombre.getText();
            String apellido_Registro = jTextField_Apellido.getText();
            //idRegistro
            
            try {
                String argsParaEliminar = "";
                conn = main.Enlace(conn);
                
                if(!(jTextField_Nombre.getText().equals(""))){
                    //Agregar a String de eliminación el registro Nombre
                    argsParaEliminar = argsParaEliminar + "NOMBRES = '" + jTextField_Nombre.getText() + "', ";
                }
                if(!(jTextField_Apellido.getText().equals(""))){
                    //Agregar a String de eliminación el registro Apellido
                    argsParaEliminar = argsParaEliminar + "APELLIDOS = '" + jTextField_Apellido.getText() + "', ";
                }
                if(!(jTextField_Fecha.getText().equals(""))){
                    //Agregar a String de eliminación el registro Fecha
                    argsParaEliminar = argsParaEliminar + "FECHA_DE_NACIMIENTO = '" + jTextField_Fecha.getText() + "', ";
                }
                if(!(jTextField_Direccion.getText().equals(""))){
                    //Agregar a String de eliminación el registro Direccion
                    argsParaEliminar = argsParaEliminar + "DIRECCION = '" + jTextField_Direccion.getText() + "', ";
                }
                if(!(jComboBox_Sexo.getSelectedItem().equals(""))){
                    //Agregar a String de eliminación el registro Sexo
                    argsParaEliminar = argsParaEliminar + "SEXO = '" + jComboBox_Sexo.getSelectedItem() + "', ";
                }
                
                if(!(argsParaEliminar.equals(""))){
                    // Hay argumentos para eliminar
                    String sqlModificar = "";
                    StringBuilder argsParaEliminar_Mod = new StringBuilder(argsParaEliminar);
                    argsParaEliminar_Mod.setLength(argsParaEliminar.length() - 2);
                    
                    sqlModificar = "UPDATE " + nombreTabla + " SET " + argsParaEliminar_Mod + " WHERE CARNET LIKE '" + idRegistro + "'";
                    System.out.println("sqlModificar: " + sqlModificar);
                    PreparedStatement psta = conn.prepareStatement(sqlModificar);
                    psta.execute();
                    psta.close();
                    jLabel_Resultados.setText("¡Se modificó el registro en la Base de Datos exitosamente!");
                } else {
                    // No hay argumentos para eliminar
                    jLabel_Resultados.setText("¡Error! No se ingresó ningún argumento para modificar.");
                }
                
            } catch (Exception e) {
                jLabel_Resultados.setText("Ocurrió un error al intentar modificar el registro en la DB.");
                System.out.println("Excepción:");
                e.printStackTrace();
                System.out.println(e.getCause());
            }            
            
        } else {
            jLabel_Resultados.setText("No es posible modificar el registro porque no existe en la BD.");
            System.out.println("No es posible modificar el registro porque no existe en la BD.");
        }
        jTextField_Nombre.setText("");
        jTextField_Apellido.setText("");
        jTextField_ID.setText("");
        jTextField_Fecha.setText("");
        jTextField_Direccion.setText("");
    }//GEN-LAST:event_jButton_ModificarRegistroActionPerformed

    private void jTextField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreActionPerformed

    private void jButton_Regresar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Regresar6ActionPerformed
        // Botón para Regresar a Menú Alumnos
        Menu_Alumnos menu = new Menu_Alumnos();
        menu.setVisible(true);
        this.setVisible(false);
        menu.pack();
    }//GEN-LAST:event_jButton_Regresar6ActionPerformed

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
            java.util.logging.Logger.getLogger(Alumnos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos_Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_ModificarRegistro;
    private javax.swing.JButton jButton_Regresar4;
    private javax.swing.JButton jButton_Regresar5;
    private javax.swing.JButton jButton_Regresar6;
    private javax.swing.JComboBox<String> jComboBox_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Apellido;
    private javax.swing.JLabel jLabel_Direccion;
    private javax.swing.JLabel jLabel_Fecha;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Resultados;
    private javax.swing.JLabel jLabel_Sexo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_Fecha;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Nombre;
    // End of variables declaration//GEN-END:variables
}
