import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class IssueBook extends javax.swing.JFrame {
    public IssueBook() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        issueBtn = new javax.swing.JButton();
        bookId = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        studId = new javax.swing.JTextField();
        dueChooser = new com.toedter.calendar.JDateChooser();
        issueChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ISSUE BOOK");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 160, 60));

        jLabel2.setBackground(new java.awt.Color(190, 183, 164));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BOOK ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 40));

        jLabel3.setBackground(new java.awt.Color(190, 183, 164));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("STUDENT ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 40));

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

        jLabel4.setBackground(new java.awt.Color(190, 183, 164));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ISSUE DATE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 40));

        jLabel5.setBackground(new java.awt.Color(190, 183, 164));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DUE DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 40));

        issueBtn.setBackground(new java.awt.Color(255, 95, 9));
        issueBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        issueBtn.setForeground(new java.awt.Color(255, 255, 255));
        issueBtn.setText("ISSUE");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, 40));

        bookId.setBackground(new java.awt.Color(190, 183, 164));
        bookId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookId.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, 40));

        clearBtn.setBackground(new java.awt.Color(255, 95, 9));
        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 110, 40));

        studId.setBackground(new java.awt.Color(190, 183, 164));
        studId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studId.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(studId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 260, 40));

        dueChooser.setBackground(new java.awt.Color(190, 183, 164));
        dueChooser.setForeground(new java.awt.Color(51, 51, 51));
        dueChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(dueChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, 40));

        issueChooser.setBackground(new java.awt.Color(190, 183, 164));
        issueChooser.setForeground(new java.awt.Color(51, 51, 51));
        issueChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(issueChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed
    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        SimpleDateFormat dForm = new SimpleDateFormat("dd-MM-yyyy");
        String bId = bookId.getText();
        String studentId = studId.getText();
        String issueD = dForm.format(issueChooser.getDate());
        String dueD = dForm.format(dueChooser.getDate());
        String returnB = "NO";
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Book where Book_Id='"+bId+"'");
            if(rs.next()){
                ResultSet rsl = st.executeQuery("select * from Student where Student_ID='"+studentId+"'");
                if(rsl.next()){
                    st.executeUpdate("insert into Issue values('"+bId+"', '"+studentId+"', '"+issueD+"', '"+dueD+"', '"+returnB+"')");
                    JOptionPane.showMessageDialog(this,"Book Issued Successfully!");
                    this.dispose();
                    new IssueBook().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Student ID");
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Book ID");
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Connection Error");
            this.dispose();
            new IssueBook().setVisible(true);
        }
    }//GEN-LAST:event_issueBtnActionPerformed
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        bookId.setText("");
        studId.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private com.toedter.calendar.JDateChooser dueChooser;
    private javax.swing.JButton issueBtn;
    private com.toedter.calendar.JDateChooser issueChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField studId;
    // End of variables declaration//GEN-END:variables
}