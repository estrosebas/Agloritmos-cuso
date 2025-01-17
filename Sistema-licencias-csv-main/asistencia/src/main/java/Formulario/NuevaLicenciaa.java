/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import Entidad.Establecimiento;
import TAD_Establecimiento.CargadorEstablecimientos;
import TAD_Establecimiento.ListaEnlazadaImplEstablecimiento;
import TAD_Establecimiento.NodoEstablecimiento;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas
 */
public class NuevaLicenciaa extends javax.swing.JFrame {

    /**
     * Creates new form NuevaLicenciaa
     */
    public NuevaLicenciaa() {
        initComponents();
        cargarDatosEnJTable();
          this.setLocationRelativeTo(null);
    }
    final String rutaArchivo = "licencias.csv";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        txt_actividad = new javax.swing.JTextField();
        txt_area = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadedatos = new javax.swing.JTable();
        cbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Licencia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("N° RUC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Actividad");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("N° Area");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tipo");

        txt_ruc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_actividad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_actividadActionPerformed(evt);
            }
        });

        txt_area.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton_Guardar.setBackground(new java.awt.Color(86, 185, 255));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });

        listadedatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° RUC", "Actividad", "Area", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(listadedatos);

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LICENCIA DE FUNCIONAMIENTO DEFINITIVA", "LICENCIA DE FUNCIONAMIENTO TEMPORAL" }));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txt_ruc))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txt_actividad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txt_area)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        // Obtener los datos ingresados en la interfaz gráfica
        String n_ruc = txt_ruc.getText();
        String actividad = txt_actividad.getText();
        String areaStr = txt_area.getText();
        String licencia =  cbox.getSelectedItem().toString();

        // Validar que los campos no estén vacíos
        if (n_ruc.isEmpty() || actividad.isEmpty() || areaStr.isEmpty() || licencia.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Guardar", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convertir el área a Double
            Double area = Double.parseDouble(areaStr);

            // Añadir y guardar el establecimiento
            añadirYGuardarEstablecimiento(n_ruc, actividad, area, licencia, rutaArchivo);

            // Mensaje de éxito
            javax.swing.JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente:\nRUC: " + n_ruc + "\nActividad: " + actividad, "Guardar", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Limpiar los campos después de guardar
            Limpiar();
        } catch (NumberFormatException e) {
            // Manejar error si el área no es un número válido
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para el área", "Guardar", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Manejar otros errores desconocidos
            javax.swing.JOptionPane.showMessageDialog(this, "Error al intentar guardar los datos", "Guardar", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración
        }
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_actividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_actividadActionPerformed

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxActionPerformed

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
            java.util.logging.Logger.getLogger(NuevaLicenciaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaLicenciaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaLicenciaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaLicenciaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaLicenciaa().setVisible(true);
            }
        });
    }

    public void añadirYGuardarEstablecimiento(String Ruc_Estab, String Giro_Actividad, double Area_Estab, String Tipo_Licencia, String rutaArchivo) {
        // Crear una nueva lista enlazada
        ListaEnlazadaImplEstablecimiento lista = new ListaEnlazadaImplEstablecimiento();

        // Cargar los datos existentes desde el archivo CSV
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV(rutaArchivo);

        // Añadir nuevo establecimiento a la lista
        Establecimiento nuevoEstablecimiento = new Establecimiento(Ruc_Estab, Giro_Actividad, Area_Estab, Tipo_Licencia);
        lista.insertar(nuevoEstablecimiento);

        // Guardar la lista en el CSV
        cargador.guardarEnCSV(rutaArchivo);
        cargarDatosEnJTable();
    }

    private void Limpiar() {
        txt_ruc.setText("");
        txt_actividad.setText("");
        txt_area.setText("");
    }
    void cargarDatosEnJTable() {
        ListaEnlazadaImplEstablecimiento lista = new ListaEnlazadaImplEstablecimiento();
        CargadorEstablecimientos cargador = new CargadorEstablecimientos(lista);
        cargador.cargarDesdeCSV("licencias.csv");

        // Limpiar las filas existentes en el modelo de la tabla
        DefaultTableModel modeloEstablecimientos = (DefaultTableModel) listadedatos.getModel();
        modeloEstablecimientos.setRowCount(0); // Esto borra todas las filas del modelo

        // Iterar sobre la lista enlazada y agregar los datos a la tabla
        NodoEstablecimiento actual = lista.cabeza; // Empezamos desde la cabeza de la lista
        while (actual != null) {
            Establecimiento establecimiento = actual.getEstablecimiento();
            Object[] datosEstablecimiento = new Object[]{
                establecimiento.getRuc_Estab(),
                establecimiento.getGiro_Actividad(),
                establecimiento.getArea_Estab(),
                establecimiento.getTipo_Licencia()
            // Puedes agregar más campos aquí según lo que quieras mostrar en la tabla
            };
            modeloEstablecimientos.addRow(datosEstablecimiento); // Agregar los datos al modelo de la tabla
            actual = actual.getSiguiente(); // Avanzar al siguiente nodo en la lista
        }

        // Establecer el nuevo modelo en la tabla
        listadedatos.setModel(modeloEstablecimientos);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listadedatos;
    private javax.swing.JTextField txt_actividad;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_ruc;
    // End of variables declaration//GEN-END:variables
}
