/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;

/**
 *
 * @author ZISAN
 */
public class FirstFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstFrame
     */
    public FirstFrame() {
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

        Field1 = new javax.swing.JTextField();
        Field2 = new javax.swing.JTextField();
        sum = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        div = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Abc = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field1ActionPerformed(evt);
            }
        });
        getContentPane().add(Field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 36, 75, 42));

        Field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field2ActionPerformed(evt);
            }
        });
        getContentPane().add(Field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 115, 75, 42));

        sum.setBackground(new java.awt.Color(0, 255, 153));
        sum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        getContentPane().add(sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 203, 70, 43));

        minus.setBackground(new java.awt.Color(0, 255, 153));
        minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 203, 70, 43));

        multi.setBackground(new java.awt.Color(51, 255, 153));
        multi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        getContentPane().add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 287, 70, 43));

        div.setBackground(new java.awt.Color(0, 255, 153));
        div.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        getContentPane().add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 287, 70, 43));

        Abc.setColumns(20);
        Abc.setRows(5);
        jScrollPane2.setViewportView(Abc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 13, 246, 172));

        jRadioButton1.setText("ON");
        jRadioButton1.setActionCommand("ON");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
        String msg=Abc.getText().toString();
        String XX=Field1.getText().toString();
        String YY=Field2.getText().toString();
        int a=Integer.parseInt(XX);
        int b=Integer.parseInt(YY);
        Abc.setText(msg+"\n"+XX+" - "+YY+" = "+(a-b));
    }//GEN-LAST:event_minusActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        // TODO add your handling code here:
        String msg=Abc.getText().toString();
        String XX=Field1.getText().toString();
        String YY=Field2.getText().toString();
        int a=Integer.parseInt(XX);
        int b=Integer.parseInt(YY);
        Abc.setText(msg+"\n"+XX+" + "+YY+" = "+(a+b));
    }//GEN-LAST:event_sumActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        // TODO add your handling code here:
        String msg=Abc.getText().toString();
        String XX=Field1.getText().toString();
        String YY=Field2.getText().toString();
        int a=Integer.parseInt(XX);
        int b=Integer.parseInt(YY);
        Abc.setText(msg+"\n"+XX+" * "+YY+" = "+(a*b));
    }//GEN-LAST:event_multiActionPerformed

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field2ActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
       
        String XX=Field1.getText().toString();
        String YY=Field2.getText().toString();
        int a=Integer.parseInt(XX);
        int b=Integer.parseInt(YY);
        if(b==0)
        {
            JOptionPane.showMessageDialog(this,"change the value of y");
        }
        else
        {
            String msg = Abc.getText().toString();
            Abc.setText(msg+"\n"+XX+" / "+YY+" = "+(a/b));
        }
    }//GEN-LAST:event_divActionPerformed

    private void Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Calculator is ON");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Calculator is ON");
    }//GEN-LAST:event_jRadioButton1MouseClicked

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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Abc;
    private javax.swing.JTextField Field1;
    private javax.swing.JTextField Field2;
    private javax.swing.JButton div;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton minus;
    private javax.swing.JButton multi;
    private javax.swing.JButton sum;
    // End of variables declaration//GEN-END:variables
}
