/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author zawat
 */
public class add_Book extends javax.swing.JFrame {

    /**
     * Creates new form add_Book
     */
    public add_Book() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        b_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_name = new javax.swing.JTextField();
        b_ISBN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        b_pub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_price = new javax.swing.JTextField();
        b_pages = new javax.swing.JTextField();
        but_back = new javax.swing.JButton();
        but_next2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 752));
        setSize(new java.awt.Dimension(1366, 752));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD BOOK");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 20, 270, 50);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Book Name");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(510, 80, 140, 40);

        b_Id.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        b_Id.setText("003");
        b_Id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b_IdFocusGained(evt);
            }
        });
        jDesktopPane1.add(b_Id);
        b_Id.setBounds(660, 40, 210, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Book_ID");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(510, 40, 90, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("ISBN");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(510, 120, 80, 30);

        b_name.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(b_name);
        b_name.setBounds(660, 80, 210, 30);

        b_ISBN.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(b_ISBN);
        b_ISBN.setBounds(660, 120, 210, 30);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Publisher");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(510, 160, 120, 30);

        b_pub.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(b_pub);
        b_pub.setBounds(660, 160, 210, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("Price");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(510, 200, 80, 30);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setText("Pages");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(510, 240, 80, 30);

        b_price.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(b_price);
        b_price.setBounds(660, 200, 210, 30);

        b_pages.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(b_pages);
        b_pages.setBounds(660, 240, 210, 30);

        but_back.setText("◀");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });
        jDesktopPane1.add(but_back);
        but_back.setBounds(10, 573, 121, 49);

        but_next2.setText("▶");
        but_next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_next2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(but_next2);
        but_next2.setBounds(1235, 573, 121, 49);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        // TODO add your handling code here:
        new Main_panel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_but_backActionPerformed

    private void but_next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_next2ActionPerformed
        // TODO add your handling code here:
        try{
            conn con = new conn();
            
            if(evt.getSource()==but_next2){
                String sql = "INSERT INTO book(idBook,bookname,isbn,publisher,price,pages) values (?,?,?,?,?,?)";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1,b_Id.getText());
                st.setString(2,b_name.getText());
                st.setString(3,b_ISBN.getText());
                st.setString(4,b_pub.getText());
                st.setString(5,b_price.getText());
                st.setString(6,b_pages.getText());
                
                int rs = st.executeUpdate();
                if(rs>0){
                    JOptionPane.showMessageDialog(null, "Succesfully Added!!!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Error");
                }
                b_Id.setText("");
                b_name.setText("");
                b_ISBN.setText("");
                b_pub.setText("");
                b_price.setText("");
                b_pages.setText("");
                st.close();
            }
        }
        catch(Exception e)
        {
            
            System.out.println("error!!!");
            //e2.printStackTrace();
        }
    }//GEN-LAST:event_but_next2ActionPerformed

    private void b_IdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b_IdFocusGained
        // TODO add your handling code here:
        b_Id.setText("");
    }//GEN-LAST:event_b_IdFocusGained

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
            java.util.logging.Logger.getLogger(add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_ISBN;
    private javax.swing.JTextField b_Id;
    private javax.swing.JTextField b_name;
    private javax.swing.JTextField b_pages;
    private javax.swing.JTextField b_price;
    private javax.swing.JTextField b_pub;
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_next2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
