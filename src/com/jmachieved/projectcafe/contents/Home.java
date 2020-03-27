/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmachieved.projectcafe.contents;

import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class Home extends javax.swing.JFrame {

  

    /**
     * Creates new form Home
     */
    
    private static boolean max = true;
    public Home() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stat = new javax.swing.JPanel();
        lbClose = new javax.swing.JLabel();
        lbMinimize = new javax.swing.JLabel();
        lbFull = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jPcaffeamerica = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPcaffemocha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPcaramelmacchiato = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPcappuccino = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPespresso = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPflatwhite = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPicedcaffeamericano = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPwhitechocolatemocha = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[cafe]");
        setBackground(new java.awt.Color(204, 204, 204));
        setLocationByPlatform(true);
        setUndecorated(true);

        stat.setBackground(new java.awt.Color(27, 27, 27));
        stat.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        stat.setPreferredSize(new java.awt.Dimension(0, 0));

        lbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/close.png"))); // NOI18N
        lbClose.setPreferredSize(new java.awt.Dimension(18, 18));
        lbClose.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCloseMouseClicked(evt);
            }
        });

        lbMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/mini.png"))); // NOI18N
        lbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizeMouseClicked(evt);
            }
        });

        lbFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/full.png"))); // NOI18N
        lbFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFullMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("[cafe]");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setIconTextGap(8);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/contents/icoo.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout statLayout = new javax.swing.GroupLayout(stat);
        stat.setLayout(statLayout);
        statLayout.setHorizontalGroup(
            statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbMinimize)
                .addGap(10, 10, 10)
                .addComponent(lbFull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1321, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statLayout.setVerticalGroup(
            statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbFull, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        main.setBackground(new java.awt.Color(109, 109, 109));
        main.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        main.setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/caffeamerica.jpg"))); // NOI18N

        javax.swing.GroupLayout jPcaffeamericaLayout = new javax.swing.GroupLayout(jPcaffeamerica);
        jPcaffeamerica.setLayout(jPcaffeamericaLayout);
        jPcaffeamericaLayout.setHorizontalGroup(
            jPcaffeamericaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaffeamericaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPcaffeamericaLayout.setVerticalGroup(
            jPcaffeamericaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaffeamericaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPcaffemocha.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/caffemocha.jpg"))); // NOI18N

        javax.swing.GroupLayout jPcaffemochaLayout = new javax.swing.GroupLayout(jPcaffemocha);
        jPcaffemocha.setLayout(jPcaffemochaLayout);
        jPcaffemochaLayout.setHorizontalGroup(
            jPcaffemochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaffemochaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPcaffemochaLayout.setVerticalGroup(
            jPcaffemochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaffemochaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jPcaramelmacchiato.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/caramelmacchiato.jpg"))); // NOI18N

        javax.swing.GroupLayout jPcaramelmacchiatoLayout = new javax.swing.GroupLayout(jPcaramelmacchiato);
        jPcaramelmacchiato.setLayout(jPcaramelmacchiatoLayout);
        jPcaramelmacchiatoLayout.setHorizontalGroup(
            jPcaramelmacchiatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaramelmacchiatoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPcaramelmacchiatoLayout.setVerticalGroup(
            jPcaramelmacchiatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaramelmacchiatoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPcappuccino.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/cappuccino.jpg"))); // NOI18N

        javax.swing.GroupLayout jPcappuccinoLayout = new javax.swing.GroupLayout(jPcappuccino);
        jPcappuccino.setLayout(jPcappuccinoLayout);
        jPcappuccinoLayout.setHorizontalGroup(
            jPcappuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcappuccinoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPcappuccinoLayout.setVerticalGroup(
            jPcappuccinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcappuccinoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPespresso.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/espresso.jpg"))); // NOI18N

        javax.swing.GroupLayout jPespressoLayout = new javax.swing.GroupLayout(jPespresso);
        jPespresso.setLayout(jPespressoLayout);
        jPespressoLayout.setHorizontalGroup(
            jPespressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPespressoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel8)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPespressoLayout.setVerticalGroup(
            jPespressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPespressoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jPflatwhite.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/flatwhite.jpg"))); // NOI18N

        javax.swing.GroupLayout jPflatwhiteLayout = new javax.swing.GroupLayout(jPflatwhite);
        jPflatwhite.setLayout(jPflatwhiteLayout);
        jPflatwhiteLayout.setHorizontalGroup(
            jPflatwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPflatwhiteLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPflatwhiteLayout.setVerticalGroup(
            jPflatwhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPflatwhiteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPicedcaffeamericano.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/icedcaffeamericano.jpg"))); // NOI18N

        javax.swing.GroupLayout jPicedcaffeamericanoLayout = new javax.swing.GroupLayout(jPicedcaffeamericano);
        jPicedcaffeamericano.setLayout(jPicedcaffeamericanoLayout);
        jPicedcaffeamericanoLayout.setHorizontalGroup(
            jPicedcaffeamericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPicedcaffeamericanoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPicedcaffeamericanoLayout.setVerticalGroup(
            jPicedcaffeamericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPicedcaffeamericanoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPwhitechocolatemocha.setPreferredSize(new java.awt.Dimension(220, 360));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jmachieved/projectcafe/images/cafemenu/whitechocolatemocha.jpg"))); // NOI18N

        javax.swing.GroupLayout jPwhitechocolatemochaLayout = new javax.swing.GroupLayout(jPwhitechocolatemocha);
        jPwhitechocolatemocha.setLayout(jPwhitechocolatemochaLayout);
        jPwhitechocolatemochaLayout.setHorizontalGroup(
            jPwhitechocolatemochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPwhitechocolatemochaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(90, 90, 90))
        );
        jPwhitechocolatemochaLayout.setVerticalGroup(
            jPwhitechocolatemochaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPwhitechocolatemochaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPcaffeamerica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPespresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPflatwhite, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jPcaffemocha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPicedcaffeamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPcaramelmacchiato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPcappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPwhitechocolatemocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPcaffemocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPcaffeamerica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPcappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPcaramelmacchiato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPflatwhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPespresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPicedcaffeamericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPwhitechocolatemocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
            .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, 1498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stat, 40, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
        // TODO add your handling code here:
        int respons = JOptionPane.showConfirmDialog(this, "Do you to continue this action? ",
               "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(respons == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
        }
        
    }//GEN-LAST:event_lbCloseMouseClicked

    private void lbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lbMinimizeMouseClicked

    private void lbFullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFullMouseClicked
        // TODO add your handling code here:
        if(max){
            Home.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();  
            Home.this.setMaximizedBounds(env.getMaximumWindowBounds());
           max =false; 
        }else{
            setExtendedState(JFrame.NORMAL);
            max= true;
        }
       // setExtendedState(getExtendedState()| Home.MAXIMIZED_BOTH);
    }//GEN-LAST:event_lbFullMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPcaffeamerica;
    private javax.swing.JPanel jPcaffemocha;
    private javax.swing.JPanel jPcappuccino;
    private javax.swing.JPanel jPcaramelmacchiato;
    private javax.swing.JPanel jPespresso;
    private javax.swing.JPanel jPflatwhite;
    private javax.swing.JPanel jPicedcaffeamericano;
    private javax.swing.JPanel jPwhitechocolatemocha;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbFull;
    private javax.swing.JLabel lbMinimize;
    private javax.swing.JPanel main;
    private javax.swing.JPanel stat;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoo.png")));
    }
}
