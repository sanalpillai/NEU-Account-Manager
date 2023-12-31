/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.User;
import model.UserHistory;

/**
 *
 * @author sanal
 */
public class AdminCreateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserUpdateJPanel
     */
    
    User user;
    UserHistory history;
    
    public AdminCreateProfileJPanel(UserHistory history) {
        initComponents();
        this.user = user;
        this.history = history;
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Person" }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserinfo = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lblFirstname = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblLastname = new javax.swing.JLabel();
        txtNeuid = new javax.swing.JTextField();
        lblNeuid = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblDob = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnSaveUser = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox<>();

        lblUserinfo.setBackground(new java.awt.Color(204, 204, 255));
        lblUserinfo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblUserinfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserinfo.setText("Create Person");

        txtFirstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblFirstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFirstname.setText("First Name:");

        txtLastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblLastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLastname.setText("Last Name:");

        txtNeuid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblNeuid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNeuid.setText("NEU ID:");

        txtDob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblDob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDob.setText("Date Of Birth:");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhone.setText("Phone:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email:");

        btnSaveUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSaveUser.setText("Save");
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setText("Password:");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStatus.setText("Role");

        comboStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Person" }));
        comboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUserinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDob)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblNeuid)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNeuid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblLastname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFirstname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnSaveUser)))
                .addGap(592, 592, 592))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboStatus, lblDob, lblEmail, lblFirstname, lblLastname, lblNeuid, lblPassword, lblPhone, lblStatus, lblUsername, txtDob, txtEmail, txtFirstname, txtLastname, txtNeuid, txtPassword, txtPhone, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUserinfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNeuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNeuid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSaveUser)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboStatus, lblDob, lblEmail, lblFirstname, lblLastname, lblNeuid, lblPassword, lblPhone, lblStatus, lblUsername, txtDob, txtEmail, txtFirstname, txtLastname, txtNeuid, txtPassword, txtPhone, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        // TODO add your handling code here:
        
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String firstname = txtFirstname.getText();
        String lastname = txtLastname.getText();
        String neuid = txtNeuid.getText();
        String dob = txtDob.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String status = comboStatus.getSelectedItem().toString();
        
        if(username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be empty.");
            return;
        }

        if(password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password can't be empty.");
            return;
        }

        if(firstname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Firstname cannot be empty.");
            return;
        }

        if(lastname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Lastname cannot be empty.");
            return;
        }

        if(neuid.isEmpty() || !neuid.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "NEU ID should be numeric and cannot be empty.");
            return;
        }

        if(!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "DOB should be in format YYYY-MM-DD.");
            return;
        }

        if(!phone.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Phone number should be 10 digits.");
            return;
        }

        if(email.isEmpty() || !email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Invalid email address.");
            return;
        }
        
        User nu = history.addNewUser();
        
        nu.setUsername(username);
        nu.setPassword(password);
        nu.setFirstname(firstname);
        nu.setLastname(lastname);
        nu.setNeuid(neuid);
        nu.setDob(dob);
        nu.setPhone(phone);
        nu.setEmail(email);
        nu.setStatus(status);
        
        
        if (nu.getStatus().equalsIgnoreCase("user"))
        {
        JOptionPane.showMessageDialog(this, "User Created.");
        }
        else {
        JOptionPane.showMessageDialog(this, "Person Created.");    
        }
        
        txtUsername.setText("");
        txtPassword.setText("");
        txtFirstname.setText("");
        txtLastname.setText("");
        txtNeuid.setText("");
        txtDob.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        
        
    }//GEN-LAST:event_btnSaveUserActionPerformed

    private void comboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblNeuid;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUserinfo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtNeuid;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
