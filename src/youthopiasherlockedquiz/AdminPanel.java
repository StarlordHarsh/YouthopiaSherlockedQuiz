/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youthopiasherlockedquiz;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;

/**
 *
 * @author hj101
 */
public class AdminPanel extends javax.swing.JFrame {

    static String pasw = "";
    String pass = "";
    static int i = 0;
    static int indexID = 0;
    static final String corr = "Correct.mp3";
    MP3Player mp3playerCorr = new MP3Player(new File(corr));
    static final String incorr = "Incorrect.mp3";
    MP3Player mp3playerIncorr = new MP3Player(new File(incorr));

    void pin() {
        txt_pin.setText("PIN-" + pasw);

    }

    /**
     * Creates new form PinEntry
     */
    public AdminPanel() {
        setUndecorated(true);
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        initComponents();
        txt_pin.setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Entry = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        No7 = new javax.swing.JButton();
        No9 = new javax.swing.JButton();
        No8 = new javax.swing.JButton();
        No4 = new javax.swing.JButton();
        No5 = new javax.swing.JButton();
        No6 = new javax.swing.JButton();
        No3 = new javax.swing.JButton();
        No1 = new javax.swing.JButton();
        No2 = new javax.swing.JButton();
        No0 = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        txt_Disp = new javax.swing.JLabel();
        txt_pin = new javax.swing.JTextField();
        txt_Ent = new javax.swing.JLabel();
        txt_Err = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel2.setText("jLabel2");

        txt_Entry.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txt_Entry.setText("..");
        txt_Entry.getAccessibleContext().setAccessibleName("kf");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Enter Riddle ID");

        No7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No7.setForeground(new java.awt.Color(0, 204, 0));
        No7.setText("7");
        No7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No7ActionPerformed(evt);
            }
        });

        No9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No9.setForeground(new java.awt.Color(0, 204, 0));
        No9.setText("9");
        No9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No9ActionPerformed(evt);
            }
        });

        No8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No8.setForeground(new java.awt.Color(0, 204, 0));
        No8.setText("8");
        No8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No8ActionPerformed(evt);
            }
        });

        No4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No4.setForeground(new java.awt.Color(0, 204, 0));
        No4.setText("4");
        No4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No4ActionPerformed(evt);
            }
        });

        No5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No5.setForeground(new java.awt.Color(0, 204, 0));
        No5.setText("5");
        No5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No5ActionPerformed(evt);
            }
        });

        No6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No6.setForeground(new java.awt.Color(0, 204, 0));
        No6.setText("6");
        No6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No6ActionPerformed(evt);
            }
        });

        No3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No3.setForeground(new java.awt.Color(0, 204, 0));
        No3.setText("3");
        No3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No3ActionPerformed(evt);
            }
        });

        No1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No1.setForeground(new java.awt.Color(0, 204, 0));
        No1.setText("1");
        No1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No1ActionPerformed(evt);
            }
        });

        No2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No2.setForeground(new java.awt.Color(0, 204, 0));
        No2.setText("2");
        No2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No2ActionPerformed(evt);
            }
        });

        No0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        No0.setForeground(new java.awt.Color(0, 204, 0));
        No0.setText("0");
        No0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No0ActionPerformed(evt);
            }
        });

        Del.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Del.setForeground(new java.awt.Color(247, 32, 32));
        Del.setText("Delete");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 205, 39));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Cancel.setForeground(new java.awt.Color(247, 32, 32));
        Cancel.setText("Clear");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        txt_pin.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txt_pin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Ent.setFont(new java.awt.Font("Tahoma", 0, 29)); // NOI18N

        txt_Err.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txt_Err.setForeground(new java.awt.Color(247, 32, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(No5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txt_Ent))
                            .addComponent(Submit)
                            .addComponent(No0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(No2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(No6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(No3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(No8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(No9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(txt_Err, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Disp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txt_Disp)
                        .addGap(95, 95, 95)
                        .addComponent(txt_Ent)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Err, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(No7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(No8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(No6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(No9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(No5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(No4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(No0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void No7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No7ActionPerformed
        pasw += "7";
        pin();
    }//GEN-LAST:event_No7ActionPerformed

    private void No8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No8ActionPerformed
        pasw += "8";
        pin();
    }//GEN-LAST:event_No8ActionPerformed

    private void No9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No9ActionPerformed
        pasw += "9";
        pin();
    }//GEN-LAST:event_No9ActionPerformed

    private void No4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No4ActionPerformed
        pasw += "4";
        pin();
    }//GEN-LAST:event_No4ActionPerformed

    private void No5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No5ActionPerformed
        pasw += "5";
        pin();
    }//GEN-LAST:event_No5ActionPerformed

    private void No6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No6ActionPerformed
        pasw += "6";
        pin();
    }//GEN-LAST:event_No6ActionPerformed

    private void No1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No1ActionPerformed
        pasw += "1";
        pin();
    }//GEN-LAST:event_No1ActionPerformed

    private void No2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No2ActionPerformed
        pasw += "2";
        pin();
    }//GEN-LAST:event_No2ActionPerformed

    private void No3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No3ActionPerformed
        pasw += "3";
        pin();
    }//GEN-LAST:event_No3ActionPerformed

    private void No0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No0ActionPerformed
        pasw += "0";
        pin();
    }//GEN-LAST:event_No0ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        boolean flag = true;
        indexID = 0;
        boolean flag1 = true;
        while (flag1) {
            try {
                pass = Integer.toString(Riddle.id[indexID]);
            } catch (Exception e) {
                System.out.println("ERROR");
                txt_Err.setText("Wrong Riddle ID");
                txt_pin.setText("");
                pasw = "";
                txt_pin.setForeground(Color.red);
                break;
            }
            if (!pasw.equals(pass)) {
                indexID++;
                flag = false;
            } else {
                flag1 = false;
                flag = true;
            }
        }
        if (flag) {
            pasw = "";
            this.dispose();
            Welcome.main(new String[0]);
        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        StringBuilder str = new StringBuilder(pasw);
        int length = str.length();
        str.deleteCharAt(length - 1);
        pasw = str.toString();
        pin();
    }//GEN-LAST:event_DelActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        pasw = "";
        txt_pin.setText("");
    }//GEN-LAST:event_CancelActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Del;
    private javax.swing.JButton No0;
    private javax.swing.JButton No1;
    private javax.swing.JButton No2;
    private javax.swing.JButton No3;
    private javax.swing.JButton No4;
    private javax.swing.JButton No5;
    private javax.swing.JButton No6;
    private javax.swing.JButton No7;
    private javax.swing.JButton No8;
    private javax.swing.JButton No9;
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txt_Disp;
    private javax.swing.JLabel txt_Ent;
    private javax.swing.JLabel txt_Entry;
    private javax.swing.JLabel txt_Err;
    private javax.swing.JTextField txt_pin;
    // End of variables declaration//GEN-END:variables
}
