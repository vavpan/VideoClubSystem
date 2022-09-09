package videoclub;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ReturnMovies extends javax.swing.JFrame {

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("videoclub.jpg")));
    }

    public ReturnMovies() {
        initComponents();
        DisplayRentals();
        DisplayReturn();
        icon();
    }
    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null, Rs2 = null;
    Statement St = null, St1 = null, St2 = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RentDateTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ReturnDate = new com.toedter.calendar.JDateChooser();
        MovieTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        CustomerTb = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        RentalTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("ABeeZee", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Video Club System");

        jLabel2.setFont(new java.awt.Font("ABeeZee", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Return Movies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jLabel3.setFont(new java.awt.Font("ABeeZee", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Return Movies");

        RentDateTb.setEditable(false);
        RentDateTb.setFont(new java.awt.Font("ABeeZee", 1, 14)); // NOI18N
        RentDateTb.setForeground(new java.awt.Color(255, 0, 102));
        RentDateTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentDateTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Movie");

        jLabel5.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Customer");

        jLabel7.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Return Date");

        ReturnBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        ReturnBtn.setForeground(new java.awt.Color(204, 0, 51));
        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(204, 0, 51));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Rented Movies");

        MovieTb.setEditable(false);
        MovieTb.setFont(new java.awt.Font("ABeeZee", 1, 14)); // NOI18N
        MovieTb.setForeground(new java.awt.Color(255, 0, 102));
        MovieTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovieTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Rental Date");

        BackBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(204, 0, 51));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CustomerTb.setEditable(false);
        CustomerTb.setFont(new java.awt.Font("ABeeZee", 1, 14)); // NOI18N
        CustomerTb.setForeground(new java.awt.Color(255, 0, 102));
        CustomerTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerTbActionPerformed(evt);
            }
        });

        RentalTable.setFont(new java.awt.Font("ABeeZee", 0, 12)); // NOI18N
        RentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Movie", "Date"
            }
        ));
        RentalTable.setRowHeight(28);
        RentalTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        RentalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentalTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RentalTable);

        ReturnTable.setFont(new java.awt.Font("ABeeZee", 0, 12)); // NOI18N
        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Movie", "Employee", "Return Date", "Rent Date"
            }
        ));
        ReturnTable.setRowHeight(28);
        ReturnTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ReturnTable);

        jLabel10.setFont(new java.awt.Font("Cooper Black", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Returned Movies");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(RentDateTb)
                        .addComponent(ReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addGap(669, 669, 669))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(MovieTb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerTb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MovieTb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RentDateTb)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CustomerTb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerTbActionPerformed
    private void DisplayRentals() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from IssueTbl");
            RentalTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void MovieTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovieTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovieTbActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // Reset Code
        MovieTb.setText("");
        ReturnDate.setDate(null);
        CustomerTb.setText("");
        RentDateTb.setText("");
    }//GEN-LAST:event_ResetBtnActionPerformed
    int RId;

    private void CountReturn() {
        try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(RetNum) from ReturnTbl");
            Rs1.next();
            RId = Rs1.getInt(1) + 1;
        } catch (Exception e) {
        }
    }

    private void DisplayReturn() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from ReturnTbl");
            ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }

    private void GetAvailabelQty() {
        try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Qty from MovieTbl where MId=" + MovieId);
            Rs1.next();
            AvailMovie = Rs1.getInt(1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void DeleteRental() {

        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            String Query = "delete from IssueTbl where INum =" + RentId;
            Statement Del = Con.createStatement();
            Del.executeUpdate(Query);

        } catch (Exception e) {
        }

    }
    int AvailMovie;

    private void UpdateΜovie() {
        GetAvailabelQty();
        try {
            int NewQty = Integer.valueOf(AvailMovie) + 1;
            String UpdateQuery = "Update MovieTbl set Qty=? where MId=?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            PreparedStatement Save = Con.prepareStatement(UpdateQuery);
            Save.setInt(2, MovieId);
            Save.setInt(1, NewQty);

            if (Save.executeUpdate() == 1) {
                // DisplayMovies();
                // JOptionPane.showMessageDialog(this, "Employee Updated!!!");
            } else {
                //  JOptionPane.showMessageDialog(this, "Something Went Wrong!!!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed

        if (RentId == -1) {
            JOptionPane.showMessageDialog(this, "Select a Book To Return!!!");
        } else {
            CountReturn();
            try {

                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
                PreparedStatement Save = Con.prepareStatement("insert into ReturnTbl values(?,?,?,?,?,?)");
                Save.setInt(1, RId);
                Save.setInt(2, CstId);
                Save.setInt(3, Integer.valueOf(MovieId));
                Save.setInt(4, 1);
                String RetDate = ReturnDate.getDate().toString().substring(0, 13);
                Save.setString(5, RetDate);
                String RentDate = RentDateTb.getText();
                Save.setString(6, RentDate);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book Returned!!!");
                //                Con.close();
                UpdateΜovie();
                DeleteRental();
                DisplayReturn();
                DisplayRentals();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void RentDateTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentDateTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentDateTbActionPerformed
    int CstId;
    int MovieId;
    int RentId = -1;
    private void RentalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentalTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) RentalTable.getModel();
        int MyIndex = RentalTable.getSelectedRow();
        RentId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        CstId = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
        CustomerTb.setText(model.getValueAt(MyIndex, 1).toString());
        MovieId = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        MovieTb.setText(model.getValueAt(MyIndex, 2).toString());
        String RentDate = model.getValueAt(MyIndex, 3).toString().substring(0, 13);
        RentDateTb.setText(RentDate);
        GetAvailabelQty();
    }//GEN-LAST:event_RentalTableMouseClicked

    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTableMouseClicked

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
            java.util.logging.Logger.getLogger(ReturnMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnMovies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField CustomerTb;
    private javax.swing.JTextField MovieTb;
    private javax.swing.JTextField RentDateTb;
    private javax.swing.JTable RentalTable;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton ReturnBtn;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
