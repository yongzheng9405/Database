/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pending00;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultRowSorter;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;
/**
 *
 * @author lihan
 */
public class PendingDataPoint extends javax.swing.JPanel {

    /**
     * Creates new form PendingDataPoint
     */
    public PendingDataPoint() {
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

        jPanel1 = new javax.swing.JPanel();
        pendingTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        accept = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Selected", "POI location", "Data type", "Data value", "Time and date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        pendingTable.setViewportView(jTable1);

        view.setText("View data points");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        jLabel1.setText("Pending Data Points");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        reject.setText("Reject");
        reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectActionPerformed(evt);
            }
        });

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(pendingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(back)
                            .addGap(109, 109, 109)
                            .addComponent(reject)
                            .addGap(106, 106, 106)
                            .addComponent(accept))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(327, 327, 327)
                            .addComponent(jLabel1))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(view)
                .addGap(28, 28, 28)
                .addComponent(pendingTable, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(reject)
                    .addComponent(accept))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:

        Connection con = null;
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        JCheckBox checkBox = new javax.swing.JCheckBox();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            if(!con.isClosed())
            System.out.println("Successfully connected to " +
                "MySQL server using TCP/IP...");

            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM DataPoint WHERE Accepted IS NULL;");

            while(result.next()){
                model.addRow(new Object[]{null,result.getString(4),result.getString(5),Integer.parseInt(result.getString(3)),result.getString(2)});

            }
            jTable1.getColumn("Selected").setCellEditor(new DefaultCellEditor(checkBox));
            Sort(model);
            Refresh();
            con.close();

        } catch(Exception e2) {
            System.err.println("Exception: " + e2.getMessage());
        }
    }//GEN-LAST:event_viewActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        PendingFunction pf = new PendingFunction();
        this.add(pf);
        validate();
        repaint();
        
    }//GEN-LAST:event_backActionPerformed

    private void rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model1;
        model1 = (DefaultTableModel) jTable1.getModel();

        int row = jTable1.getRowCount();
        int column = jTable1.getColumnCount();

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");

            for(int i = 0; i < row; i++) {
                if (jTable1.getValueAt(i, 0) != null) {
                    if (((Boolean) jTable1.getValueAt(i, 0)).booleanValue()) {
                        jTable1.setValueAt(false, i, 0);

                        //if(!con.isClosed())
                        //System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");

                        Statement statement = con.createStatement();

                        String location_name = jTable1.getValueAt(i, 1).toString();
                        String date_time = jTable1.getValueAt(i, 4).toString();

                        statement.executeUpdate("UPDATE DataPoint SET Accepted = FALSE WHERE DLocationName = '" + location_name + "' and DateTime = '" + date_time + "';");

                    }
                }
            }
            Refresh();
            con.close();

        } catch(Exception e2) {
            System.err.println("Exception: " + e2.getMessage());
        }

    }//GEN-LAST:event_rejectActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        DefaultTableModel model1;
        model1 = (DefaultTableModel) jTable1.getModel();
        
        int row = jTable1.getRowCount();
        int column = jTable1.getColumnCount();
        
        
        Connection con = null;
    try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");            
          
        
        for(int i = 0; i < row; i++) {
            if (jTable1.getValueAt(i, 0) != null) {
                if (((Boolean) jTable1.getValueAt(i, 0)).booleanValue()) {
                    jTable1.setValueAt(true, i, 0);
                    
                    //if(!con.isClosed())
                        //System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");

                        Statement statement = con.createStatement();
                                      
                                                         
                        String location_name = jTable1.getValueAt(i, 1).toString();
                        String date_time = jTable1.getValueAt(i, 4).toString();
                    
                        statement.executeUpdate("UPDATE DataPoint SET Accepted = TRUE WHERE DLocationName = '" + location_name + "' and DateTime = '" + date_time + "';"); 

                } 
            }
        }
        Refresh();
        con.close();

        } catch(Exception e2) {
            System.err.println("Exception: " + e2.getMessage());
        }
        
        
    }//GEN-LAST:event_acceptActionPerformed

    
    
    // To remove the lines that has been accepted or rejected and to update the table
   private void Refresh() {
        Connection con = null;
                DefaultTableModel model2;
                model2 = (DefaultTableModel) jTable1.getModel();
                int rowCount = model2.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    model2.removeRow(i);
                }
                
                JCheckBox checkBox = new javax.swing.JCheckBox();
                try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
                    if(!con.isClosed())
                        System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");

                    Statement statement = con.createStatement();
                    ResultSet result = statement.executeQuery("SELECT * FROM DataPoint WHERE Accepted IS NULL;");                   
                                                         
                    while(result.next()){
                        model2.addRow(new Object[]{null,result.getString(4),result.getString(5),Integer.parseInt(result.getString(3)),result.getString(2)});
                       
                    }
                    jTable1.getColumn("Selected").setCellEditor(new DefaultCellEditor(checkBox));
                    Sort(model2);
                   

                    con.close();

                } catch(Exception e2) {
                    System.err.println("Exception: " + e2.getMessage());
                }       
          
    }
   
   
   private void Sort(DefaultTableModel model){
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel> (model);
    jTable1.setRowSorter(sorter);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane pendingTable;
    private javax.swing.JButton reject;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}