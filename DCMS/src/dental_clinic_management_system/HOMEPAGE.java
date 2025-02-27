/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dental_clinic_management_system;

/**
 *
 * @author JESSA MARIE BEBITA
 */
public class HOMEPAGE extends javax.swing.JFrame {

    /**
     * Creates new form HOMEPAGE
     */
    public HOMEPAGE() {
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

        goappointment = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        goregistration = new javax.swing.JButton();
        gotreatment = new javax.swing.JButton();
        gobill = new javax.swing.JButton();
        gohistory = new javax.swing.JButton();
        gologout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        goschedule = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goappointment.setText("BOOK APPOINTMENT");
        goappointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goappointmentActionPerformed(evt);
            }
        });
        getContentPane().add(goappointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel1.setText("DENTAL CLINIC MANAGEMENT SYSTEM");

        goregistration.setText("REGISTRATION");
        goregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goregistrationActionPerformed(evt);
            }
        });

        gotreatment.setText("SERVICES");
        gotreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotreatmentActionPerformed(evt);
            }
        });

        gobill.setText("BILL");
        gobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobillActionPerformed(evt);
            }
        });

        gohistory.setText("HISTORY");
        gohistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gohistoryActionPerformed(evt);
            }
        });

        gologout.setForeground(new java.awt.Color(204, 0, 0));
        gologout.setText("LOG OUT");
        gologout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gologoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(goregistration)
                .addGap(18, 18, 18)
                .addComponent(gotreatment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gobill, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gohistory, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gologout)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goregistration)
                    .addComponent(gotreatment)
                    .addComponent(gobill)
                    .addComponent(gohistory)
                    .addComponent(gologout))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("\"Healthy smiles start with great care your dental clinic is where confidence begins.\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 200));

        goschedule.setText("SCHEDULE");
        goschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goscheduleActionPerformed(evt);
            }
        });
        getContentPane().add(goschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 111, 30));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel4.setText("Every smile tells a story ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 490, 40));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel5.setText("let us make yours unforgettable");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_clinic_management_system/homepagepic.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goappointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goappointmentActionPerformed
        // TODO add your handling code here:
        bookappointment obj = new bookappointment();
        obj.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_goappointmentActionPerformed

    private void gotreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotreatmentActionPerformed
        // TODO add your handling code here:
        detailstreatment obj = new detailstreatment();
        obj.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_gotreatmentActionPerformed

    private void goscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goscheduleActionPerformed
        // TODO add your handling code here:
       schedule obj = new schedule();
        obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_goscheduleActionPerformed

    private void gologoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gologoutActionPerformed
        // TODO add your handling code here:
        loginpage obj = new loginpage();
        obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_gologoutActionPerformed

    private void gohistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gohistoryActionPerformed
        // TODO add your handling code here:
         history obj = new history();
        obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_gohistoryActionPerformed

    private void gobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobillActionPerformed
        // TODO add your handling code here:
         bill obj = new bill();
        obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_gobillActionPerformed

    private void goregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goregistrationActionPerformed
        // TODO add your handling code here:
         registrationpage obj = new registrationpage();
        obj.setVisible(true);
           dispose();
    }//GEN-LAST:event_goregistrationActionPerformed

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
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMEPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goappointment;
    private javax.swing.JButton gobill;
    private javax.swing.JButton gohistory;
    private javax.swing.JButton gologout;
    private javax.swing.JButton goregistration;
    private javax.swing.JButton goschedule;
    private javax.swing.JButton gotreatment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
