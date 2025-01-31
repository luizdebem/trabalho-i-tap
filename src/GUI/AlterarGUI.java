package GUI;

import Controllers.*;
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
public class AlterarGUI extends javax.swing.JFrame {

    /**
     * Creates new form InserirGUI
     */
    public AlterarGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        opcaoCodigo = new javax.swing.JRadioButton();
        opcaoNome = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        cancelarBtn = new javax.swing.JButton();
        alterarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputCodigo = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputPreco = new javax.swing.JTextField();
        inputModelo = new javax.swing.JTextField();
        inputEstado = new javax.swing.JTextField();
        pesquisarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar produto - Multisono Produtos Musicais");
        setBounds(new java.awt.Rectangle(600, 300, 500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioGroup.add(opcaoCodigo);
        opcaoCodigo.setText("Código");
        getContentPane().add(opcaoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        radioGroup.add(opcaoNome);
        opcaoNome.setText("Nome");
        getContentPane().add(opcaoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel1.setText("Você deseja alterar através do código ou nome?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, -1));

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 120, 50));

        alterarBtn.setText("Alterar");
        alterarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(alterarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, 50));

        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        getContentPane().add(inputMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 100, -1));

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel4.setText("Modelo");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel5.setText("Marca");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel6.setText("Estado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel7.setText("Preço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        inputCodigo.setEnabled(false);
        getContentPane().add(inputCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 100, -1));
        getContentPane().add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 100, -1));
        getContentPane().add(inputPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 100, -1));
        getContentPane().add(inputModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, -1));
        getContentPane().add(inputEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, -1));

        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.setToolTipText("");
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void alterarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBtnActionPerformed
        // TODO add your handling code here:
        try {
            GerenciadorProduto produtos = new GerenciadorProduto();
            int codigo = Integer.parseInt(this.inputCodigo.getText());
            String nome = this.inputNome.getText();
            String modelo = this.inputModelo.getText();
            String marca = this.inputMarca.getText();
            String estado = this.inputEstado.getText();
            Double preco = Double.parseDouble(this.inputPreco.getText());
            RegistroProduto produto = new RegistroProduto(codigo, nome, modelo, marca, estado, preco, 0);
            produtos.atualizarArquivo(codigo, produto);
            JOptionPane.showMessageDialog(null, "Produto de código " + codigo + " atualizado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Existem erros no formulário, verifique os dados.");
        }

    }//GEN-LAST:event_alterarBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (this.opcaoNome.isSelected()) {
                GerenciadorProduto produtos = new GerenciadorProduto();
                String pesquisa = this.textField.getText();
                RegistroProduto resultado = produtos.pesquisarRegistroNome(pesquisa);
                popularForm(resultado);
            } else if (this.opcaoCodigo.isSelected()) {
                GerenciadorProduto produtos = new GerenciadorProduto();
                RegistroProduto resultado = produtos.pesquisarRegistro(Integer.parseInt(this.textField.getText()));
                popularForm(resultado);
            } else {
                throw new Exception();
            }
        } catch (NullPointerException  npe) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Existem erros no formulário, verifique os dados.");
        }

    }//GEN-LAST:event_pesquisarBtnActionPerformed

    private void popularForm(RegistroProduto produto) {
        this.inputCodigo.setText(String.valueOf(produto.getCodigo()));
        this.inputNome.setText(produto.getNome());
        this.inputModelo.setText(produto.getModelo());
        this.inputMarca.setText(produto.getMarca());
        this.inputEstado.setText(produto.getEstado());
        this.inputPreco.setText(String.valueOf(produto.getPreco()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField inputCodigo;
    private javax.swing.JTextField inputEstado;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton opcaoCodigo;
    private javax.swing.JRadioButton opcaoNome;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
