
package mapaprogsistm1;

import javax.swing.JOptionPane;
/**
 * Mapa Programação de Sistemas 1
 * @author Matheus Rodrigues
 */
public class MainScreen extends javax.swing.JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public MainScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelEqB = new javax.swing.JLabel();
        jLabelEqA = new javax.swing.JLabel();
        btnPlus1A = new javax.swing.JButton();
        btnMinus1A = new javax.swing.JButton();
        btnPlus3A = new javax.swing.JButton();
        scrEqB = new javax.swing.JTextField();
        scrEqA = new javax.swing.JTextField();
        btnMinus1B = new javax.swing.JButton();
        btnPlus3B = new javax.swing.JButton();
        btnPlus1B = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPlacA = new javax.swing.JLabel();
        scrPlacEqB = new javax.swing.JTextField();
        scrPlacEqA = new javax.swing.JTextField();
        lblPlacB = new javax.swing.JLabel();
        lblVenc = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        scrEqVenc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelEqB.setBackground(new java.awt.Color(255, 51, 0));
        jLabelEqB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEqB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEqB.setText("EQUIPE B");
        jLabelEqB.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(jLabelEqB);
        jLabelEqB.setBounds(670, 90, 155, 30);

        jLabelEqA.setBackground(new java.awt.Color(0, 0, 0));
        jLabelEqA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelEqA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEqA.setText("EQUIPE A");
        jLabelEqA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(jLabelEqA);
        jLabelEqA.setBounds(90, 90, 155, 30);

        btnPlus1A.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnPlus1A.setForeground(new java.awt.Color(0, 204, 204));
        btnPlus1A.setText("+1");
        btnPlus1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1AActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus1A);
        btnPlus1A.setBounds(60, 240, 72, 23);

        btnMinus1A.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnMinus1A.setForeground(new java.awt.Color(255, 0, 0));
        btnMinus1A.setText("-1");
        btnMinus1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1AActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinus1A);
        btnMinus1A.setBounds(210, 240, 72, 23);

        btnPlus3A.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnPlus3A.setForeground(new java.awt.Color(51, 255, 0));
        btnPlus3A.setText("+3");
        btnPlus3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus3AActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus3A);
        btnPlus3A.setBounds(130, 210, 72, 23);

        scrEqB.setEditable(false);
        scrEqB.setBackground(new java.awt.Color(153, 255, 255));
        scrEqB.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        scrEqB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scrEqB.setText("0");
        scrEqB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(scrEqB);
        scrEqB.setBounds(790, 140, 45, 42);

        scrEqA.setEditable(false);
        scrEqA.setBackground(new java.awt.Color(153, 255, 255));
        scrEqA.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        scrEqA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scrEqA.setText("0");
        scrEqA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scrEqA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrEqA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrEqAActionPerformed(evt);
            }
        });
        getContentPane().add(scrEqA);
        scrEqA.setBounds(200, 140, 45, 42);

        btnMinus1B.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnMinus1B.setForeground(new java.awt.Color(255, 0, 0));
        btnMinus1B.setText("-1");
        btnMinus1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1BActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinus1B);
        btnMinus1B.setBounds(790, 240, 72, 23);

        btnPlus3B.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnPlus3B.setForeground(new java.awt.Color(51, 255, 0));
        btnPlus3B.setText("+3");
        btnPlus3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus3BActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus3B);
        btnPlus3B.setBounds(720, 210, 72, 23);

        btnPlus1B.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnPlus1B.setForeground(new java.awt.Color(0, 204, 204));
        btnPlus1B.setText("+1");
        btnPlus1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1BActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlus1B);
        btnPlus1B.setBounds(650, 240, 72, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pontuação ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 150, 70, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pontuação ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 150, 77, 15);

        lblPlacA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPlacA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacA.setText("Placar");
        getContentPane().add(lblPlacA);
        lblPlacA.setBounds(140, 320, 51, 15);

        scrPlacEqB.setEditable(false);
        scrPlacEqB.setBackground(new java.awt.Color(153, 255, 255));
        scrPlacEqB.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        scrPlacEqB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scrPlacEqB.setText("0");
        scrPlacEqB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(scrPlacEqB);
        scrPlacEqB.setBounds(710, 340, 68, 38);

        scrPlacEqA.setEditable(false);
        scrPlacEqA.setBackground(new java.awt.Color(153, 255, 255));
        scrPlacEqA.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        scrPlacEqA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scrPlacEqA.setText("0");
        scrPlacEqA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        scrPlacEqA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrPlacEqAActionPerformed(evt);
            }
        });
        getContentPane().add(scrPlacEqA);
        scrPlacEqA.setBounds(130, 340, 69, 38);

        lblPlacB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPlacB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlacB.setText("Placar");
        getContentPane().add(lblPlacB);
        lblPlacB.setBounds(720, 320, 51, 15);

        lblVenc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblVenc.setText("VENCEDOR");
        getContentPane().add(lblVenc);
        lblVenc.setBounds(400, 400, 110, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 480, 80, 20);

        scrEqVenc.setEditable(false);
        scrEqVenc.setBackground(new java.awt.Color(153, 255, 255));
        scrEqVenc.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        scrEqVenc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        scrEqVenc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        getContentPane().add(scrEqVenc);
        scrEqVenc.setBounds(350, 430, 210, 38);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaprogsistm1/pngegg.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, -30, 310, 400);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaprogsistm1/104-1045592_free-png-moldura-png-images-transparent-molduras-para.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 0, 310, 480);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaprogsistm1/104-1045592_free-png-moldura-png-images-transparent-molduras-para.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 0, 310, 480);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mapaprogsistm1/Foto-Troféu-PNG-1200x1095.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 330, 80, 70);

        setBounds(0, 0, 942, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlus1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1AActionPerformed
        //Recuperar texto pontuação Equipe A e converter em inteiro;     
        String textoPtnEqA =  scrEqA.getText();
        int resultPtnA = Integer.parseInt(textoPtnEqA);
        //Condição para adição +1     
        if (resultPtnA < 12){
            resultPtnA = resultPtnA + 1;
        }
        //Converter inteiro para String e inserir na pontuação;    
        textoPtnEqA = String.valueOf(resultPtnA);
        scrEqA.setText(textoPtnEqA);
        //Condição para alterar placar ao atingir 12 pts;  
        if (resultPtnA == 12){
            JOptionPane.showMessageDialog(null,"Ponto para Equipe A!");
            String txtScrPlacA = scrPlacEqA.getText();
            int resultScrPlacA = Integer.parseInt(txtScrPlacA);
            if (resultScrPlacA < 3) {
                resultScrPlacA = resultScrPlacA + 1;
            }
            txtScrPlacA = String.valueOf(resultScrPlacA);
            scrPlacEqA.setText(txtScrPlacA);
            scrEqA.setText("0");
            //Condição para Alterar resultado Final;
            if ((resultScrPlacA == 2) || (resultScrPlacA == 3)) {
               scrEqVenc.setText("EQUIPE A");
               JOptionPane.showMessageDialog(null, "EQUIPE A VENCEU!");
               scrPlacEqA.setText("0");
               scrPlacEqB.setText("0");
            }
        }
    }//GEN-LAST:event_btnPlus1AActionPerformed

    private void btnPlus3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus3AActionPerformed
        //Recuperar texto pontuação Equipe A e converter em inteiro;   
        String textoPtnEqA =  scrEqA.getText();
        int resultPtnA = Integer.parseInt(textoPtnEqA);
        //Condição para adição +3;     
        if (resultPtnA == 11){
            resultPtnA = resultPtnA + 1;
        }
        if (resultPtnA == 10){
            resultPtnA = resultPtnA + 2;
        }
        if (resultPtnA <= 9){
            resultPtnA = resultPtnA + 3;
        }
        textoPtnEqA = String.valueOf(resultPtnA);
        scrEqA.setText(textoPtnEqA);
        //Condição para alterar placar ao atingir 12 pts;   
        if (resultPtnA == 12){
            JOptionPane.showMessageDialog(null, "Ponto para Equipe A!");
            String txtScrPlacA = scrPlacEqA.getText();
            int resultScrPlacA = Integer.parseInt(txtScrPlacA);
            if (resultScrPlacA < 3) {
                resultScrPlacA = resultScrPlacA + 1;
            }
            txtScrPlacA = String.valueOf(resultScrPlacA);
            scrPlacEqA.setText(txtScrPlacA);
            scrEqA.setText("0");
            scrEqB.setText("0");
            //Condição para Alterar resultado Final;
            if ((resultScrPlacA == 2) || (resultScrPlacA == 3)) {
               scrEqVenc.setText("EQUIPE A");
               JOptionPane.showMessageDialog(null, "EQUIPE A VENCEU!");
               scrPlacEqA.setText("0");
               scrPlacEqB.setText("0");
            }
        }
    }//GEN-LAST:event_btnPlus3AActionPerformed

    private void btnMinus1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1AActionPerformed
        //Recuperar texto pontuação Equipe A e converter em inteiro;     
        String textoPtnEqA =  scrEqA.getText();
        int resultPtnA = Integer.parseInt(textoPtnEqA);
        //Condição para subtração -1;     
        if (resultPtnA > 0){
             resultPtnA = resultPtnA - 1;
        }
        textoPtnEqA = String.valueOf(resultPtnA);
        scrEqA.setText(textoPtnEqA);
    }//GEN-LAST:event_btnMinus1AActionPerformed

    private void btnMinus1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1BActionPerformed
        //Recuperar texto pontuação Equipe A e converter em inteiro;  
        String textoPtnEqB =  scrEqB.getText();
        int resultPtnB = Integer.parseInt(textoPtnEqB);
        //Condição para subtração -1;    
        if (resultPtnB > 0){
             resultPtnB = resultPtnB - 1;
        }
        textoPtnEqB = String.valueOf(resultPtnB);
        scrEqB.setText(textoPtnEqB);
    }//GEN-LAST:event_btnMinus1BActionPerformed

    private void btnPlus3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus3BActionPerformed
        //Recuperar texto pontuação Equipe A e converter em inteiro; 
        String textoPtnEqB =  scrEqB.getText();
        int resultPtnB = Integer.parseInt(textoPtnEqB);
        //Condição para adição +3;      
        if (resultPtnB == 11){
            resultPtnB = resultPtnB + 1;
        }
        if (resultPtnB == 10){
            resultPtnB = resultPtnB + 2;
        }
        if (resultPtnB <= 9){
            resultPtnB = resultPtnB + 3;
        }
        textoPtnEqB = String.valueOf(resultPtnB);
        scrEqB.setText(textoPtnEqB);
        //Condição para alterar placar ao atingir 12 pts;   
        if (resultPtnB == 12){
            JOptionPane.showMessageDialog(null, "Ponto para Equipe B!");
            String txtScrPlacB = scrPlacEqB.getText();
            int resultScrPlacB = Integer.parseInt(txtScrPlacB);
            if (resultScrPlacB < 3) {
                resultScrPlacB = resultScrPlacB + 1;
            }
            txtScrPlacB = String.valueOf(resultScrPlacB);
            scrPlacEqB.setText(txtScrPlacB);
            scrEqB.setText("0");
            scrEqA.setText("0");
            //Condição para Alterar resultado Final;
            if ((resultScrPlacB == 2) || (resultScrPlacB == 3)) {
               scrEqVenc.setText("EQUIPE B");
               JOptionPane.showMessageDialog(null, "EQUIPE B VENCEU!");
               scrPlacEqB.setText("0");
               scrPlacEqA.setText("0");
            }
        }                   
    }//GEN-LAST:event_btnPlus3BActionPerformed

    private void btnPlus1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1BActionPerformed
        //Recupera texto pontuação Equipe B e converte em inteiro     
        String textoPtnEqB =  scrEqB.getText();
        int resultPtnB = Integer.parseInt(textoPtnEqB);
        //Condição para adição +1     
        if (resultPtnB < 12){
            resultPtnB = resultPtnB + 1;
        }
        //Converte inteiro para String e insere na pontuação    
        textoPtnEqB = String.valueOf(resultPtnB);
        scrEqB.setText(textoPtnEqB);
        //Condição para alterar placar ao atingir 12 pts   
        if (resultPtnB == 12){
            JOptionPane.showMessageDialog(null, "Ponto para Equipe B!");
            String txtScrPlacB = scrPlacEqB.getText();
            int resultScrPlacB = Integer.parseInt(txtScrPlacB);
            if (resultScrPlacB < 3) {
                resultScrPlacB = resultScrPlacB + 1;
            }
            txtScrPlacB = String.valueOf(resultScrPlacB);
            scrPlacEqB.setText(txtScrPlacB);
            scrEqB.setText("0");
            //Condição para Alterar resultado Final
            if ((resultScrPlacB == 2) || (resultScrPlacB == 3)) {
               scrEqVenc.setText("EQUIPE B");
               JOptionPane.showMessageDialog(null, "EQUIPE B VENCEU!");
               scrPlacEqB.setText("0");
               scrPlacEqA.setText("0");
            }
        }                                         
    }//GEN-LAST:event_btnPlus1BActionPerformed

    private void scrPlacEqAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrPlacEqAActionPerformed

    }//GEN-LAST:event_scrPlacEqAActionPerformed

    private void scrEqAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrEqAActionPerformed

    }//GEN-LAST:event_scrEqAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Funçao RESET
        scrEqA.setText("0");
        scrPlacEqA.setText("0");
        scrEqB.setText("0");
        scrPlacEqB.setText("0");
        scrEqVenc.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinus1A;
    private javax.swing.JButton btnMinus1B;
    private javax.swing.JButton btnPlus1A;
    private javax.swing.JButton btnPlus1B;
    private javax.swing.JButton btnPlus3A;
    private javax.swing.JButton btnPlus3B;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelEqA;
    private javax.swing.JLabel jLabelEqB;
    private javax.swing.JLabel lblPlacA;
    private javax.swing.JLabel lblPlacB;
    private javax.swing.JLabel lblVenc;
    public static javax.swing.JTextField scrEqA;
    public static javax.swing.JTextField scrEqB;
    private javax.swing.JTextField scrEqVenc;
    private javax.swing.JTextField scrPlacEqA;
    private javax.swing.JTextField scrPlacEqB;
    // End of variables declaration//GEN-END:variables
}
