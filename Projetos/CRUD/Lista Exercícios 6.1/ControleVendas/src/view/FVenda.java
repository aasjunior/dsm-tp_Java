package view;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FVenda extends javax.swing.JFrame {
    
    ImageIcon iNovaVenda = new ImageIcon("src/imgs/cadastrar-venda.png");
    ImageIcon iConsultarVendas = new ImageIcon("src/imgs/consultar-vendas.png");
    
    
    public void abrirPanel(JPanel p){
        p.setSize(580, 360);
        p.setLocation(0, 0);
        
        this.pnlContent.removeAll();
        this.pnlContent.add(p, BorderLayout.CENTER);
        this.pnlContent.revalidate();
        this.pnlContent.repaint();
    }

    public FVenda() {
        initComponents();
        
        iNovaVenda.setImage(iNovaVenda.getImage().getScaledInstance(80, 80, 1));
        iConsultarVendas.setImage(iConsultarVendas.getImage().getScaledInstance(80, 80, 1));
        this.lblNovaVenda.setIcon(iNovaVenda);
        this.lblConsultarVendas.setIcon(iConsultarVendas);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNovaVenda = new javax.swing.JPanel();
        lblNovaVenda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConsultarVendas = new javax.swing.JPanel();
        lblConsultarVendas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnCadastrar = new javax.swing.JMenuItem();
        mnConsultar = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seja Bem-Vindo!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escolha o que fazer");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnNovaVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnNovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovaVendaMouseClicked(evt);
            }
        });

        lblNovaVenda.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setText("Nova Venda");

        javax.swing.GroupLayout btnNovaVendaLayout = new javax.swing.GroupLayout(btnNovaVenda);
        btnNovaVenda.setLayout(btnNovaVendaLayout);
        btnNovaVendaLayout.setHorizontalGroup(
            btnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNovaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNovaVendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
        );
        btnNovaVendaLayout.setVerticalGroup(
            btnNovaVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNovaVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConsultarVendas.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarVendasMouseClicked(evt);
            }
        });

        lblConsultarVendas.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setText("Consultar Vendas");

        javax.swing.GroupLayout btnConsultarVendasLayout = new javax.swing.GroupLayout(btnConsultarVendas);
        btnConsultarVendas.setLayout(btnConsultarVendasLayout);
        btnConsultarVendasLayout.setHorizontalGroup(
            btnConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnConsultarVendasLayout.setVerticalGroup(
            btnConsultarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                        .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentLayout.createSequentialGroup()
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConsultarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jMenu1.setText("Opções");

        mnCadastrar.setText("Nova Venda");
        mnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(mnCadastrar);

        mnConsultar.setText("Consultar Vendas");
        mnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(mnConsultar);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaVendaMouseClicked
        PCadastrarVenda novaVenda = new PCadastrarVenda();
        abrirPanel(novaVenda);
    }//GEN-LAST:event_btnNovaVendaMouseClicked

    private void btnConsultarVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarVendasMouseClicked
        PConsultarVenda consultarVendas = new PConsultarVenda();
        abrirPanel(consultarVendas);
    }//GEN-LAST:event_btnConsultarVendasMouseClicked

    private void mnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarActionPerformed
        PCadastrarVenda novaVenda = new PCadastrarVenda();
        abrirPanel(novaVenda);
    }//GEN-LAST:event_mnCadastrarActionPerformed

    private void mnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultarActionPerformed
        PConsultarVenda consultarVendas = new PConsultarVenda();
        abrirPanel(consultarVendas);
    }//GEN-LAST:event_mnConsultarActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Alerta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_mnSairActionPerformed

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
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConsultarVendas;
    private javax.swing.JPanel btnNovaVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblConsultarVendas;
    private javax.swing.JLabel lblNovaVenda;
    private javax.swing.JMenuItem mnCadastrar;
    private javax.swing.JMenuItem mnConsultar;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
