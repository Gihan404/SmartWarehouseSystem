/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controler.DBManager.userRole;
import Controler.DBManager;
import Model.Client;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gihan
 */
public class ViewAllClients extends javax.swing.JFrame {

    /**
     * Creates new form CloseJob
     */
    DefaultTableModel model;

    public ViewAllClients() {
        initComponents();

        loadTableData();

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
        lblFrameName = new javax.swing.JLabel();
        lblHeadBanner = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lblBackButtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJob = new javax.swing.JTable();
        butnHome = new javax.swing.JLabel();
        lblHom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrameName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFrameName.setForeground(new java.awt.Color(255, 255, 255));
        lblFrameName.setText("View All Clients");
        jPanel1.add(lblFrameName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 370, 40));

        lblHeadBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main-pic.jpg"))); // NOI18N
        jPanel1.add(lblHeadBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 40, 1370, 110));

        panelHeader.setBackground(new java.awt.Color(255, 255, 255));
        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackButtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-butn-small.png"))); // NOI18N
        lblBackButtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackButtnMousePressed(evt);
            }
        });
        panelHeader.add(lblBackButtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 40, 40));

        jPanel1.add(panelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 40));

        tblJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client Code", "Company ", "Address", "Contact No", "First Name", "Last Name", "Mobile", "Register By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJob.setRowHeight(20);
        tblJob.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblJob.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblJob);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 970, 250));

        butnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        butnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-butn.png"))); // NOI18N
        butnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                butnHomeMousePressed(evt);
            }
        });
        jPanel1.add(butnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 70, 70));

        lblHom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblHom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHom.setText("Home");
        jPanel1.add(lblHom, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wave-back2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1010, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackButtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackButtnMousePressed

        this.setAlwaysOnTop(false);
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Warning", JOptionPane.YES_NO_OPTION) == 0) {

            this.dispose();
        }
    }//GEN-LAST:event_lblBackButtnMousePressed

    private void butnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butnHomeMousePressed

        this.setAlwaysOnTop(false);
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want go to home ?", "Message", JOptionPane.YES_NO_OPTION) == 0) {
            Home home = new Home(userRole);
            home.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_butnHomeMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewAllClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel butnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackButtn;
    private javax.swing.JLabel lblFrameName;
    private javax.swing.JLabel lblHeadBanner;
    private javax.swing.JLabel lblHom;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblJob;
    // End of variables declaration//GEN-END:variables

    private void loadTableData() {

        DBManager dbManager = new DBManager();

        ArrayList<Client> clientList = new ArrayList<Client>();

        clientList = dbManager.getAllClients();

        model = (DefaultTableModel) tblJob.getModel();

        model.setRowCount(0);

        for (int i = 0; i < clientList.size(); i++) {
            Client get = clientList.get(i);

            Object row[] = new Object[8];
            row[0] = get.getClientCode();
            row[1] = get.getClientName();
            row[2] = get.getNo() + " " + get.getStreet() + " " + get.getCity();
            row[3] = get.getContactNo();
            row[4] = get.getFirstName();
            row[5] = get.getLastName();
            row[6] = get.getMobileNo();
            row[7] = get.getRegisterPerson();

            model.addRow(row);

        }
    }
}