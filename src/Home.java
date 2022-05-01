public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newStudentBtn = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newBookBtn = new javax.swing.JButton();
        statBtn = new javax.swing.JButton();
        issueBtn = new javax.swing.JButton();
        returnBookBtn = new javax.swing.JButton();
        aboutBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newStudentBtn.setBackground(new java.awt.Color(255, 95, 9));
        newStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        newStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        newStudentBtn.setText("NEW STUDENT");
        newStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, 80));

        jButton8.setBackground(new java.awt.Color(255, 63, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("X");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TCR LIBRARY");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 350, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("HOME");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 120, 60));

        newBookBtn.setBackground(new java.awt.Color(255, 95, 9));
        newBookBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        newBookBtn.setForeground(new java.awt.Color(255, 255, 255));
        newBookBtn.setText("NEW BOOK");
        newBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 150, 80));

        statBtn.setBackground(new java.awt.Color(255, 95, 9));
        statBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statBtn.setForeground(new java.awt.Color(255, 255, 255));
        statBtn.setText("STATISTICS");
        statBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statBtnActionPerformed(evt);
            }
        });
        getContentPane().add(statBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 150, 80));

        issueBtn.setBackground(new java.awt.Color(255, 95, 9));
        issueBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        issueBtn.setForeground(new java.awt.Color(255, 255, 255));
        issueBtn.setText("ISSUE BOOK");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 145, 80));

        returnBookBtn.setBackground(new java.awt.Color(255, 95, 9));
        returnBookBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        returnBookBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBookBtn.setText("RETURN BOOK");
        returnBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, 80));

        aboutBtn.setBackground(new java.awt.Color(255, 95, 9));
        aboutBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        aboutBtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutBtn.setText("ABOUT");
        aboutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aboutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 150, 80));

        logoutBtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 150, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed
    private void newStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentBtnActionPerformed
        this.dispose();
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_newStudentBtnActionPerformed
    private void newBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookBtnActionPerformed
        this.dispose();
        new NewBook().setVisible(true);
    }//GEN-LAST:event_newBookBtnActionPerformed
    private void statBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statBtnActionPerformed
        this.dispose();
        new Statistics().setVisible(true);
    }//GEN-LAST:event_statBtnActionPerformed
    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        this.dispose();
        new IssueBook().setVisible(true);
    }//GEN-LAST:event_issueBtnActionPerformed
    private void returnBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookBtnActionPerformed
        this.dispose();
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_returnBookBtnActionPerformed
    private void aboutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBtnActionPerformed
        this.dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_aboutBtnActionPerformed
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton issueBtn;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newBookBtn;
    private javax.swing.JButton newStudentBtn;
    private javax.swing.JButton returnBookBtn;
    private javax.swing.JButton statBtn;
    // End of variables declaration//GEN-END:variables
}