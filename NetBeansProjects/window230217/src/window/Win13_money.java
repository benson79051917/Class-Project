/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package window;

import javax.swing.DefaultListModel;

/**
 *
 * @author student
 */
public class Win13_money extends javax.swing.JFrame {

    public DefaultListModel myModel;

    public Win13_money() {
        myModel = new DefaultListModel();
        
        initComponents();
        txtmoney.setEditable(false);
        txttotal.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtspend = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>(myModel);
        btnclear = new javax.swing.JButton();
        txtmoney = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("total");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(96, 100, 50, 17);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("spend");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 150, 70, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("money");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(79, 207, 70, 30);

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal);
        txttotal.setBounds(184, 90, 90, 30);

        txtspend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspendActionPerformed(evt);
            }
        });
        getContentPane().add(txtspend);
        txtspend.setBounds(184, 143, 90, 30);

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 80, 180, 190);

        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear);
        btnclear.setBounds(390, 30, 72, 23);

        txtmoney.setBackground(new java.awt.Color(255, 102, 102));
        getContentPane().add(txtmoney);
        txtmoney.setBounds(186, 213, 90, 30);

        setSize(new java.awt.Dimension(616, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtspendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspendActionPerformed
        int total, spend, money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;
        myModel.clear();
        total = Integer.parseInt(txttotal.getText());
        spend = Integer.parseInt(txtspend.getText());
        money = total - spend;
        txtmoney.setText(String.valueOf(money));

        m100 = money / 100;
        m50 = (money % 100) / 50;
        m10 = (money % 50) / 10;
        m5 = (money % 10) / 5;
        m1 = (money % 5) / 1;

        myModel.addElement("100 元 : " + m100);
        myModel.addElement("50 元 : " + m50);
        myModel.addElement("10 元 : " + m10);
        myModel.addElement("5 元 : " + m5);
        myModel.addElement("1 元 : " + m1);
        txttotal.requestFocus();
        txttotal.selectAll();
        
    }//GEN-LAST:event_txtspendActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        txtspend.requestFocus();
        txtspend.selectAll();
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        myModel.clear();
        cleartxt();
        txttotal.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed
    
    private void cleartxt() {
        txttotal.setText("");
        txtspend.setText("");
        txtmoney.setText("");
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txttotal.requestFocus();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Win13_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win13_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win13_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win13_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win13_money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtmoney;
    private javax.swing.JTextField txtspend;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}