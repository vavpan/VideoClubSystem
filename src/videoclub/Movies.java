package videoclub;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Movies extends javax.swing.JFrame {

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("videoclub.jpg")));
    }

    Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;

    public Movies() {
        initComponents();
        DisplayMovies();
        icon();
    }

    private void DisplayMovies() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from MovieTbl");
            MovieTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    int MovieId;

    private void CountMovies() {
        try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select Max(MId) from MovieTbl");
            Rs1.next();
            MovieId = Rs1.getInt(1) + 1;
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MNameTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DirectorTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BCover = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MovieTable = new javax.swing.JTable();
        savebtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        DeleteBtn1 = new javax.swing.JButton();
        FilterBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("ABeeZee", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Video Club System");

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("ABeeZee", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Manage Movies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)))
                .addGap(429, 429, 429))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("ABeeZee", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Register Movie");

        MNameTb.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        MNameTb.setForeground(new java.awt.Color(255, 0, 0));
        MNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameTbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Movie");

        jLabel5.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Director");

        DirectorTb.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        DirectorTb.setForeground(new java.awt.Color(255, 0, 0));
        DirectorTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectorTbActionPerformed(evt);
            }
        });

        PriceTb.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(255, 0, 0));
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Price");

        QtyTb.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(255, 0, 0));
        QtyTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 0));
        jLabel7.setText("Quantity");

        BCover.setText("MovieCover");

        BrowseBtn.setText("Browse");
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("ABeeZee", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Cover");

        MovieTable.setFont(new java.awt.Font("ABeeZee", 0, 12)); // NOI18N
        MovieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Director", "Price", "Quanity", "Cover"
            }
        ));
        MovieTable.setRowHeight(28);
        MovieTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        MovieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MovieTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MovieTable);

        savebtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        savebtn.setForeground(new java.awt.Color(204, 0, 51));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(204, 0, 51));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(204, 0, 51));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
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
            .addGap(0, 13, Short.MAX_VALUE)
        );

        DeleteBtn1.setFont(new java.awt.Font("ABeeZee", 0, 20)); // NOI18N
        DeleteBtn1.setForeground(new java.awt.Color(51, 0, 51));
        DeleteBtn1.setText("Back");
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });

        FilterBtn.setFont(new java.awt.Font("ABeeZee", 0, 14)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(204, 0, 51));
        FilterBtn.setText("Refresh");
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("*To add a movie first refresh and then add the fields");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(DirectorTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addComponent(BCover, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BrowseBtn)
                .addGap(419, 419, 419))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DirectorTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
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

    private void MNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNameTbActionPerformed

    private void DirectorTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectorTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectorTbActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed
    public ImageIcon ResizeCover(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(BCover.getWidth(), BCover.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    String imgPath;
    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        //Browse to Image
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(file);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            BCover.setIcon(ResizeCover(path, null));
            imgPath = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "No File Selected");
        }
    }//GEN-LAST:event_BrowseBtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        //Insert Movie
        if (MNameTb.getText().isEmpty() || DirectorTb.getText().isEmpty() || PriceTb.getText().isEmpty() || QtyTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!!!");
        } else {
            try {
                CountMovies();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
                PreparedStatement Save = Con.prepareStatement("insert into MovieTbl values(?,?,?,?,?,?)");
                Save.setInt(1, MovieId);
                Save.setString(2, MNameTb.getText());
                Save.setString(3, DirectorTb.getText());
                Save.setInt(4, Integer.valueOf(PriceTb.getText()));
                Save.setInt(5, Integer.valueOf(QtyTb.getText()));
                InputStream img = new FileInputStream(imgPath);
                Save.setBlob(6, img);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Movie Added!!!");
                Con.close();
                DisplayMovies();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        
        if (imgPath != null) {
        
            try {
                InputStream img = new FileInputStream(imgPath);
                String UpdateQuery = "Update MovieTbl set MName=?,Director=?,Price=?,Qty=?,Cover=? where MId=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
                PreparedStatement Save = Con.prepareStatement(UpdateQuery);
                Save.setInt(6, Key);
                Save.setString(1, MNameTb.getText());
                Save.setString(2, DirectorTb.getText());
                Save.setInt(3, Integer.valueOf(PriceTb.getText()));
                Save.setInt(4, Integer.valueOf(QtyTb.getText()));
                Save.setBlob(5, img);
                if (Save.executeUpdate() == 1) {
                    DisplayMovies();
                    JOptionPane.showMessageDialog(this, "Movie Updated!!!");
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information!!!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Missing Information!!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Cover Selected!!!");
        }
        imgPath = null;
    }//GEN-LAST:event_EditBtnActionPerformed
    private void GetMovieCover() {
        String Query = "select Cover from MovieTbl where MId=" + Key;
        Statement St;
        ResultSet Rs;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if (Rs.next()) {
                BCover.setIcon(ResizeCover(null, Rs.getBytes("Cover")));
            }
        } catch (Exception e) {
        }
    }
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select a Movie!!!");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclubdb", "root", "");
                String Query = "delete from MovieTbl where MId =" + Key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Movie Deleted!!!");
                DisplayMovies();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed
    int Key = 0;
    private void MovieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovieTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) MovieTable.getModel();
        int MyIndex = MovieTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        MNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        DirectorTb.setText(model.getValueAt(MyIndex, 2).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 3).toString());
        QtyTb.setText(model.getValueAt(MyIndex, 4).toString());
        GetMovieCover();
    }//GEN-LAST:event_MovieTableMouseClicked

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // Reset Code
        MNameTb.setText("");
        DirectorTb.setText("");
        PriceTb.setText("");
        QtyTb.setText("");
        BCover.setIcon(null);


    }//GEN-LAST:event_FilterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCover;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JTextField DirectorTb;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JTextField MNameTb;
    private javax.swing.JTable MovieTable;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
