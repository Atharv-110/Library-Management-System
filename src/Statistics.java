import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Statistics extends javax.swing.JFrame {
    public Statistics() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        detailBtn1 = new javax.swing.JButton();
        detailBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        returnTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ISSUE DETAILS");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 190, 60));

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("RETURN DETAILS");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 220, 60));

        detailBtn1.setBackground(new java.awt.Color(255, 95, 9));
        detailBtn1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        detailBtn1.setForeground(new java.awt.Color(255, 255, 255));
        detailBtn1.setText("RETURN DETAILS");
        detailBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(detailBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 40));

        detailBtn.setBackground(new java.awt.Color(255, 95, 9));
        detailBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        detailBtn.setForeground(new java.awt.Color(255, 255, 255));
        detailBtn.setText("ISSUE DETAILS");
        detailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailBtnActionPerformed(evt);
            }
        });
        getContentPane().add(detailBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 40));

        returnTable.setAutoCreateRowSorter(true);
        returnTable.setBackground(new java.awt.Color(190, 183, 164));
        returnTable.setForeground(new java.awt.Color(51, 51, 51));
        returnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        returnTable.setShowGrid(true);
        returnTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                returnTableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(returnTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 750, 110));

        issueTable.setAutoCreateRowSorter(true);
        issueTable.setBackground(new java.awt.Color(190, 183, 164));
        issueTable.setForeground(new java.awt.Color(51, 51, 51));
        issueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        issueTable.setEnabled(false);
        issueTable.setRowSelectionAllowed(false);
        issueTable.setShowGrid(true);
        issueTable.setUpdateSelectionOnSort(false);
        issueTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                issueTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(issueTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Images/bg2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed
     
    private void issueTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_issueTableComponentShown
    }//GEN-LAST:event_issueTableComponentShown

    private void returnTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_returnTableComponentShown
    }//GEN-LAST:event_returnTableComponentShown

    private void detailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtnActionPerformed
        try{
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Issue.Student_Id, Student.Student_Name, Issue.Book_Id, Book.Book_Name, Issue.Issue_Date, Issue.Due_Date from Student inner join Book inner join Issue where Book.Book_Id=Issue.Book_Id and Student.Student_ID = Issue.Student_Id and Issue.Return_Book = 'NO'");
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) issueTable.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i = 0;i<cols;i++){
                colName[i] = rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colName);
            String sId,sName,bId,bName,issueD,dueD;
            while(rs.next()){
                sId = rs.getString(1);
                sName = rs.getString(2);
                bId = rs.getString(3);
                bName = rs.getString(4);
                issueD = rs.getString(5);
                dueD = rs.getString(6);
                String []row = {sId,sName,bId,bName,issueD,dueD};
                model.addRow(row);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_detailBtnActionPerformed

    private void detailBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailBtn1ActionPerformed
        try{
            Connection con = Conn.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select Issue.Student_Id, Student.Student_Name, Issue.Book_Id, Book.Book_Name, Issue.Issue_Date, Issue.Due_Date from Student inner join Book inner join Issue where Book.Book_Id=Issue.Book_Id and Student.Student_ID = Issue.Student_Id and Issue.Return_Book = 'YES'");
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) returnTable.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for(int i = 0;i<cols;i++){
                colName[i] = rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colName);
            String sId,sName,bId,bName,issueD,dueD;
            while(rs.next()){
                sId = rs.getString(1);
                sName = rs.getString(2);
                bId = rs.getString(3);
                bName = rs.getString(4);
                issueD = rs.getString(5);
                dueD = rs.getString(6);
                String []row = {sId,sName,bId,bName,issueD,dueD};
                model.addRow(row);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_detailBtn1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton closeBtn;
    javax.swing.JButton detailBtn;
    javax.swing.JButton detailBtn1;
    javax.swing.JTable issueTable;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTable returnTable;
    // End of variables declaration//GEN-END:variables
}