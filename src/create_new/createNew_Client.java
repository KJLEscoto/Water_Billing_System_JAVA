/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package create_new;

import admin.admin_Dashboard;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import water.DB_Connection;

/**
 *
 * @author Kent
 */
public class createNew_Client extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public createNew_Client() {
        initComponents();
        con = DB_Connection.con();
        loadCategory();
        clientIDincrement();
        AutoCompleteDecorator.decorate(comboCategory);
        AutoCompleteDecorator.decorate(comboClientStatus);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtClientCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClientFirstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtClientLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClientContactNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtClientAddress = new javax.swing.JTextField();
        comboCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMeterCode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFirstReading = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboClientStatus = new javax.swing.JComboBox<>();
        txtMidName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(9, 33, 43));
        jPanel3.setForeground(new java.awt.Color(9, 33, 43));

        jPanel1.setBackground(new java.awt.Color(168, 200, 218));

        jPanel2.setBackground(new java.awt.Color(18, 137, 167));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE NEW CLIENT");

        cancelButton.setBackground(new java.awt.Color(204, 0, 51));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusable(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 153, 0));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.setFocusable(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(9, 33, 43));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 33, 43));
        jLabel2.setText("Client Code");

        txtClientCode.setEditable(false);
        txtClientCode.setBackground(new java.awt.Color(18, 137, 167));
        txtClientCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtClientCode.setForeground(new java.awt.Color(255, 255, 255));
        txtClientCode.setText("20231001");
        txtClientCode.setFocusable(false);

        jLabel3.setBackground(new java.awt.Color(9, 33, 43));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 33, 43));
        jLabel3.setText("First Name");

        jLabel4.setBackground(new java.awt.Color(9, 33, 43));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 33, 43));
        jLabel4.setText("Middle Name (Optional)");

        jLabel5.setBackground(new java.awt.Color(9, 33, 43));
        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 33, 43));
        jLabel5.setText("Last Name");

        jLabel6.setBackground(new java.awt.Color(9, 33, 43));
        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 33, 43));
        jLabel6.setText("Contact #");

        jLabel7.setBackground(new java.awt.Color(9, 33, 43));
        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(9, 33, 43));
        jLabel7.setText("Category");

        comboCategory.setMaximumRowCount(3);

        jLabel8.setBackground(new java.awt.Color(9, 33, 43));
        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(9, 33, 43));
        jLabel8.setText("Address");

        jLabel9.setBackground(new java.awt.Color(9, 33, 43));
        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(9, 33, 43));
        jLabel9.setText("Meter Code");

        jLabel10.setBackground(new java.awt.Color(9, 33, 43));
        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(9, 33, 43));
        jLabel10.setText("First Reading");

        jLabel11.setBackground(new java.awt.Color(9, 33, 43));
        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(9, 33, 43));
        jLabel11.setText("Status");

        comboClientStatus.setMaximumRowCount(3);
        comboClientStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtClientCode, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(comboCategory, 0, 285, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtMeterCode, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(txtClientContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(txtMidName, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(txtFirstReading, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addComponent(comboClientStatus, 0, 285, Short.MAX_VALUE))
                    .addComponent(txtClientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtClientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClientLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtMidName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClientAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtClientContactNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstReading, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtMeterCode, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboClientStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveNewClient();
    }//GEN-LAST:event_saveButtonActionPerformed

    public void saveNewClient() {
        String client_code = txtClientCode.getText();
        String client_fname = txtClientFirstName.getText();
        String client_mname = txtMidName.getText();
        String client_lname = txtClientLastName.getText();
        String contact_no = txtClientContactNumber.getText();
        String client_address = txtClientAddress.getText();
        String meter_code = txtMeterCode.getText();
        String first_reading = txtFirstReading.getText();
        String client_status = (String) comboClientStatus.getSelectedItem();
        
        String selectedCategory = (String) comboCategory.getSelectedItem();        
        String[] partCategory = selectedCategory.split(" - ");
        String category_type = partCategory[0];

        try {
            // Check if the client already exists (only if Client_Status is "Active")
            if (client_status.equals("Active")) {
                String queryCheckDuplicate = "SELECT COUNT(*) FROM clientinformation WHERE Client_Status = 'Active' AND " +
                        "REPLACE(Client_Fname, ' ', '') LIKE ? AND REPLACE(Client_Mname, ' ', '') LIKE ? AND REPLACE(Client_Lname, ' ', '') LIKE ?";
                pst = con.prepareStatement(queryCheckDuplicate);
                pst.setString(1, "%" + client_fname.replaceAll("\\s", "") + "%");
                pst.setString(2, "%" + client_mname.replaceAll("\\s", "") + "%");
                pst.setString(3, "%" + client_lname.replaceAll("\\s", "") + "%");
                rs = pst.executeQuery();
                rs.next();
                int duplicateCount = rs.getInt(1);

                if (duplicateCount > 0) {
                    JOptionPane.showMessageDialog(null, "Client already exists.");
                    return;
                }
            }

            // Validate contact_no field as a number
            if (!contact_no.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Invalid Contact Number. Please provide a Valid Number.");
                txtClientContactNumber.setText(null);
                return;
            }

            // Validate first_reading field as a number or decimal
            if (!first_reading.matches("\\d+(\\.\\d+)?")) {
                JOptionPane.showMessageDialog(null, "Invalid First Reading. Please provide a Valid Number or Decimal.");
                txtFirstReading.setText(null);
                return;
            }

            String queryClientInfo = "INSERT INTO clientinformation (Client_Code, Client_Fname, Client_Mname, Client_Lname, Contact_No, Category_ID, Client_Address, Meter_Code, First_Reading, Client_Status) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(queryClientInfo);

            pst.setString(1, client_code);
            pst.setString(2, client_fname);
            pst.setString(3, client_mname);
            pst.setString(4, client_lname);
            pst.setString(5, contact_no);
            pst.setString(6, category_type);
            pst.setString(7, client_address);
            pst.setString(8, meter_code);
            pst.setString(9, first_reading);
            pst.setString(10, client_status);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected == 1) {
                admin_Dashboard a = new admin_Dashboard();
                a.FetchClient();
                a.loadClient_ID();
                a.displayTCountClients();

                JOptionPane.showMessageDialog(null, "Client Added Successfully!");

                txtClientCode.setText(null);
                txtClientFirstName.setText(null);
                txtClientLastName.setText(null);
                txtMidName.setText(null);
                txtClientContactNumber.setText(null);
                txtClientAddress.setText(null);
                txtMeterCode.setText(null);
                txtFirstReading.setText(null);
                comboClientStatus.setSelectedItem("Active");
                clientIDincrement();
                loadCategory();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to Add!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Provide Data Input for all Fields!");
        }
    }
    
    public void loadCategory() {       
       try {
           String queryCategory = "SELECT Category_ID, Category_Type FROM categories WHERE Status='Active'";
           pst = con.prepareStatement(queryCategory);
           comboCategory.removeAllItems();
           rs = pst.executeQuery();
                      
           while(rs.next()) {
               String id = rs.getString(1);
               String type = rs.getString(2);
               String cat = id + " - " + type;
               comboCategory.addItem(cat);
           }
       } catch (SQLException ex) {
           Logger.getLogger(createNew_Client.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    public void clientIDincrement() {
       try {
           String queryClientID = "SELECT Client_Code FROM clientinformation ORDER BY Client_Code DESC LIMIT 1";
           pst = con.prepareStatement(queryClientID);
           rs = pst.executeQuery();
           
           if(rs.next()) {
               int id = rs.getInt(1);
               int n = id + 1;
               txtClientCode.setText(Integer.toString(n));
           }
           
       } catch (SQLException ex) {
           Logger.getLogger(createNew_Client.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
//    public void updateClient() {
//       try {
//           String Client_Code = txtClientCode.getText();
//           String First_Name = txtClientFirstName.getText();
//           String Middle_Name = txtMidName.getText();
//           String Last_Name = txtClientLastName.getText();
//           String Contact_Number = txtClientContactNumber.getText();
//           String Client_Address = txtClientAddress.getText();
//           String Meter_Code = txtMeterCode.getText();
//           String First_Reading= txtFirstReading.getText();
//           String category_type = (String) comboCategory.getSelectedItem();
//           String client_status = (String) comboClientStatus.getSelectedItem();
//           
//           pst = con.prepareStatement("UPDATE clientinformation SET First_Name = ?, Middle_Name = ?, Last_Name= ?, Contact_Number = ?,Client_Address =?, "
//                   + "Meter_Code=?,  First_Reading=?, category_type =?,client_status=? WHERE Client_Code=?");
//            pst.setString(1, Client_Code);
//            pst.setString(2, First_Name );
//            pst.setString(3, Middle_Name);
//            pst.setString(4, Last_Name );
//            pst.setString(5, Contact_Number );
//            pst.setString(6, Client_Address);
//            pst.setString(7, Meter_Code);
//            pst.setString(8, First_Reading);
//            pst.setString(9, category_type );
//            pst.setString(10, client_status );
//                
//                 int rowsAffected = pst.executeUpdate();
//
//                if (rowsAffected == 1) {
//                    JOptionPane.showMessageDialog(null, "SUCCESSFUL:\nClient Added!");
//
//                    txtClientCode.setText(null);
//                    txtClientFirstName.setText(null);
//                    txtClientLastName.setText(null);
//                    txtMidName.setText(null);
//                    txtClientContactNumber.setText(null);
//                    comboCategory.setSelectedItem("Commercial");
//                    txtClientAddress.setText(null);
//                    txtMeterCode.setText(null);
//                    txtFirstReading.setText(null);
//                    comboClientStatus.setSelectedItem("Active");
//                    clientIDincrement();
//                    
//                    admin_Dashboard a = new admin_Dashboard();
//                    a.loadClient_ID();
//                 
//                }           
//       } catch (SQLException ex) {
//           Logger.getLogger(createNew_Client.class.getName()).log(Level.SEVERE, null, ex);
//       }       
//    }
    
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
            java.util.logging.Logger.getLogger(createNew_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createNew_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createNew_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createNew_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createNew_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    public javax.swing.JComboBox<String> comboCategory;
    public javax.swing.JComboBox<String> comboClientStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    public javax.swing.JButton saveButton;
    public javax.swing.JTextField txtClientAddress;
    public javax.swing.JTextField txtClientCode;
    public javax.swing.JTextField txtClientContactNumber;
    public javax.swing.JTextField txtClientFirstName;
    public javax.swing.JTextField txtClientLastName;
    public javax.swing.JTextField txtFirstReading;
    public javax.swing.JTextField txtMeterCode;
    public javax.swing.JTextField txtMidName;
    // End of variables declaration//GEN-END:variables
}
