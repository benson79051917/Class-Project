/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package window;

import javax.swing.DefaultListModel;

/**
 *
 * @author Teacher
 */
public class Win13_money extends javax.swing.JFrame {

    public DefaultListModel myModel;

    public Win13_money() {
        myModel = new DefaultListModel();
        initComponents();
txtmoney.setEditable(false);
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
        txtmoney = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>(myModel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("total");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 55, 48, 17);

        jLabel2.setText("apend");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 108, 37, 17);

        jLabel3.setText("money");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 173, 39, 17);

        txttotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttotalFocusGained(evt);
            }
        });
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal);
        txttotal.setBounds(74, 55, 111, 35);

        txtspend.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtspendFocusGained(evt);
            }
        });
        txtspend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspendActionPerformed(evt);
            }
        });
        getContentPane().add(txtspend);
        txtspend.setBounds(75, 108, 110, 37);
        getContentPane().add(txtmoney);
        txtmoney.setBounds(77, 163, 108, 38);

        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear);
        btnclear.setBounds(407, 14, 72, 23);

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(274, 55, 205, 247);

        setSize(new java.awt.Dimension(564, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtspendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspendActionPerformed
        int total, spend, money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

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
        
        
        
        
    }//GEN-LAST:event_txtspendActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        txtspend.requestFocus();
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        myModel.clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txttotal.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txttotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttotalFocusGained
        txttotal.selectAll();
    }//GEN-LAST:event_txttotalFocusGained

    private void txtspendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtspendFocusGained
         txtspend.selectAll();
    }//GEN-LAST:event_txtspendFocusGained

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
