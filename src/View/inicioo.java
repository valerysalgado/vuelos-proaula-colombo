package View;

<<<<<<< HEAD
import Model.Sesion;
import Model.Vuelosdisponibles;
import Model.VuelosdisponiblesDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.*;



/**
 *
 * @author valer
 */
=======


import com.toedter.calendar.JDateChooser;
import java.util.Date;


>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb
public class inicioo extends javax.swing.JFrame {



    public inicioo() {
        initComponents();
       DateIDA.setMinSelectableDate(new Date());
       DateVuelta.setMinSelectableDate(new Date());
        DateVuelta.setEnabled(false);
        this.setLocationRelativeTo(null);
        fecha_ida.setMinSelectableDate(new Date ());
        fecha_vuelta.setMinSelectableDate(new Date());
        
         fecha_ida.setMinSelectableDate(new Date());
        fecha_vuelta.setMinSelectableDate(new Date());
        
        // Listener para la fecha de ida
        fecha_ida.addPropertyChangeListener(evt -> {
            if ("date".equals(evt.getPropertyName())) {
                Date fechaSeleccionada = fecha_ida.getDate();
                if (fechaSeleccionada != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(fechaSeleccionada);
                    calendar.add(Calendar.DAY_OF_MONTH, 1); 
                    
                    fecha_vuelta.setMinSelectableDate(calendar.getTime()); 
                }
            }
        });
        
        if (Sesion.isSesionIniciada()) {
            btnlogin.setVisible(false); 
        }
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtOrigen = new javax.swing.JComboBox<>();
        txtDestino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNpersonas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
<<<<<<< HEAD
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fecha_vuelta = new com.toedter.calendar.JDateChooser();
        fecha_ida = new com.toedter.calendar.JDateChooser();
=======
        jButton3 = new javax.swing.JButton();
        DateIDA = new com.toedter.calendar.JDateChooser();
        DateVuelta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(38, 75, 100));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 201, 211)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel4.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, -10, -1, 60));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOESAVIANCA");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 100, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        txtOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Bogota", "Cartagena", "Medellin" }));
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });
        jPanel3.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Bogota", "Cartagena", "Medellin", " " }));
        jPanel3.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));
=======
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Bogota", "Cartagena", "Medellin" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Bogota", "Cartagena", "Medellin", " " }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("Origen");
<<<<<<< HEAD
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
=======
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Destino");
<<<<<<< HEAD
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel6.setText("Fecha vuelta");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 20));

        txtNpersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        txtNpersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNpersonasActionPerformed(evt);
            }
        });
        jPanel3.add(txtNpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 50, -1));

        jLabel8.setText("N_person");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 60, -1));
=======
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText(" Fecha de ida");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 40, -1));

        jLabel8.setText("N_person");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 60, -1));
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb

        jButton3.setText("Buscar");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));
        jPanel3.add(DateIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 130, -1));
        jPanel3.add(DateVuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Fecha de vuelta");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jRadioButton1.setText("Solo ida");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 90, 40));

        jLabel10.setText("Fecha de ida");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 90, 20));

        fecha_vuelta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_vueltaPropertyChange(evt);
            }
        });
        jPanel3.add(fecha_vuelta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 100, -1));

        fecha_ida.setMinSelectableDate(new java.util.Date(-62135747891000L));
        fecha_ida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_idaPropertyChange(evt);
            }
        });
        jPanel3.add(fecha_ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 100, -1));
=======
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jRadioButton2.setText("ida y Vuelta");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 680, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, 290));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo h final.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 470));

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

<<<<<<< HEAD
    private void txtNpersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNpersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNpersonasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        //agarramos los datos del usuario
       String origen = (String) txtOrigen.getSelectedItem();
       String destino = (String) txtDestino.getSelectedItem();
       String Npersonas = (String) txtNpersonas.getSelectedItem();
       java.util.Date fechaIda = fecha_ida.getDate();
       java.util.Date fechaVuelta = fecha_vuelta.getDate();
       
         if (origen.equals("-------") || destino.equals("-------") || Npersonas.equals(" ") || fechaIda == null || fechaVuelta == null) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione todos los campos requeridos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si hay campos vacíos
    }
         
         if (fechaVuelta.before(fechaIda)) {
        JOptionPane.showMessageDialog(this, "La fecha de vuelta no puede ser menor que la fecha de ida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si la fecha de vuelta es incorrecta
    }
       
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String fechaIdaStr = sdf.format(fechaIda);
        String fechaVueltaStr = sdf.format(fechaVuelta);
        
         int numPersonas = Integer.parseInt(Npersonas);
        
         VuelosdisponiblesDAO dao = new VuelosdisponiblesDAO();
         List<Vuelosdisponibles> vuelos = dao.buscarVuelos(origen, destino, fechaIdaStr, fechaVueltaStr, numPersonas);
        
       if (!vuelos.isEmpty()) {
         new vuelosdisponibles().setVisible(true);
        
         this.dispose(); 
         
         
        } else {
        Vuelosdisponibles vueloCercano = dao.buscarFechaCercana(origen, destino, fechaIdaStr); // Mover aquí

        if (vueloCercano != null) {
        // Mostrar la fecha más cercana
        JOptionPane.showMessageDialog(this, "No hay vuelos disponibles para ese dia. La fecha más cercana es: " + vueloCercano.getFechaSalida());
         } else {
        // Mostrar mensaje indicando que no hay vuelos disponibles
        JOptionPane.showMessageDialog(this, "No hay vuelos disponibles de " + origen + " a " + destino +" en estos momentos.");
         }
}
       
       
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
         Sesion.iniciarSesion(); 
         btnlogin.setVisible(false);
          new Login().setVisible(true);
          
    }//GEN-LAST:event_btnloginActionPerformed

    private void fecha_idaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_idaPropertyChange
   // TODO add your handling code here:
    }//GEN-LAST:event_fecha_idaPropertyChange

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenActionPerformed

    private void fecha_vueltaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_vueltaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_vueltaPropertyChange
=======
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
   
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
    }//GEN-LAST:event_jButton1ActionPerformed
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
         DateIDA.setEnabled(true);   // Habilita fecha de ida
            DateVuelta.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       DateIDA.setEnabled(true);
        DateVuelta.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(inicioo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton btnlogin;
    private com.toedter.calendar.JDateChooser fecha_ida;
    private com.toedter.calendar.JDateChooser fecha_vuelta;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
=======
    private com.toedter.calendar.JDateChooser DateIDA;
    private com.toedter.calendar.JDateChooser DateVuelta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> txtDestino;
    private javax.swing.JComboBox<String> txtNpersonas;
    private javax.swing.JComboBox<String> txtOrigen;
=======
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
>>>>>>> 454d3ec5c49df7bce62f69d5c3bbb51d1ea54abb
    // End of variables declaration//GEN-END:variables

   }
