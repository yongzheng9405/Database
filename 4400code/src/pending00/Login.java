/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pending00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author jiayingwang
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basic = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Registerbutton = new javax.swing.JButton();
        passwordlabel = new javax.swing.JLabel();
        passwordtext = new javax.swing.JPasswordField();
        usernametext = new javax.swing.JTextField();
        usernamelabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basic.setPreferredSize(new java.awt.Dimension(800, 400));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Registerbutton.setText("Register");
        Registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbuttonActionPerformed(evt);
            }
        });

        passwordlabel.setText("Password");

        passwordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextActionPerformed(evt);
            }
        });

        usernametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextActionPerformed(evt);
            }
        });

        usernamelabel.setText("Username");

        jLabel1.setText("Welcome!!!!!");

        javax.swing.GroupLayout basicLayout = new javax.swing.GroupLayout(basic);
        basic.setLayout(basicLayout);
        basicLayout.setHorizontalGroup(
            basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicLayout.createSequentialGroup()
                .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basicLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernamelabel)
                            .addComponent(passwordlabel))
                        .addGap(94, 94, 94)
                        .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(basicLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1))
                    .addGroup(basicLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton1)
                        .addGap(80, 80, 80)
                        .addComponent(Registerbutton)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        basicLayout.setVerticalGroup(
            basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basicLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelabel)
                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordlabel)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(basicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Registerbutton))
                .addGap(162, 162, 162))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basic, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basic, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String un = usernametext.getText();
        String pw = String.valueOf(passwordtext.getPassword());
               
        //create SQL query
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            if(!con.isClosed())
                System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");

            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM user WHERE UserName='"+un+"'&& Password='"+pw+"'");

            if(!result.next()){
                LoginFail lg = new LoginFail();
                JFrame frame = new JFrame("Sorry!");
                frame.setContentPane(lg.jPanel1);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            }else{

                Statement statement2 = con.createStatement();
                ResultSet result2 = statement2.executeQuery("SELECT JobType FROM user WHERE UserName='"+un+"'");

                if (result2.next()) {
                    String jobType = result2.getString("JobType");
                    System.out.print(jobType);

                    if (jobType.length() == 5) {
                        getContentPane().removeAll();
                        this.setContentPane(new PendingFunction());
                        this.setVisible(true);
                    }else if(jobType.length() == 13){

                        getContentPane().removeAll();
                        this.setContentPane(new AddNewDataPoint());
                        this.setVisible(true);

                    }else if (jobType.length() == 12) {

                        Statement statement3 = con.createStatement();
                        ResultSet result3 = statement3.executeQuery("SELECT * FROM CityOfficial WHERE CUserName = '"+un+"'");

                        while(result3.next()){
                            Boolean res3 = result3.getBoolean("Approved");
                            System.out.println(res3);
                            if(result3.getBoolean("Approved") != true){             
                                Unaccepted lg2 = new Unaccepted();
                                JFrame frame = new JFrame("Sorry!");
                                frame.setContentPane(lg2.jPanel1);
                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                frame.setLocationRelativeTo(null);
                                frame.pack();
                                frame.setVisible(true);
                            }else{
                                getContentPane().removeAll();
                                this.setContentPane(new ChooseFunctionallynew());
                                this.setVisible(true);    

                            }
                    }



                    }
                }



            }

            con.close();

        } catch(Exception e2) {
            System.err.println("Exception: " + e2.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextActionPerformed

   
    private void RegisterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbuttonActionPerformed
        // TODO add your handling code here:
        Register rg = new Register();
                JFrame frame = new JFrame("Registration");
                frame.setContentPane(rg.basic);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
    }//GEN-LAST:event_RegisterbuttonActionPerformed

    private void passwordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registerbutton;
    public javax.swing.JPanel basic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
}