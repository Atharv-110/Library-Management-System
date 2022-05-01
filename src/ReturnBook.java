import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class ReturnBook extends javax.swing.JFrame {
    public ReturnBook() {
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
        searchBtn = new javax.swing.JButton();
        bookId = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        dueTf = new javax.swing.JTextField();
        studId = new javax.swing.JTextField();
        issueTf = new javax.swing.JTextField();
        returnBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RETURN BOOK");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 190, 60));

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

        searchBtn.setBackground(new java.awt.Color(255, 95, 9));
        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 120, 40));

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
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 110, 40));

        dueTf.setEditable(false);
        dueTf.setBackground(new java.awt.Color(190, 183, 164));
        dueTf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dueTf.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(dueTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, 40));

        studId.setBackground(new java.awt.Color(190, 183, 164));
        studId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        studId.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(studId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 260, 40));

        issueTf.setEditable(false);
        issueTf.setBackground(new java.awt.Color(190, 183, 164));
        issueTf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        issueTf.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(issueTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 40));

        returnBtn.setBackground(new java.awt.Color(255, 95, 9));
        returnBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("RETURN");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String bId = bookId.getText();
        String sId  =studId.getText();
        try{
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Issue where Book_Id='"+bId+"' and Student_Id='"+sId+"'");
            if(rs.next()){
                issueTf.setText(rs.getString(3));
                dueTf.setText(rs.getString(4));
                bookId.setEditable(false);
                studId.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect Details");
                this.dispose();
                new ReturnBook().setVisible(true);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Connection Error");
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        bookId.setText("");
        studId.setText("");
        issueTf.setText("");
        dueTf.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        String bId = bookId.getText();
        String studentId = studId.getText();
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update Issue set Return_Book = 'YES' where Book_Id = '"+bId+"' and Student_Id = '"+studentId+"'");
            JOptionPane.showMessageDialog(this,"Book Returned Successfully!");
            this.dispose();
            new ReturnBook().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Connection Error");
            this.dispose();
            new ReturnBook().setVisible(true);
        }
    }//GEN-LAST:event_returnBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField dueTf;
    private javax.swing.JTextField issueTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField studId;
    // End of variables declaration//GEN-END:variables
}