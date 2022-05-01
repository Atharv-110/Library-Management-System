import java.sql.*;
import javax.swing.JOptionPane;
public class NewStudent extends javax.swing.JFrame {

    public NewStudent() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        branchCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        studFather = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        studId = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        studName = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NEW STUDENT");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 180, 60));

        jLabel2.setBackground(new java.awt.Color(190, 183, 164));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("STUDENT ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 40));

        jLabel3.setBackground(new java.awt.Color(190, 183, 164));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 40));

        jLabel4.setBackground(new java.awt.Color(190, 183, 164));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("FATHER NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 40));

        courseCombo.setBackground(new java.awt.Color(190, 183, 164));
        courseCombo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        courseCombo.setForeground(new java.awt.Color(51, 51, 51));
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech" }));
        courseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboActionPerformed(evt);
            }
        });
        getContentPane().add(courseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, 41));

        jLabel5.setBackground(new java.awt.Color(190, 183, 164));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("COURSE NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 40));

        branchCombo.setBackground(new java.awt.Color(190, 183, 164));
        branchCombo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        branchCombo.setForeground(new java.awt.Color(51, 51, 51));
        branchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "Mechanical", "Civil" }));
        getContentPane().add(branchCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, 41));

        jLabel6.setBackground(new java.awt.Color(190, 183, 164));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BRANCH NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 40));

        studFather.setBackground(new java.awt.Color(190, 183, 164));
        studFather.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studFather.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(studFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 40));

        saveBtn.setBackground(new java.awt.Color(255, 95, 9));
        saveBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 110, 40));

        studId.setBackground(new java.awt.Color(190, 183, 164));
        studId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studId.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(studId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, 40));

        clearBtn.setBackground(new java.awt.Color(255, 95, 9));
        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 40));

        studName.setBackground(new java.awt.Color(190, 183, 164));
        studName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(studName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 260, 40));

        closeBtn.setBackground(new java.awt.Color(255, 63, 0));
        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.setBorder(null);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 5, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String studentId = studId.getText();
        String studentName = studName.getText();
        String studentFather = studFather.getText();
        String courseName = (String)courseCombo.getSelectedItem();
        String branchName = (String)branchCombo.getSelectedItem();
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            String sql = "insert into Student values('"+studentId+"','"+studentName+"','"+studentFather+"','"+courseName+"','"+branchName+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Student Added Successfully");
            this.dispose();
            new NewStudent().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Student ID already exist");
            this.dispose();
            new NewStudent().setVisible(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        studId.setText("");
        studName.setText("");
        studFather.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed
    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboActionPerformed
    }//GEN-LAST:event_courseComboActionPerformed
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchCombo;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField studFather;
    private javax.swing.JTextField studId;
    private javax.swing.JTextField studName;
    // End of variables declaration//GEN-END:variables
}