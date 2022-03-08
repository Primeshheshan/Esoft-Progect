/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_esoft;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Supplier_details extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_details
     */
    public Supplier_details() {
        initComponents();
          fillTable();
          supid();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSDcontactNo = new javax.swing.JTextField();
        txtSDemail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnSDadd = new javax.swing.JButton();
        btnSDupdate = new javax.swing.JButton();
        btnSDdelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSDSupplierName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSDnic = new javax.swing.JTextField();
        txtSDaddress = new javax.swing.JScrollPane();
        txtSdaddress = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSDsupplier = new javax.swing.JTable();
        btnSDclear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblSDsupplierId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmpro = new javax.swing.JMenuItem();
        jmcus = new javax.swing.JMenuItem();
        jmin = new javax.swing.JMenuItem();
        jmexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSDcontactNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSDcontactNo.setForeground(new java.awt.Color(0, 0, 204));
        txtSDcontactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDcontactNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSDcontactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 190, 30));

        txtSDemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSDemail.setForeground(new java.awt.Color(0, 0, 204));
        txtSDemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtSDemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Contact No");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Supplier Name");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 160, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Address");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 110, 30));

        btnSDadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSDadd.setForeground(new java.awt.Color(204, 0, 0));
        btnSDadd.setText("Add");
        btnSDadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnSDadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, 120, 40));

        btnSDupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSDupdate.setForeground(new java.awt.Color(204, 0, 0));
        btnSDupdate.setText("Update");
        btnSDupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnSDupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 120, 40));

        btnSDdelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSDdelete.setForeground(new java.awt.Color(204, 0, 0));
        btnSDdelete.setText("Delete");
        btnSDdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSDdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Supplier Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, 30));

        txtSDSupplierName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSDSupplierName.setForeground(new java.awt.Color(0, 0, 204));
        txtSDSupplierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDSupplierNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtSDSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 240, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NIC");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 70, -1));

        txtSDnic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSDnic.setForeground(new java.awt.Color(0, 0, 204));
        txtSDnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDnicActionPerformed(evt);
            }
        });
        getContentPane().add(txtSDnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 190, 30));

        txtSdaddress.setColumns(20);
        txtSdaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSdaddress.setForeground(new java.awt.Color(0, 0, 153));
        txtSdaddress.setRows(5);
        txtSDaddress.setViewportView(txtSdaddress);

        getContentPane().add(txtSDaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        tblSDsupplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSDsupplier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblSDsupplier.setForeground(new java.awt.Color(0, 0, 153));
        tblSDsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSDsupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSDsupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSDsupplier);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 970, 150));

        btnSDclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSDclear.setForeground(new java.awt.Color(204, 0, 0));
        btnSDclear.setText("Clear");
        btnSDclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnSDclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 340, 120, 40));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SUPPLIER DETAILS");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 470, 40));

        lblSDsupplierId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSDsupplierId.setForeground(new java.awt.Color(0, 0, 204));
        lblSDsupplierId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblSDsupplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_esoft/40pyh0E.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 770));

        jMenu3.setText("File");

        jmpro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmpro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmpro.setForeground(new java.awt.Color(0, 51, 51));
        jmpro.setText("Stock");
        jmpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmproActionPerformed(evt);
            }
        });
        jMenu3.add(jmpro);

        jmcus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmcus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmcus.setForeground(new java.awt.Color(0, 51, 51));
        jmcus.setText("Add customer");
        jmcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcusActionPerformed(evt);
            }
        });
        jMenu3.add(jmcus);

        jmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmin.setForeground(new java.awt.Color(0, 51, 51));
        jmin.setText("Invoice");
        jmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jminActionPerformed(evt);
            }
        });
        jMenu3.add(jmin);

        jmexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jmexit.setForeground(new java.awt.Color(0, 51, 51));
        jmexit.setText("Exit");
        jmexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmexitActionPerformed(evt);
            }
        });
        jMenu3.add(jmexit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDemailActionPerformed

    private void btnSDaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDaddActionPerformed
        String a = lblSDsupplierId.getText();
        int id = Integer.parseInt(a);
        String b = txtSDSupplierName.getText();

        String c = txtSDcontactNo.getText();
        int cn = Integer.parseInt(c);
        String d = txtSDemail.getText();
        String e = txtSdaddress.getText();
        String f = txtSDnic.getText();
        int nn = Integer.parseInt(f);

        try {

            Connection con = DBConnection.getConnection();

            String sqlQurey = "insert into suppliers (Sup_id,Name,ContactNo,Email,Address,NIC) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sqlQurey);
            ps.setInt(1, id);
            ps.setString(2, b);
            ps.setInt(3, cn);
            ps.setString(4, d);
            ps.setString(5, e);
            ps.setInt(6, nn);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Insert Successfully", "supplier", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Record Insert Successfully ");
            fillTable();
            clear();
            supid();

        } catch (SQLException ex) {

            System.out.println("error");
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnSDaddActionPerformed
void supid()
{
    
    try {
            // TODO code application logic here
            Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
        
           ResultSet rs= st.executeQuery("SELECT MAX(Sup_id) FROM suppliers ");
            while (rs.next()) 
            {
        int max=rs.getInt(1);
        int totmx =max+1;
        String m=Integer.toString(totmx);
         lblSDsupplierId.setText(m);
            }
              
            System.out.println("Record inivoiceNo get Successfully ");
                       
        }catch (SQLException ex) {
            System.out.println("error");
            ex.printStackTrace();
        }
    
}
    private void btnSDupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDupdateActionPerformed

        String a = lblSDsupplierId.getText();
        int id = Integer.parseInt(a);
        String b = txtSDSupplierName.getText();
        String c = txtSDcontactNo.getText();
        int cn = Integer.parseInt(c);
        String d = txtSDemail.getText();
        String e = txtSdaddress.getText();
        String f = txtSDnic.getText();
        int nn = Integer.parseInt(f);

        try {

            Connection con = DBConnection.getConnection();

            String sqlQurey = "update suppliers Set Name=?, ContactNo=?,Email=?,Address=?,NIC=? where Sup_id=" + id;
            PreparedStatement ps = con.prepareStatement(sqlQurey);
            ps.setString(1, b);
            ps.setInt(2, cn);
            ps.setString(3, d);
            ps.setString(4, e);
            ps.setInt(5, nn);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Update Successfully", "supplier", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Record Update Successfully ");
            fillTable();
            clear();
            supid();

        } catch (SQLException ex) {

            System.out.println("error");
            ex.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSDupdateActionPerformed

    private void btnSDdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDdeleteActionPerformed

        String a = lblSDsupplierId.getText();
        int id = Integer.parseInt(a);

        try {
            // TODO code application logic here
            Connection con = DBConnection.getConnection();

            String sqlQurey = "delete from suppliers where Sup_id=" + id;
            PreparedStatement ps = con.prepareStatement(sqlQurey);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Record Delete Successfully", "suppliers", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Record Delete Successfully ");
           fillTable();
            clear();

            System.out.println("Record Delete Successfully ");
        } catch (SQLException ex) {
            System.out.println("error");
            ex.printStackTrace();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSDdeleteActionPerformed

    private void btnSDclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDclearActionPerformed
clear();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSDclearActionPerformed

    private void txtSDcontactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDcontactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDcontactNoActionPerformed

    private void txtSDnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDnicActionPerformed

    private void tblSDsupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSDsupplierMouseClicked
DefaultTableModel mode1=(DefaultTableModel)tblSDsupplier.getModel();
int select = tblSDsupplier.getSelectedRow();
lblSDsupplierId.setText(mode1.getValueAt(select,0).toString());
txtSDSupplierName.setText(mode1.getValueAt(select,1).toString());
txtSDcontactNo.setText(mode1.getValueAt(select,2).toString());
txtSDemail.setText(mode1.getValueAt(select,3).toString());
txtSDnic.setText(mode1.getValueAt(select,4).toString());
txtSdaddress.setText(mode1.getValueAt(select,5).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSDsupplierMouseClicked

    private void jmproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmproActionPerformed
        new Stock().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jmproActionPerformed

    private void jmcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcusActionPerformed
        this.setVisible(false);
        new Customer().setVisible(true); // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jmcusActionPerformed

    private void jminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jminActionPerformed
         this.setVisible(false);
        new Invoice().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jminActionPerformed

    private void jmexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmexitActionPerformed
       this.setVisible(false);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jmexitActionPerformed

    private void txtSDSupplierNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDSupplierNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDSupplierNameActionPerformed
    void clear() {
        txtSDSupplierName.setText("");
        txtSDemail.setText("");
        txtSDcontactNo.setText("");
        txtSDnic.setText("");
        txtSdaddress.setText("");
         supid();
    }
 public  void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{"Sup_id", "Name", "ContactNo", "Email","nic","address"}, 0);
            
            Connection con = DBConnection.getConnection();
            String sql="SELECT * FROM suppliers";
            
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            TableModel tb = model;
            tb =  DbUtils.resultSetToTableModel(rs);
            tblSDsupplier.setModel(tb);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          
    }
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
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Supplier_details myFrame = new Supplier_details();
                myFrame.setVisible(true);
               myFrame.setExtendedState(myFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSDadd;
    private javax.swing.JButton btnSDclear;
    private javax.swing.JButton btnSDdelete;
    private javax.swing.JButton btnSDupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmcus;
    private javax.swing.JMenuItem jmexit;
    private javax.swing.JMenuItem jmin;
    private javax.swing.JMenuItem jmpro;
    private javax.swing.JLabel lblSDsupplierId;
    private javax.swing.JTable tblSDsupplier;
    private javax.swing.JTextField txtSDSupplierName;
    private javax.swing.JScrollPane txtSDaddress;
    private javax.swing.JTextField txtSDcontactNo;
    private javax.swing.JTextField txtSDemail;
    private javax.swing.JTextField txtSDnic;
    private javax.swing.JTextArea txtSdaddress;
    // End of variables declaration//GEN-END:variables
}
