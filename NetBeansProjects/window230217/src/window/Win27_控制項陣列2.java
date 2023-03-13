/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package window;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class Win27_控制項陣列2 extends javax.swing.JFrame {

    JTextField[] txt;

    public Win27_控制項陣列2() {
        initComponents();
        txt = new JTextField[]{jTextField1, jTextField2, jTextField3, jTextField4};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                取得焦點(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                文字方塊事件(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 60, 250, 60);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                取得焦點(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                文字方塊事件(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 140, 250, 60);

        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                取得焦點(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                文字方塊事件(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(80, 220, 250, 60);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                取得焦點(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                文字方塊事件(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(80, 300, 250, 60);

        setSize(new java.awt.Dimension(482, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void 文字方塊事件(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_文字方塊事件
        JTextField tmp = (JTextField) evt.getSource();

        for (int i = 0; i < txt.length; i++) {
            if (tmp == txt[i]) {
                if (txt[i].getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "不可空白");
                    return;
                }
                if(i < txt.length - 1){
                    txt[i+1].requestFocus();
                }
               
            }
        }

    }//GEN-LAST:event_文字方塊事件

    private void 取得焦點(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_取得焦點
        JTextField tmp = (JTextField) evt.getSource();

        for (int i = 0; i < txt.length; i++) {
            if (tmp == txt[i]) {
                txt[i].setBackground(Color.YELLOW);
            } else {
                txt[i].setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_取得焦點

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
            java.util.logging.Logger.getLogger(Win27_控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Win27_控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Win27_控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Win27_控制項陣列2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win27_控制項陣列2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
