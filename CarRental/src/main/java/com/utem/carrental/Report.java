/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.carrental;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.text.*;
import java.awt.Color;
import javax.swing.UIManager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Series;
import org.jfree.data.xy.XYSeries;
/**
 *
 * @author User
 */
public class Report extends javax.swing.JFrame {
    private Connection carCon = new Connection();
    private Connection customerCon = new Connection();
    private Connection orderCon = new Connection();
    private Connection returnCon = new Connection();
    private Connection reportCon = new Connection();
    
    // declare object for class Car to set and get values of Item
    private Car car;
    
    private static ArrayList <Car> carList;
    
    // declare object for class Customer to set and get values of Item
    private Customer customer;
    
    private static ArrayList <Customer> customerList;
    
    // declare object for class Order to set and get values of Item
    private Order order;
    
    private static ArrayList <Order> orderList;
    
    // declare object for class ReturnC to set and get values of Item
    private ReturnC returnC;
    
    private static ArrayList <ReturnC> returnCList;
    
    // declare object for class ReturnC to set and get values of Item
    private Report report;
    
    private static ArrayList <Report> reportList;
    
    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
        // Call method readAll() to fetch all data from database
        carList = carCon.readAllCar();
        
        Object rowData[] = new Object[5];
        
        // use repetition structure to read all item attributes of the ArrayList
        // and display the data in the table according to the columns and row
        for(Car x:carList){
            comboBoxCarName.addItem(x.getName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LblTotal = new javax.swing.JLabel();
        LblTo = new javax.swing.JLabel();
        LblCarName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        LblFrom = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblGrandTotal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LblFine = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("SALES REPORT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_icon.jpeg"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 40, 50, 50));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-process-34.png"))); // NOI18N
        btnSearch.setText("Process");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 120, 50));

        sumTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "Register ID", "Book Date", "Return Date", "Total", "Fine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sumTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 900, 450));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("From :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 80, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Car Name :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 80, -1));
        getContentPane().add(TxtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 200, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("To :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 80, -1));
        getContentPane().add(TxtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 200, 30));

        LblTotal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblTotal.setText("00.00");
        getContentPane().add(LblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 340, 60, 30));

        LblTo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblTo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, 130, 50));

        LblCarName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblCarName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LblCarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 270, 190, 50));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("Car Name:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, -1, 30));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 51));
        jLabel20.setText("Total: ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, -1, 30));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 51));
        jLabel21.setText("From: ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, -1, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 51));
        jLabel22.setText("To:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 580, -1, 30));

        LblFrom.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblFrom.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(LblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 510, 120, 50));

        getContentPane().add(comboBoxCarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 200, 30));

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eraser-34.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 110, 50));

        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 200, 20));

        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, 20));

        LblGrandTotal.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblGrandTotal.setForeground(new java.awt.Color(255, 255, 255));
        LblGrandTotal.setText("00.00");
        getContentPane().add(LblGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 460, 60, 30));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 51));
        jLabel23.setText("Total (Inc fine): ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, -1, 30));

        LblFine.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LblFine.setForeground(new java.awt.Color(255, 255, 255));
        LblFine.setText("00.00");
        getContentPane().add(LblFine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 400, 60, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 51));
        jLabel24.setText("Fine:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 400, -1, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 460, -1, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 400, -1, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 340, 40, 30));

        backgroundLabel.setForeground(new java.awt.Color(255, 102, 0));
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgok.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 1300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Close form and reset table
        DefaultTableModel tableContent = (DefaultTableModel) sumTable.getModel();
        tableContent.setRowCount(0);
        comboBoxCarName.setSelectedItem(null);
        TxtFrom.setCalendar(null);
        TxtTo.setCalendar(null);
        LblCarName.setText("");
        LblTotal.setText("");
        LblFrom.setText("");
        LblTo.setText("");
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = df.format(TxtFrom.getDate());
            String date2 = df.format(TxtTo.getDate());
            String name = String.valueOf(comboBoxCarName.getSelectedItem());
            // Check wether the form are completed or empty
            if (!date1.equals("") && !date2.equals("")) {
                reportCon.readReport2Date(name, date1, date2);
                
                double total = 0;
                for (int i = 0, rows = sumTable.getRowCount(); i < rows; i++) {
                    double totalBasic = Double.valueOf(sumTable.getValueAt(i, 4).toString());
                    total += totalBasic;
                }
                double fine = 0;
                for (int i = 0, rows = sumTable.getRowCount(); i < rows; i++) {
                    double fineBasic = Double.valueOf(sumTable.getValueAt(i, 5).toString());
                    fine += fineBasic;
                }
                double grandTotal = 0;
                for (int i = 0, rows = sumTable.getRowCount(); i < rows; i++) {
                    double totalFine = Double.valueOf(sumTable.getValueAt(i, 4).toString()) + Double.valueOf(sumTable.getValueAt(i, 5).toString());
                    grandTotal += totalFine;
                }

                LblCarName.setText(String.valueOf(comboBoxCarName.getSelectedItem()));
                LblTotal.setText(Double.toString(total).trim());
                LblFine.setText(Double.toString(fine).trim());
                LblGrandTotal.setText(Double.toString(grandTotal).trim());
                LblFrom.setText(date1);
                LblTo.setText(date2);
            } else if (date1.equals("") && date2.equals("")) {
                jLabel5.setText("From date are an empty!!!");
                jLabel4.setText("To date are an empty!!!");
            } else if (date1.equals("")) {
                jLabel5.setText("From date are an empty!!!");
            } else if (date2.equals("")) {
                jLabel4.setText("To date are an empty!!!");
            } else {
                //validateAll.setText("Price's field is empty!");
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        DefaultTableModel tableContent = (DefaultTableModel) sumTable.getModel();
        tableContent.setRowCount(0);
        comboBoxCarName.setSelectedItem(null);
        TxtFrom.setCalendar(null);
        TxtTo.setCalendar(null);
        LblCarName.setText("");
        LblTotal.setText("");
        LblFine.setText("");
        LblGrandTotal.setText("");
        LblFrom.setText("");
        LblTo.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LblCarName;
    public static javax.swing.JLabel LblFine;
    private javax.swing.JLabel LblFrom;
    public static javax.swing.JLabel LblGrandTotal;
    private javax.swing.JLabel LblTo;
    public static javax.swing.JLabel LblTotal;
    public static final com.toedter.calendar.JDateChooser TxtFrom = new com.toedter.calendar.JDateChooser();
    public static final com.toedter.calendar.JDateChooser TxtTo = new com.toedter.calendar.JDateChooser();
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    public static final javax.swing.JComboBox<String> comboBoxCarName = new javax.swing.JComboBox<>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTable sumTable = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
