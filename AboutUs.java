/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author zawat
 */
public class AboutUs extends javax.swing.JFrame {

    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        TITLE1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        but_back = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        TITLE1.setAlignment(java.awt.Label.CENTER);
        TITLE1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TITLE1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        TITLE1.setText("Library Management  System");
        jPanel1.add(TITLE1);
        TITLE1.setBounds(460, 10, 536, 41);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contact Us");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 70, 131, 29);

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel7.setText("Zawat Masta");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(60, 90, 210, 43);

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel4.setText("Cs1912330@szabist.pk");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(300, 90, 240, 43);

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel3.setText("Syed Yousuf Fatmi");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(60, 140, 220, 43);

        jLabel9.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel9.setText("Cs1912325@szabist.pk");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(300, 140, 240, 34);

        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel8.setText("Cs1912327@szabist.pk");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(300, 190, 240, 29);

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel5.setText("Umer Ali Usmani");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(60, 190, 190, 29);

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel6.setText("Danish Aslam Sheikh");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(60, 230, 220, 29);

        jLabel10.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel10.setText("Cs1912300@szabist.pk");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(300, 230, 240, 29);

        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(330, 120, 790, 470);

        but_back.setText("◀");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });
        jPanel1.add(but_back);
        but_back.setBounds(40, 640, 150, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 752);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Main_panel().setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TITLE1;
    private javax.swing.JButton but_back;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
