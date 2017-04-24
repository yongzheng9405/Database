/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pending00;

import java.awt.FlowLayout;

/**
 *
 * @author zhangyongzheng
 */
public class ChooseFunctionallynew extends javax.swing.JPanel {

    /**
     * Creates new form ChooseFunctionallynew
     */
    public ChooseFunctionallynew() {
        initComponents();
        this.setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choosepanel = new javax.swing.JPanel();
        FilterSearchPOIButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reportgenerate = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        FilterSearchPOIButton.setText("Filter/Search API");
        FilterSearchPOIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterSearchPOIButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ayuthaya", 0, 18)); // NOI18N
        jLabel1.setText("Choose Functionality");

        reportgenerate.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        reportgenerate.setText("POI Report");
        reportgenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportgenerateActionPerformed(evt);
            }
        });

        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choosepanelLayout = new javax.swing.GroupLayout(choosepanel);
        choosepanel.setLayout(choosepanelLayout);
        choosepanelLayout.setHorizontalGroup(
            choosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choosepanelLayout.createSequentialGroup()
                .addGroup(choosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choosepanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosepanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout)))
                .addContainerGap())
            .addGroup(choosepanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(choosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportgenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterSearchPOIButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        choosepanelLayout.setVerticalGroup(
            choosepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choosepanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(FilterSearchPOIButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(reportgenerate)
                .addGap(33, 33, 33)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(choosepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choosepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FilterSearchPOIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterSearchPOIButtonActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        ViewPoinew vpn = new ViewPoinew();
        this.add(vpn);
        validate();
        repaint();
    }//GEN-LAST:event_FilterSearchPOIButtonActionPerformed

    private void reportgenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportgenerateActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        PoiReportnew prn = new PoiReportnew();
        this.add(prn);
        validate();
        repaint();
    }//GEN-LAST:event_reportgenerateActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        Login2 np = new Login2();
        this.add(np);
        validate();
        repaint();  
        
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton FilterSearchPOIButton;
    public javax.swing.JPanel choosepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    public javax.swing.JButton reportgenerate;
    // End of variables declaration//GEN-END:variables
}