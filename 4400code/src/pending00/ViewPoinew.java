/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pending00;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DateFormatter;
import javax.swing.text.DefaultFormatterFactory;

/**
 *
 * @author zhangyongzheng
 */
public class ViewPoinew extends javax.swing.JPanel {

    /**
     * Creates new form ViewPoinew
     */
    public ViewPoinew() {
        initComponents();
        this.setLayout(new FlowLayout());
        
        LocationNameComboBox.addItem("");
         
        Connection con1 = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con1 = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            String LN = "SELECT DISTINCT(LocationName) FROM POI";
            if(!con1.isClosed())
                System.out.println("Successfully connected to " +
                                "MySQL server using TCP/IP...");
            
            ArrayList ln = new ArrayList();
            Statement stam1 = con1.createStatement();
            ResultSet res = stam1.executeQuery(LN);
            
            while(res.next()){
                boolean exists = false;
                for(int index = 0; index < LocationNameComboBox.getItemCount()&&!exists;index++){
                    if(res.getString("LocationName").equals(LocationNameComboBox.getItemAt(index))){
                        exists = true;
                    }
                }
                if(!exists){
                    LocationNameComboBox.addItem(res.getString("LocationName"));
                }
            }
        
        }catch(Exception e1){
            System.err.println(e1.getMessage());
                    }finally{
            try {
                if(con1 != null)
                    con1.close();
            } catch(SQLException e) {}
        }
        CityComboBox.addItem("");
        
        Connection con2 = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con2 = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            String PC = "SELECT DISTINCT(PCity) FROM POI";
            if(!con2.isClosed())
                System.out.println("Successfully connected to " +
                                "MySQL server using TCP/IP...");
            
            ArrayList ln = new ArrayList();
            Statement stam1 = con2.createStatement();
            ResultSet res = stam1.executeQuery(PC);
            
            while(res.next()){
                boolean exists = false;
                for(int index = 0; index < CityComboBox.getItemCount()&&!exists;index++){
                    if(res.getString("PCity").equals(CityComboBox.getItemAt(index))){
                        exists = true;
                    }
                }
                if(!exists){
                    CityComboBox.addItem(res.getString("PCity"));
                }
            }
        
        }catch(Exception e2){
            System.err.println(e2.getMessage());
                    }finally{
            try {
                if(con2 != null)
                    con2.close();
            } catch(SQLException e) {}
        }
        
        
        StateComboBox.addItem("");

        
        Connection con3 = null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con3 = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            String PS = "SELECT DISTINCT(PState) FROM POI";
            if(!con3.isClosed())
                System.out.println("Successfully connected to " +
                                "MySQL server using TCP/IP...");
            
            ArrayList ln = new ArrayList();
            Statement stam1 = con3.createStatement();
            ResultSet res = stam1.executeQuery(PS);
            
            while(res.next()){
                boolean exists = false;
                for(int index = 0; index < StateComboBox.getItemCount()&&!exists;index++){
                    if(res.getString("PState").equals(StateComboBox.getItemAt(index))){
                        exists = true;
                    }
                }
                if(!exists){
                    StateComboBox.addItem(res.getString("PState"));
                }
            }
        
        }catch(Exception e3){
            System.err.println(e3.getMessage());
                    }finally{
            try {
                if(con3 != null)
                    con3.close();
            } catch(SQLException e) {}
        }
        
        DateFormatter df = new DateFormatter(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        DefaultFormatterFactory factory = new DefaultFormatterFactory();
        factory.setDefaultFormatter(df);
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
        ViewPOILabel = new javax.swing.JLabel();
        POILocationNameLabel = new javax.swing.JLabel();
        LocationNameComboBox = new javax.swing.JComboBox<>();
        CityLabel = new javax.swing.JLabel();
        CityComboBox = new javax.swing.JComboBox<>();
        StateLabel = new javax.swing.JLabel();
        StateComboBox = new javax.swing.JComboBox<>();
        ZipcodeLabel = new javax.swing.JLabel();
        ZipcodeTextField = new javax.swing.JTextField();
        FlaggedLabel = new javax.swing.JLabel();
        FlagCheckBox = new javax.swing.JCheckBox();
        DateFlaggedLabel = new javax.swing.JLabel();
        ApplyFilterButton = new javax.swing.JButton();
        ResetFilterButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        POIReportTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        ToLabel = new javax.swing.JLabel();
        date1Choose1Combo = new datechooser.beans.DateChooserCombo();
        date2ChooserCombo = new datechooser.beans.DateChooserCombo();

        ViewPOILabel.setFont(new java.awt.Font("Ayuthaya", 0, 18)); // NOI18N
        ViewPOILabel.setText("View POI");

        POILocationNameLabel.setText("POI Location Name");

        LocationNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationNameComboBoxActionPerformed(evt);
            }
        });

        CityLabel.setText("City");

        CityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityComboBoxActionPerformed(evt);
            }
        });

        StateLabel.setText("State");

        StateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateComboBoxActionPerformed(evt);
            }
        });

        ZipcodeLabel.setText("Zipcode");

        FlaggedLabel.setText("Flagged?");

        FlagCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlagCheckBoxActionPerformed(evt);
            }
        });

        DateFlaggedLabel.setText("Date Flagged");

        ApplyFilterButton.setText("Apply Filter");
        ApplyFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyFilterButtonActionPerformed(evt);
            }
        });

        ResetFilterButton.setText("Reset Filter");
        ResetFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetFilterButtonActionPerformed(evt);
            }
        });

        POIReportTable.setFont(new java.awt.Font("Ayuthaya", 0, 12)); // NOI18N
        POIReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Location Name", "City", "State", "Zip Code", "Flagged?", "Date Flagged"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        POIReportTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POIReportTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(POIReportTable);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ToLabel.setText("To");

        date1Choose1Combo.setCalendarPreferredSize(new java.awt.Dimension(400, 180));
        try {
            date1Choose1Combo.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        date1Choose1Combo.setMaxDate(date2ChooserCombo.getMinDate());

        date2ChooserCombo.setCalendarPreferredSize(new java.awt.Dimension(400, 180));
        try {
            date2ChooserCombo.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        date2ChooserCombo.setMinDate(date1Choose1Combo.getMaxDate());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(371, 371, 371))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(ViewPOILabel)
                                .addGap(348, 348, 348))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateFlaggedLabel)
                            .addComponent(FlaggedLabel)
                            .addComponent(ZipcodeLabel)
                            .addComponent(POILocationNameLabel)
                            .addComponent(CityLabel)
                            .addComponent(StateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LocationNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(FlagCheckBox)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(date1Choose1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(ToLabel)
                                            .addGap(41, 41, 41)
                                            .addComponent(date2ChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(ApplyFilterButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(ResetFilterButton)))
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ViewPOILabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(POILocationNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StateLabel))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ZipcodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FlagCheckBox)
                            .addComponent(FlaggedLabel))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateFlaggedLabel)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(date1Choose1Combo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(date2ChooserCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ToLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApplyFilterButton)
                            .addComponent(ResetFilterButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CityLabel))
                        .addContainerGap(438, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        ChooseFunctionallynew cfy = new ChooseFunctionallynew();
        this.add(cfy);
        validate();
        repaint();

    }//GEN-LAST:event_BackButtonActionPerformed

    private void ResetFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetFilterButtonActionPerformed
        // TODO add your handling code here:
        LocationNameComboBox.setSelectedIndex(0);
        CityComboBox.setSelectedIndex(0);
        StateComboBox.setSelectedIndex(0);
        ZipcodeTextField.setText("");
        FlagCheckBox.setSelected(false);
        date1Choose1Combo.setCurrent(null);
        date2ChooserCombo.setCurrent(null);
        Connection con = null;
        DefaultTableModel model2;
        model2 = (DefaultTableModel) POIReportTable.getModel();
        int rowCount = model2.getRowCount();
        for (int i = rowCount-1; i >= 0; i--) {
                model2.removeRow(i);
            }
        
    }//GEN-LAST:event_ResetFilterButtonActionPerformed

    private void ApplyFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyFilterButtonActionPerformed
        // TODO add your handling code here:
        
        boolean flag;

        DefaultTableModel dtm = (DefaultTableModel)POIReportTable.getModel();
        

        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            //System.out.println("hello");
            if(!con.isClosed())
            System.out.println("Successfully connected to " +
                "MySQL server using TCP/IP...");
            if(FlagCheckBox.isSelected() == true)
            flag = true;
            else
            flag = false;
            String sql = "SELECT LocationName, PCity, PState, Zipcode, Flag, DateFlaged FROM POI WHERE Flag = " + flag + " ";
            
            System.out.println(sql);
            if(LocationNameComboBox.getSelectedItem().equals("")){
                sql = sql;
                System.out.println("11");
            }
            else{
                String locationname = (String) LocationNameComboBox.getSelectedItem();
                sql = sql + "AND LocationName = '" + locationname + "' ";
                
            }
            System.out.println("1");
            if(CityComboBox.getSelectedItem().equals("")){
                sql = sql;
            }
            else{
                String city = (String) CityComboBox.getSelectedItem();
                sql = sql + "AND PCity = '" + city +"' ";
            }
            System.out.println("2");
            if(StateComboBox.getSelectedItem().equals("")){
                sql = sql;
                System.out.println("22222222222");
            }
            else{
                String state = (String) StateComboBox.getSelectedItem();
                sql = sql + "AND PState = '"+ state + "' ";
                System.out.println("22");
            }
            System.out.println("3");
            if(ZipcodeTextField.getText().trim().equals("")){
                sql = sql;
            }
            else{
                int zipcode = Integer.parseInt(ZipcodeTextField.getText());
                sql = sql + "AND Zipcode ="+ zipcode + "";
            }
            System.out.println("4");
            
            String date1;
            date1 = date1Choose1Combo.getText();
            if(date1.equals("")){
                sql = sql;
            }
            else{
            java.util.Date actualldate1 = null;
            SimpleDateFormat yy = new SimpleDateFormat( "MM/dd/yy" );
            SimpleDateFormat yyyy = new SimpleDateFormat( "yyyy-MM-dd" );
            actualldate1 =  (java.util.Date) yy.parse(date1);
            String startdate = yyyy.format(actualldate1);
            sql = sql + " AND  DateFlaged > '"+ startdate +"'";
            }
            
            System.out.println("5");
            
            String date2;
            date2 = date2ChooserCombo.getText();
            if(date2.equals("")){
                sql =sql;
            }
            else{
            java.util.Date actualldate2 = null;
            SimpleDateFormat yy2 = new SimpleDateFormat( "MM/dd/yy" );
            SimpleDateFormat yyyy2 = new SimpleDateFormat( "yyyy-MM-dd" );
            actualldate2 =  (java.util.Date) yy2.parse(date2);
            String enddate = yyyy2.format(actualldate2);
            sql = sql + "AND DateFlaged <'"+ enddate+"'";
            }
            
            
            
            System.out.println("77777777");
            sql = sql + ";";
            
            
            Statement stam = con.createStatement();
            

            System.out.println(sql);
            ResultSet res = stam.executeQuery(sql);
            //dtm.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),flag(res.getString(5)),res.getString(6)});
            while(res.next()){
                
                dtm.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),flag(res.getString(5)),res.getString(6)});
            }
            //System.out.println(res.getString(1));
            //}
            ResultSet res3 = stam.executeQuery(sql);
            /*if(!res3.next()){
                NoPoiResult nores = new NoPoiResult();
                JFrame frame = new JFrame("Sorry!");
                frame.setContentPane(nores.jPanel1);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.pack();
                frame.setVisible(true);
            }*/
            Refresh();
            
        }catch(Exception e4){
            System.err.println(e4.getMessage());
        }finally{
            try {
                if(con != null)
                    con.close();
            } catch(SQLException e) {}
        }
    }//GEN-LAST:event_ApplyFilterButtonActionPerformed
    private void Refresh(){
        Connection con = null;
            DefaultTableModel model2;
            model2 = (DefaultTableModel) POIReportTable.getModel();
            int rowCount = model2.getRowCount();
            for (int i = rowCount-1; i >= 0; i--) {
                model2.removeRow(i);
            }
        boolean flag;

        String date1,date2;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
            //System.out.println("hello");
            if(!con.isClosed())
            System.out.println("Successfully connected to " +
                "MySQL server using TCP/IP...");
            if(FlagCheckBox.isSelected() == true)
            flag = true;
            else
            flag = false;
            String sql = "SELECT LocationName, PCity, PState, Zipcode, Flag, DateFlaged FROM POI WHERE Flag = " + flag + " ";
            /*DateFormat fmt = new SimpleDateFormat("MM/dd/yy");
            Date datestart = (Date) fmt.parse(date1);
            Date dateend = (Date) fmt.parse(date2);

            System.out.println("123456");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            String datestart1 = sdf.format(datestart);
            String dateend2 = sdf.format(dateend);*/
            System.out.println(sql);
            if(LocationNameComboBox.getSelectedItem().equals("")){
                sql = sql;
                System.out.println("11");
            }
            else{
                String locationname = (String) LocationNameComboBox.getSelectedItem();
                sql = sql + "AND LocationName = '" + locationname + "' ";
                
            }
            System.out.println("1");
            if(CityComboBox.getSelectedItem().equals("")){
                sql = sql;
            }
            else{
                String city = (String) CityComboBox.getSelectedItem();
                sql = sql + "AND PCity = '" + city +"' ";
            }
            System.out.println("2");
            if(StateComboBox.getSelectedItem().equals("")){
                sql = sql;
                System.out.println("22222222222");
            }
            else{
                String state = (String) StateComboBox.getSelectedItem();
                sql = sql + "AND PState = '"+ state + "' ";
                System.out.println("22");
            }
            System.out.println("3");
            if(ZipcodeTextField.getText().trim().equals("")){
                sql = sql;
            }
            else{
                int zipcode = Integer.parseInt(ZipcodeTextField.getText());
                sql = sql + "AND Zipcode ="+ zipcode + "";
            }
            System.out.println("4");
            /*if(date1Choose1Combo.equals("")){
                sql = sql;
                System.out.println("66666666");
            }
            else{
                String data1;
                date1 = date1Choose1Combo.getText();
                java.util.Date actualldate1 = null;
                SimpleDateFormat yy = new SimpleDateFormat( "MM/dd/yy" );
                SimpleDateFormat yyyy = new SimpleDateFormat( "yyyy-MM-dd" );
                actualldate1 =  (java.util.Date) yy.parse(date1);
                String startdate = yyyy.format(actualldate1);
                sql = sql + " AND  DateFlaged > '"+ startdate +"'";
            }*/
            String date11;
            date11 = date1Choose1Combo.getText();
            if(date11.equals("")){
                sql = sql;
            }
            else{
            java.util.Date actualldate1 = null;
            SimpleDateFormat yy = new SimpleDateFormat( "MM/dd/yy" );
            SimpleDateFormat yyyy = new SimpleDateFormat( "yyyy-MM-dd" );
            actualldate1 =  (java.util.Date) yy.parse(date11);
            String startdate = yyyy.format(actualldate1);
            sql = sql + " AND  DateFlaged > '"+ startdate +"'";
            }
            
            
            System.out.println("5");
            /*if(date2ChooserCombo.equals(null)){
                sql = sql;
                System.out.println("77777777");
            }
            else{
                String data2;
                date2 = date2ChooserCombo.getText();
                java.util.Date actualldate2 = null;
                SimpleDateFormat yy = new SimpleDateFormat( "MM/dd/yy" );
                SimpleDateFormat yyyy = new SimpleDateFormat( "yyyy-MM-dd" );
                actualldate2 =  (java.util.Date) yy.parse(date2);
                String enddate = yyyy.format(actualldate2);
                sql = sql + "AND DateFlaged <'"+ enddate+"'";
            }*/
            String date22;
            date22 = date2ChooserCombo.getText();
            if(date22.equals("")){
                sql =sql;
            }
            else{
            java.util.Date actualldate2 = null;
            SimpleDateFormat yy2 = new SimpleDateFormat( "MM/dd/yy" );
            SimpleDateFormat yyyy2 = new SimpleDateFormat( "yyyy-MM-dd" );
            actualldate2 =  (java.util.Date) yy2.parse(date22);
            String enddate = yyyy2.format(actualldate2);
            sql = sql + "AND DateFlaged <'"+ enddate+"'";
            }
            
            
            
            
            System.out.println("77777777");
            sql = sql + ";";
            
            //String SQL2 = "SELECT LocationName from POI where Location = " + locationname ;
            Statement stam = con.createStatement();
            //System.out.println("233333333777");
            //String SQL1 = "SELECT LocationName, PCity, PState, Zipcode, Flag, DateFlaged from POI where LocationName = '" + locationname + "'AND PCity = '" + city +"'AND PState = '"+ state + "'AND Zipcode ="+ zipcode + " AND Flag = "+flag+" AND  DateFlaged > '"+ startdate +"'AND DateFlaged <'"+ enddate+"';";
           
            //String SQL2 = "SELECT LocationName FROM POI where Zipcode = '" +  zipcode  +"';";

            System.out.println(sql);
            ResultSet res = stam.executeQuery(sql);
            
            
            
            
            while(res.next()){
                model2.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),flag(res.getString(5)),res.getString(6)});
            }
            ResultSet res2 = stam.executeQuery(sql);
            if(!res2.next()){
                NoPoiResult nores = new NoPoiResult();
                        JFrame frame = new JFrame("Sorry!");
                        frame.setContentPane(nores.jPanel1);
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        frame.pack();
                        frame.setVisible(true);
            }
            
            
        }catch(Exception e4){
            System.err.println(e4.getMessage());
        }finally{
            try {
                if(con != null)
                    con.close();
            } catch(SQLException e) {}
        }
    }
    private void FlagCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlagCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlagCheckBoxActionPerformed

    private void CityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityComboBoxActionPerformed

    private void LocationNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationNameComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationNameComboBoxActionPerformed

    private void StateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateComboBoxActionPerformed
        // TODO add your handling code here:
//        CityComboBox.removeAllItems();
//        String state = (String) StateComboBox.getSelectedItem();
//        filtercity(state);
//        System.out.println(state);
    }//GEN-LAST:event_StateComboBoxActionPerformed

    private void POIReportTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POIReportTableMouseClicked
        // TODO add your handling code here:
        int index = POIReportTable.getSelectedRow();
        TableModel model22 = POIReportTable.getModel();
        
        this.removeAll();
        DataTypenew dtn = new DataTypenew();
        this.add(dtn);
        validate();
        repaint();

        Connection con = null;
        Statement mystat = null;
        ResultSet myrs = null;
        String location = model22.getValueAt(index,0).toString();
        String state = "select Distinct DType from DataPoint where DLocationName = '"+location+"';";
        boolean flagggg;
        if(FlagCheckBox.isSelected() == true){
        flagggg = true;
        dtn.flagimage.setVisible(flagggg);}
        else{
        flagggg = false;
         dtn.flagimage.setVisible(flagggg);}
        dtn.location_name.setText(model22.getValueAt(index,0).toString());
        dtn.flaggggCheckBox.setSelected(flagggg);
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32",
                "cs4400_32","cSPtL15a");
            if(!con.isClosed())
            System.out.println("Successfully connected to " +"MySQL server using TCP/IP...");
            mystat = con.createStatement();
            myrs = mystat.executeQuery(state);
            while(myrs.next()){
                String dataresult= myrs.getString("DType");
                dtn.typebox.addItem(dataresult);
                System.out.println(dataresult);
            }
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if(con != null)
                con.close();
            } catch(SQLException e) {}
        }
        
        
    }//GEN-LAST:event_POIReportTableMouseClicked
    public String flag(String a){
        int flag;
        flag = Integer.parseInt(a);
        
        if(flag == 0)
            return "Not Flaged";
        else 
            return "Flaged";
    }
//    private void filtercity(String state){
//        Connection con1 = null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con1 = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_32","cs4400_32","cSPtL15a");
//            //System.out.println("hello");
//            if(!con1.isClosed())
//            System.out.println("Successfully connected to " +
//                "MySQL server using TCP/IP...");
//            Statement stmt = con1.createStatement();
//            String SQL1 = "SELECT City FROM CityState Where State = '" + state +"';";
//            ResultSet rs = stmt.executeQuery(SQL1);
//            CityComboBox.addItem("");
//            while(rs.next()){
//                CityComboBox.addItem(rs.getString("City"));
//            }
//            con1.close();
//        }catch(Exception e2){
//            System.err.println(e2.getMessage());
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyFilterButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> CityComboBox;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JLabel DateFlaggedLabel;
    private javax.swing.JCheckBox FlagCheckBox;
    private javax.swing.JLabel FlaggedLabel;
    private javax.swing.JComboBox<String> LocationNameComboBox;
    private javax.swing.JLabel POILocationNameLabel;
    private javax.swing.JTable POIReportTable;
    private javax.swing.JButton ResetFilterButton;
    private javax.swing.JComboBox<String> StateComboBox;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JLabel ViewPOILabel;
    private javax.swing.JLabel ZipcodeLabel;
    private javax.swing.JTextField ZipcodeTextField;
    private datechooser.beans.DateChooserCombo date1Choose1Combo;
    private datechooser.beans.DateChooserCombo date2ChooserCombo;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
