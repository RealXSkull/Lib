/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.PreparedStatement;
import javax.swing.*;
/**
 *
 * @author zawat
 */
public class add_stud extends javax.swing.JFrame {

    /**
     * Creates new form add_stud
     */
    public add_stud() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        s_Id = new javax.swing.JTextField();
        s_name = new javax.swing.JTextField();
        s_fname = new javax.swing.JTextField();
        but_back = new javax.swing.JButton();
        but_next = new javax.swing.JButton();
        s_course = new javax.swing.JComboBox<>();
        s_branch = new javax.swing.JComboBox<>();
        s_sem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Student");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 10, 239, 47);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 60);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Student_ID");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(530, 50, 110, 27);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(530, 90, 79, 27);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Father's Name");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(530, 130, 121, 27);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("Course");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(530, 170, 57, 27);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setText("Branch");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(530, 210, 60, 27);

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setText("Semester");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(530, 250, 78, 27);

        s_Id.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(s_Id);
        s_Id.setBounds(670, 50, 210, 28);

        s_name.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        s_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_nameActionPerformed(evt);
            }
        });
        jDesktopPane1.add(s_name);
        s_name.setBounds(670, 90, 210, 28);

        s_fname.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jDesktopPane1.add(s_fname);
        s_fname.setBounds(670, 130, 210, 28);

        but_back.setText("◀");
        but_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_backActionPerformed(evt);
            }
        });
        jDesktopPane1.add(but_back);
        but_back.setBounds(20, 580, 120, 53);

        but_next.setText("▶");
        but_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_nextActionPerformed(evt);
            }
        });
        jDesktopPane1.add(but_next);
        but_next.setBounds(1230, 580, 100, 53);

        s_course.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        s_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BBA", "B.com", "M.COM", "M.SC" }));
        s_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_courseActionPerformed(evt);
            }
        });
        jDesktopPane1.add(s_course);
        s_course.setBounds(670, 170, 210, 28);

        s_branch.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        s_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mechanical", "EE", "IT", "Civil" }));
        s_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_branchActionPerformed(evt);
            }
        });
        jDesktopPane1.add(s_branch);
        s_branch.setBounds(670, 210, 210, 28);

        s_sem.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        s_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        s_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_semActionPerformed(evt);
            }
        });
        jDesktopPane1.add(s_sem);
        s_sem.setBounds(670, 250, 210, 28);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 64, 1366, 688);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_semActionPerformed

    private void s_branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_branchActionPerformed

    private void s_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_courseActionPerformed

    private void but_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_nextActionPerformed
        // TODO add your handling code here:
        
        try{
            conn con = new conn();
            if(evt.getSource()==but_next){
            String sql = "INSERT INTO student(idstudent,stu_name,stu_father,course,branch,sem) values (?,?,?,?,?,?)";
            
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1,s_Id.getText());
            st.setString(2,s_name.getText());
            st.setString(3,s_fname.getText());
            st.setString(4,(String)s_course.getSelectedItem());
            st.setString(5,(String)s_branch.getSelectedItem());
            st.setString(6,(String)s_sem.getSelectedItem());
            int rs = st.executeUpdate();
            if(rs>0){
                JOptionPane.showMessageDialog(null, "Student Sucessfully Added");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error");
            }
            s_Id.setText("");
            s_name.setText("");
            s_fname.setText("");
            st.close();
            }
        }
        catch(Exception e){
            System.out.println("Error!");
    }//GEN-LAST:event_but_nextActionPerformed
        
    }
    private void but_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Main_panel().setVisible(true);
    }//GEN-LAST:event_but_backActionPerformed

    private void s_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_nameActionPerformed

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
            java.util.logging.Logger.getLogger(add_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_stud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_stud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_back;
    private javax.swing.JButton but_next;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField s_Id;
    private javax.swing.JComboBox<String> s_branch;
    private javax.swing.JComboBox<String> s_course;
    private javax.swing.JTextField s_fname;
    private javax.swing.JTextField s_name;
    private javax.swing.JComboBox<String> s_sem;
    // End of variables declaration//GEN-END:variables
}
