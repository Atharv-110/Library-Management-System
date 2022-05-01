import java.sql.*;
import javax.swing.JOptionPane;
public class NewBook extends javax.swing.JFrame {
    public NewBook() {
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
        jLabel6 = new javax.swing.JLabel();
        bookYear = new javax.swing.JTextField();
        bookPrc = new javax.swing.JTextField();
        bookPub = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        bookId = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        bookName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NEW BOOK");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 60));

        jLabel2.setBackground(new java.awt.Color(190, 183, 164));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BOOK ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 40));

        jLabel3.setBackground(new java.awt.Color(190, 183, 164));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("BOOK NAME");
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
        jLabel4.setText("PUBLISHER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 40));

        jLabel5.setBackground(new java.awt.Color(190, 183, 164));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRICE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 40));

        jLabel6.setBackground(new java.awt.Color(190, 183, 164));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PUBLISH YEAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, 40));

        bookYear.setBackground(new java.awt.Color(190, 183, 164));
        bookYear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookYear.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, 40));

        bookPrc.setBackground(new java.awt.Color(190, 183, 164));
        bookPrc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookPrc.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(bookPrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 260, 40));

        bookPub.setBackground(new java.awt.Color(190, 183, 164));
        bookPub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookPub.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(bookPub, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 40));

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
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 40));

        bookName.setBackground(new java.awt.Color(190, 183, 164));
        bookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bookName.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String bId = bookId.getText();
        String bName = bookName.getText();
        String bPub = bookPub.getText();
        double bPrc = Double.parseDouble(bookPrc.getText());
        int bYear = Integer.parseInt(bookYear.getText());
        try {
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            String sql = "insert into Book values('"+bId+"','"+bName+"','"+bPub+"','"+bPrc+"','"+bYear+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Book Added Successfully");
            this.dispose();
            new NewBook().setVisible(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Book  ID already exist");
            this.dispose();
            new NewBook().setVisible(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        bookId.setText("");
        bookName.setText("");
        bookPub.setText("");
        bookPrc.setText("");
        bookYear.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId;
    private javax.swing.JTextField bookName;
    private javax.swing.JTextField bookPrc;
    private javax.swing.JTextField bookPub;
    private javax.swing.JTextField bookYear;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}