
import javax.swing.JOptionPane;

    public class CassinoElChapo extends javax.swing.JFrame {
    String nome;
    float valor_entrada = 0;
    float troco = 0;
    int pikachu = 0;
    int quantidade_10_pikachus = 0;
    int quantidade_100_pikachus = 0;
    int quantidade_500_pikachus = 0;
    
    public CassinoElChapo(){
      initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_valor_entrada = new javax.swing.JTextField();
        label_pikachu = new javax.swing.JLabel();
        botao_10_pikachus = new javax.swing.JButton();
        botao_100_pikachus = new javax.swing.JButton();
        botao_500_pikachus = new javax.swing.JButton();
        jogar = new javax.swing.JButton();
        label_troco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cassino El Chapo");

        jLabel2.setText("Nome:");

        jLabel3.setText("Valor de entrada:");

        label_pikachu.setText("Pikachu:");

        botao_10_pikachus.setText("10 Pikachus");
        botao_10_pikachus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_10_pikachusActionPerformed(evt);
            }
        });

        botao_100_pikachus.setText("100 Pikachus");
        botao_100_pikachus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_100_pikachusActionPerformed(evt);
            }
        });

        botao_500_pikachus.setText("500 Pikachus");
        botao_500_pikachus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_500_pikachusActionPerformed(evt);
            }
        });

        jogar.setText("JOGAR");
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });

        label_troco.setText("Troco:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_valor_entrada)
                    .addComponent(campo_nome))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jogar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_pikachu)
                    .addComponent(botao_10_pikachus))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_100_pikachus)
                    .addComponent(label_troco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(botao_500_pikachus)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_10_pikachus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_100_pikachus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_500_pikachus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_pikachu)
                    .addComponent(label_troco))
                .addGap(24, 24, 24)
                .addComponent(jogar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void botao_100_pikachusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_100_pikachusActionPerformed
        comprarFichas(100);
        quantidade_100_pikachus = quantidade_100_pikachus + 1;
    }//GEN-LAST:event_botao_100_pikachusActionPerformed

    private void botao_10_pikachusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_10_pikachusActionPerformed
        comprarFichas(10);
        quantidade_10_pikachus = quantidade_10_pikachus + 1;
    }//GEN-LAST:event_botao_10_pikachusActionPerformed

    private void botao_500_pikachusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_500_pikachusActionPerformed
        comprarFichas(500);
        quantidade_500_pikachus = quantidade_500_pikachus + 1;
    }//GEN-LAST:event_botao_500_pikachusActionPerformed

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarActionPerformed
      Menu_Jogos menu = new Menu_Jogos();
      menu.setVisible(true);
    }//GEN-LAST:event_jogarActionPerformed

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
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CassinoElChapo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CassinoElChapo().setVisible(true);
        });
    }
    public void comprarFichas(int valor_ficha){
        nome = campo_nome.getText();
        valor_entrada = Float.parseFloat(campo_valor_entrada.getText());
        pikachu = pikachu + valor_ficha;
        troco = valor_entrada - pikachu;
        label_pikachu.setText("Pikachu: " + pikachu);
        label_troco.setText("Troco: " + troco);
    }
    public int obterPikachu(){
        return pikachu;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_100_pikachus;
    private javax.swing.JButton botao_10_pikachus;
    private javax.swing.JButton botao_500_pikachus;
    private javax.swing.JTextField campo_nome;
    private javax.swing.JTextField campo_valor_entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jogar;
    private javax.swing.JLabel label_pikachu;
    private javax.swing.JLabel label_troco;
    // End of variables declaration//GEN-END:variables
}
