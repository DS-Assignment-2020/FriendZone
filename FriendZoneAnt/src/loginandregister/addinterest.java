/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregister;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class addinterest extends javax.swing.JFrame {

    /**
     * Creates new form addinterest
     */
    public addinterest() {
        initComponents();
        this.setLocationRelativeTo(null);
        findfriend.setBackground(new Color(0,0,0,0));
        leftarrow.setBackground(new Color(0,0,0,0));
        rightarrow.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        leftarrow = new javax.swing.JButton();
        findfriend = new javax.swing.JButton();
        rightarrow = new javax.swing.JButton();
        enterinterest = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        interest = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        coordinate = new javax.swing.JLabel();
        About = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        min.setFont(new java.awt.Font("Arial Black", 0, 40)); // NOI18N
        min.setText("—");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        leftarrow.setBackground(new java.awt.Color(52, 152, 219));
        leftarrow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        leftarrow.setForeground(new java.awt.Color(255, 255, 255));
        leftarrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leftarrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftarrowActionPerformed(evt);
            }
        });

        findfriend.setBackground(new java.awt.Color(52, 152, 219));
        findfriend.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        findfriend.setForeground(new java.awt.Color(255, 255, 255));
        findfriend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findfriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findfriendActionPerformed(evt);
            }
        });

        rightarrow.setBackground(new java.awt.Color(52, 152, 219));
        rightarrow.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rightarrow.setForeground(new java.awt.Color(255, 255, 255));
        rightarrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightarrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightarrowActionPerformed(evt);
            }
        });

        enterinterest.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        enterinterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterinterestActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Name.setText("name,age");

        gender.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        gender.setText("gender");

        interest.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        interest.setForeground(new java.awt.Color(102, 102, 102));
        interest.setText("interest");

        add.setBackground(new java.awt.Color(255, 255, 204));
        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("Add interest");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        coordinate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        coordinate.setText("coordinate");

        About.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        About.setText("About XXX");

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandregister/interest.jpg"))); // NOI18N
        bg.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1662, 1662, 1662)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(900, 900, 900)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(leftarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coordinate, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(640, 640, 640)
                .addComponent(rightarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(enterinterest, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(690, 690, 690)
                .addComponent(findfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coordinate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rightarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterinterest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(findfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findfriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findfriendActionPerformed
        // TODO add your handling code here:
        chat f=new chat();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_findfriendActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void leftarrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftarrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftarrowActionPerformed

    private void rightarrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightarrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightarrowActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void enterinterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterinterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterinterestActionPerformed

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
            java.util.logging.Logger.getLogger(addinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addinterest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addinterest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel Name;
    private javax.swing.JButton add;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel close;
    private javax.swing.JLabel coordinate;
    private javax.swing.JTextField enterinterest;
    private javax.swing.JButton findfriend;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel interest;
    private javax.swing.JButton leftarrow;
    private javax.swing.JLabel min;
    private javax.swing.JButton rightarrow;
    // End of variables declaration//GEN-END:variables
}
