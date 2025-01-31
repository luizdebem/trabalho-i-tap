package GUI;

import Controllers.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz
 */
public class MultisonoGUI extends javax.swing.JFrame {

    /**
     * Creates new form MultisonoGUI
     */
    public MultisonoGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        crudMenu = new javax.swing.JMenu();
        incluirBtn = new javax.swing.JMenuItem();
        excluirBtn = new javax.swing.JMenuItem();
        alterarBtn = new javax.swing.JMenuItem();
        consultarBtn = new javax.swing.JMenuItem();
        listagemMenu = new javax.swing.JMenu();
        listarLogicoBtn = new javax.swing.JMenuItem();
        listarFisicoBtn = new javax.swing.JMenuItem();
        propriedadesMenu = new javax.swing.JMenu();
        tamanhoArquivoMenu = new javax.swing.JMenuItem();
        qtdRegistrosMenu = new javax.swing.JMenuItem();
        esvaziarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multisono Produtos Musicais");
        setBounds(new java.awt.Rectangle(650, 300, 650, 650));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.FlowLayout());

        crudMenu.setText("CRUD");

        incluirBtn.setText("Incluir");
        incluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirBtnActionPerformed(evt);
            }
        });
        crudMenu.add(incluirBtn);

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });
        crudMenu.add(excluirBtn);

        alterarBtn.setText("Alterar");
        alterarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBtnActionPerformed(evt);
            }
        });
        crudMenu.add(alterarBtn);

        consultarBtn.setText("Consultar");
        consultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBtnActionPerformed(evt);
            }
        });
        crudMenu.add(consultarBtn);

        jMenuBar1.add(crudMenu);

        listagemMenu.setText("Listagem");

        listarLogicoBtn.setText("Listar lógico");
        listarLogicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLogicoBtnActionPerformed(evt);
            }
        });
        listagemMenu.add(listarLogicoBtn);

        listarFisicoBtn.setText("Listar físico");
        listarFisicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFisicoBtnActionPerformed(evt);
            }
        });
        listagemMenu.add(listarFisicoBtn);

        jMenuBar1.add(listagemMenu);

        propriedadesMenu.setText("Propriedades");

        tamanhoArquivoMenu.setText("Tamanho do Arquivo (bytes)");
        tamanhoArquivoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanhoArquivoMenuActionPerformed(evt);
            }
        });
        propriedadesMenu.add(tamanhoArquivoMenu);

        qtdRegistrosMenu.setText("Quantidade de Registros");
        qtdRegistrosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdRegistrosMenuActionPerformed(evt);
            }
        });
        propriedadesMenu.add(qtdRegistrosMenu);

        esvaziarMenu.setText("Esvaziar arquivo");
        esvaziarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esvaziarMenuActionPerformed(evt);
            }
        });
        propriedadesMenu.add(esvaziarMenu);

        jMenuBar1.add(propriedadesMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirBtnActionPerformed
        // TODO add your handling code here:
        new InserirGUI().setVisible(true);
    }//GEN-LAST:event_incluirBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        // TODO add your handling code here:
        new ExcluirGUI().setVisible(true);
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void alterarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBtnActionPerformed
        // TODO add your handling code here:
        new AlterarGUI().setVisible(true);
    }//GEN-LAST:event_alterarBtnActionPerformed

    private void consultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBtnActionPerformed
        // TODO add your handling code here:
        new ConsultarGUI().setVisible(true);
    }//GEN-LAST:event_consultarBtnActionPerformed

    private void listarLogicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLogicoBtnActionPerformed
        // TODO add your handling code here:
        GerenciadorProduto produtos = new GerenciadorProduto();
        String lista = produtos.listarLogico();
        JOptionPane.showMessageDialog(null, lista.length() >= 1 ? lista : "Não há registros.");
    }//GEN-LAST:event_listarLogicoBtnActionPerformed

    private void listarFisicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFisicoBtnActionPerformed
        // TODO add your handling code here:
        GerenciadorProduto produtos = new GerenciadorProduto();
        String lista = produtos.listarFisico();
        JOptionPane.showMessageDialog(null, lista.length() >= 1 ? lista : "Não há registros.");
    }//GEN-LAST:event_listarFisicoBtnActionPerformed

    private void esvaziarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esvaziarMenuActionPerformed
        // TODO add your handling code here:
        GerenciadorProduto produtos = new GerenciadorProduto();
        produtos.zeraArquivo();
    }//GEN-LAST:event_esvaziarMenuActionPerformed

    private void tamanhoArquivoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanhoArquivoMenuActionPerformed
        try {
            // TODO add your handling code here:
            GerenciadorProduto produtos = new GerenciadorProduto();
            
            JOptionPane.showMessageDialog(null, "Tamanho do arquivo: " + produtos.getArquivo().length() + " bytes");
        } catch (IOException e) {
        }
    }//GEN-LAST:event_tamanhoArquivoMenuActionPerformed

    private void qtdRegistrosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdRegistrosMenuActionPerformed
        // TODO add your handling code here:
        GerenciadorProduto produtos = new GerenciadorProduto();
        JOptionPane.showMessageDialog(null, "Número de registros: " + produtos.getQuantidadeRegistro());
    }//GEN-LAST:event_qtdRegistrosMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MultisonoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultisonoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultisonoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultisonoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultisonoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarBtn;
    private javax.swing.JMenuItem consultarBtn;
    private javax.swing.JMenu crudMenu;
    private javax.swing.JMenuItem esvaziarMenu;
    private javax.swing.JMenuItem excluirBtn;
    private javax.swing.JMenuItem incluirBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu listagemMenu;
    private javax.swing.JMenuItem listarFisicoBtn;
    private javax.swing.JMenuItem listarLogicoBtn;
    private javax.swing.JMenu propriedadesMenu;
    private javax.swing.JMenuItem qtdRegistrosMenu;
    private javax.swing.JMenuItem tamanhoArquivoMenu;
    // End of variables declaration//GEN-END:variables
}
