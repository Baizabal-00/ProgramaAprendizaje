/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minijuegoslectogo.vistas;

import minijuegoslectogo.controladores.ColocadorImagenes;
import minijuegoslectogo.controladores.CtrlVistaMiniAbecedario;

/**
 *
 * @author Baiza
 */
public class VistaMiniAbecedario extends javax.swing.JFrame {

    
    
    private CtrlVistaMiniAbecedario objCtrl;
    private ColocadorImagenes objCI;
    
    public VistaMiniAbecedario() {
        initComponents();
        objCtrl = new CtrlVistaMiniAbecedario(this);
        objCI = new ColocadorImagenes();
        objCI.setImage(labelDeLetras, "src/minijuegoslectogo/assets/imagenes/abecedario/LetrasAbecedarios.png");
        objCI.setImage(labelDePuntuacion, "src/minijuegoslectogo/assets/imagenes/abecedario/ABCFondoSup.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnÑ = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnRepetir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelDeLetras = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelPuntuacion = new javax.swing.JLabel();
        labelDePuntuacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnA.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnA.setContentAreaFilled(false);
        jPanel4.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 70, 70));

        btnB.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnB.setContentAreaFilled(false);
        jPanel4.add(btnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 8, 70, 70));

        btnC.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnC.setContentAreaFilled(false);
        jPanel4.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 8, 70, 70));

        btnE.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnE.setToolTipText("");
        btnE.setContentAreaFilled(false);
        jPanel4.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 6, 70, 70));

        btnD.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnD.setContentAreaFilled(false);
        jPanel4.add(btnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 8, 70, 70));

        btnG.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnG.setContentAreaFilled(false);
        jPanel4.add(btnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 8, 70, 70));

        btnF.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnF.setContentAreaFilled(false);
        jPanel4.add(btnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 6, 70, 70));

        btnN.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnN.setContentAreaFilled(false);
        jPanel4.add(btnN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 70, 70));

        btnM.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnM.setContentAreaFilled(false);
        jPanel4.add(btnM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 70, 70));

        btnL.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnL.setContentAreaFilled(false);
        jPanel4.add(btnL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 70, 70));

        btnK.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnK.setContentAreaFilled(false);
        jPanel4.add(btnK, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 70, 70));

        btnJ.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnJ.setContentAreaFilled(false);
        jPanel4.add(btnJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 70));

        btnI.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnI.setContentAreaFilled(false);
        jPanel4.add(btnI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, 70));

        btnH.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnH.setContentAreaFilled(false);
        jPanel4.add(btnH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 70));

        btnO.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnO.setContentAreaFilled(false);
        jPanel4.add(btnO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 70, 70));

        btnQ.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnQ.setContentAreaFilled(false);
        jPanel4.add(btnQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 70, 70));

        btnP.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnP.setContentAreaFilled(false);
        jPanel4.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 70, 70));

        btnÑ.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnÑ.setContentAreaFilled(false);
        jPanel4.add(btnÑ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 70));

        btnT.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnT.setContentAreaFilled(false);
        jPanel4.add(btnT, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 70, 70));

        btnS.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnS.setContentAreaFilled(false);
        jPanel4.add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 70, 70));

        btnR.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnR.setContentAreaFilled(false);
        jPanel4.add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 70));

        btnV.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnV.setContentAreaFilled(false);
        jPanel4.add(btnV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 70, 70));

        btnX.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnX.setContentAreaFilled(false);
        jPanel4.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, 70));

        btnW.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        btnW.setContentAreaFilled(false);
        jPanel4.add(btnW, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 70, 70));

        btnU.setFont(new java.awt.Font("Impact", 0, 32)); // NOI18N
        btnU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnU.setContentAreaFilled(false);
        jPanel4.add(btnU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 70));

        btnZ.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnZ.setContentAreaFilled(false);
        jPanel4.add(btnZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 70, 70));

        btnY.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnY.setContentAreaFilled(false);
        jPanel4.add(btnY, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 70, 70));

        btnReiniciar.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnReiniciar.setActionCommand("");
        btnReiniciar.setContentAreaFilled(false);
        jPanel4.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 255, 70));

        btnRepetir.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnRepetir.setContentAreaFilled(false);
        jPanel4.add(btnRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 6, 179, 150));

        btnSalir.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 179, 70));
        jPanel4.add(labelDeLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 350));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 770, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPuntuacion.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        labelPuntuacion.setForeground(new java.awt.Color(255, 255, 0));
        labelPuntuacion.setText("00");
        jPanel1.add(labelPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 250, 128));

        labelDePuntuacion.setText("jLabel3");
        jPanel1.add(labelDePuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 140));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaMiniAbecedario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMiniAbecedario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMiniAbecedario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMiniAbecedario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMiniAbecedario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnA;
    public javax.swing.JButton btnB;
    public javax.swing.JButton btnC;
    public javax.swing.JButton btnD;
    public javax.swing.JButton btnE;
    public javax.swing.JButton btnF;
    public javax.swing.JButton btnG;
    public javax.swing.JButton btnH;
    public javax.swing.JButton btnI;
    public javax.swing.JButton btnJ;
    public javax.swing.JButton btnK;
    public javax.swing.JButton btnL;
    public javax.swing.JButton btnM;
    public javax.swing.JButton btnN;
    public javax.swing.JButton btnO;
    public javax.swing.JButton btnP;
    public javax.swing.JButton btnQ;
    public javax.swing.JButton btnR;
    public javax.swing.JButton btnReiniciar;
    public javax.swing.JButton btnRepetir;
    public javax.swing.JButton btnS;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnT;
    public javax.swing.JButton btnU;
    public javax.swing.JButton btnV;
    public javax.swing.JButton btnW;
    public javax.swing.JButton btnX;
    public javax.swing.JButton btnY;
    public javax.swing.JButton btnZ;
    public javax.swing.JButton btnÑ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelDeLetras;
    private javax.swing.JLabel labelDePuntuacion;
    public javax.swing.JLabel labelPuntuacion;
    // End of variables declaration//GEN-END:variables
}
