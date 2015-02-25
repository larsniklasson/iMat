/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import javax.swing.JButton;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.User;
import sun.security.util.Password;

/**
 *
 * @author Rasmus
 */
public class SignInView extends javax.swing.JPanel {
    
    private static  IMatDataHandler im = IMatDataHandler.getInstance();
    
    private static  User user;
    private static  Customer customer;
    
    private static  boolean isNewUser;
    
    private static String mail;
    private static  String password;
    private static  String rePassword;
    
    private static  String firstName;
    private static  String lastName;
    private static  String phoneNummer;
    
    private static  String address;
    private static  String zipCode;
    private static  String city;
    
    private static JButton JB; 
    
    
    /**
     * Creates new form SignInView
     */
    public SignInView(JButton jbutton) {
        initComponents();
        
        isNewUser = false;
        this.regPanel.setVisible(isNewUser);
        user = im.getUser();
        customer = im.getCustomer();
        
        JB = jbutton;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        divPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        divPanel2 = new javax.swing.JPanel();
        regPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PhoneField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        RepPasswordField = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        ZipCodeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        SignInButton = new javax.swing.JButton();
        NewUserLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0, new java.awt.Color(0, 153, 0)));

        divPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("*Mail:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("*Lösenord:");

        MailField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MailField.setText("Exampel@domän.com");
        MailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MailFieldFocusGained(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordField.setText("12341234");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
        });

        javax.swing.GroupLayout divPanel1Layout = new javax.swing.GroupLayout(divPanel1);
        divPanel1.setLayout(divPanel1Layout);
        divPanel1Layout.setHorizontalGroup(
            divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divPanel1Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                .addContainerGap())
        );
        divPanel1Layout.setVerticalGroup(
            divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divPanel1Layout.createSequentialGroup()
                .addGroup(divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(divPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        regPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("*Upprepa Lösenord:");

        LastNameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Efternamn:");

        PhoneField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneField.setText("07");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Förnamn:");

        NameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mobilnummer:");

        RepPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Stad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Address:");

        AddressField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ZipCodeField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Postnummer:");

        CityField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout regPanelLayout = new javax.swing.GroupLayout(regPanel);
        regPanel.setLayout(regPanelLayout);
        regPanelLayout.setHorizontalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(regPanelLayout.createSequentialGroup()
                                .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CityField))
                            .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regPanelLayout.createSequentialGroup()
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameField, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(LastNameField))))
                .addContainerGap())
        );
        regPanelLayout.setVerticalGroup(
            regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RepPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(regPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26))
        );

        SignInButton.setText("Logga in");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });

        NewUserLabel.setForeground(new java.awt.Color(0, 153, 0));
        NewUserLabel.setText("Ny användare");
        NewUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewUserLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewUserLabelMousePressed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout divPanel2Layout = new javax.swing.GroupLayout(divPanel2);
        divPanel2.setLayout(divPanel2Layout);
        divPanel2Layout.setHorizontalGroup(
            divPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewUserLabel)
                .addGap(18, 18, 18)
                .addComponent(SignInButton)
                .addContainerGap())
            .addComponent(regPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        divPanel2Layout.setVerticalGroup(
            divPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divPanel2Layout.createSequentialGroup()
                .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(divPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignInButton)
                    .addComponent(NewUserLabel)
                    .addComponent(errorLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(divPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(divPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(divPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(divPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserLabelMouseClicked
        // TODO add your handling code here:
        switchForumState();
        
    }//GEN-LAST:event_NewUserLabelMouseClicked

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        // TODO add your handling code here:
        
        mail = this.MailField.getText();
        password = new String(this.PasswordField.getPassword());
        
        if(isNewUser){
            
            rePassword = new String(this.RepPasswordField.getPassword());

            firstName = this.NameField.getText();
            lastName = this.LastNameField.getText();
            phoneNummer = this.PhoneField.getText();

            address = this.AddressField.getText();
            zipCode = this.ZipCodeField.getText();
            city = this.CityField.getText();
            
            
            
            if(validRegistation()){
                
                user.setUserName(mail);
                user.setPassword(password);
                
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setMobilePhoneNumber(phoneNummer);
                
                customer.setAddress(address);
                customer.setPostCode(zipCode);
                customer.setPostAddress(city);
                
                this.errorLabel.setText("Du är registrerad");
                switchForumState();
                
            }else{
                this.errorLabel.setText("Lösernoden matcher inte");
            }
            
            
        }else{
            if(validSignIn()){
                this.errorLabel.setText("Du är inloggad");
                JB.setText(customer.getFirstName() + " " + customer.getLastName());
            }else{
                this.errorLabel.setText("Lösenord och mail matchar inte");
            }
        }
        
    }//GEN-LAST:event_SignInButtonActionPerformed

    private void MailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MailFieldFocusGained
        // TODO add your handling code here:
        MailField.setText("");
    }//GEN-LAST:event_MailFieldFocusGained

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        // TODO add your handling code here:
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void NewUserLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUserLabelMousePressed
        // TODO add your handling code here:
        switchForumState();
    }//GEN-LAST:event_NewUserLabelMousePressed
    
    
    private static boolean validRegistation(){
        if(password.equals(rePassword) && password.length() > 6){
            return true;
        }
        
        //more validation here...
        return false;
        
    }
    
    private static boolean validSignIn(){
        if(user.getUserName().equals(mail)){
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        
        return false;
    }
    
    
    private void switchForumState(){
        
        isNewUser = !isNewUser;
        
        if(isNewUser){
            
            this.SignInButton.setText("Registrera");
            this.NewUserLabel.setText("Redan Registrerad");
            
        }else{
            
            this.SignInButton.setText("Logga in");
            this.NewUserLabel.setText("Ny användare");
        }    
             
        this.regPanel.setVisible(isNewUser);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField CityField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField MailField;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NewUserLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JPasswordField RepPasswordField;
    private javax.swing.JButton SignInButton;
    private javax.swing.JTextField ZipCodeField;
    private javax.swing.JPanel divPanel1;
    private javax.swing.JPanel divPanel2;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel regPanel;
    // End of variables declaration//GEN-END:variables
}
