/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panels;

import connection.TabelasDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;
import modelo.FarmStrings;
import panels.MENU1;
/**
 *
 * @author jmpla
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
   public NewJFrame() {
        initComponents();
        
            this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Galery/icon2.png")).getImage());
        limparDesabilitarCampos(); //inicializa a tela com os campos vazios e desabilitados
        atualizaTabela(new TabelasDB()); //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelJanelaEscola = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelTabela = new javax.swing.JScrollPane();
        tabelaEscola = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtRm = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblDiretor = new javax.swing.JLabel();
        txtIdEscola = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        ESTOQUE = new javax.swing.JMenuItem();
        SAIDAS = new javax.swing.JMenuItem();
        CADASTRO = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelJanelaEscola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelJanelaEscola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelJanelaEscola.setMinimumSize(new java.awt.Dimension(1280, 720));
        painelJanelaEscola.setName(""); // NOI18N
        painelJanelaEscola.setPreferredSize(new java.awt.Dimension(1280, 720));
        painelJanelaEscola.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tabela de Remédios registrados");
        painelJanelaEscola.add(jLabel1);
        jLabel1.setBounds(570, 30, 380, 32);

        painelTabela.setBackground(new java.awt.Color(0, 0, 0));
        painelTabela.setDoubleBuffered(true);

        tabelaEscola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Remédio", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelTabela.setViewportView(tabelaEscola);

        painelJanelaEscola.add(painelTabela);
        painelTabela.setBounds(270, 70, 970, 560);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-add-product-20.png"))); // NOI18N
        btnNovo.setText("Adicionar Remédio");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNovo);
        btnNovo.setBounds(30, 360, 150, 40);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-produto-20.png"))); // NOI18N
        btnRemover.setText("Remover Remédio");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover);
        btnRemover.setBounds(30, 500, 150, 40);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-escudo-com-fechadura-20.png"))); // NOI18N
        btnEditar.setText("Editar Remédio");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);
        btnEditar.setBounds(30, 430, 150, 40);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/accept.png"))); // NOI18N
        btnSalvar.setText("Salvar Registro");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(30, 570, 150, 40);

        txtRm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRmActionPerformed(evt);
            }
        });
        jPanel1.add(txtRm);
        txtRm.setBounds(20, 230, 170, 30);

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        jPanel1.add(txtQtd);
        txtQtd.setBounds(20, 300, 170, 30);

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Remédio:");
        jPanel1.add(lblNome);
        lblNome.setBounds(80, 210, 60, 20);

        lblDiretor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDiretor.setForeground(new java.awt.Color(255, 255, 255));
        lblDiretor.setText("Quantidade:");
        jPanel1.add(lblDiretor);
        lblDiretor.setBounds(70, 280, 80, 20);

        txtIdEscola.setText("0");
        txtIdEscola.setEnabled(false);
        txtIdEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEscolaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdEscola);
        txtIdEscola.setBounds(10, 690, 27, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/logo.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 10, 130, 130);

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Farmácia do Bem");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 130, 15);

        painelJanelaEscola.add(jPanel1);
        jPanel1.setBounds(0, 0, 210, 720);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/Fundo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        painelJanelaEscola.add(jLabel2);
        jLabel2.setBounds(210, 0, 1070, 720);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(48, 50, 52));
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu3.setForeground(new java.awt.Color(48, 50, 52));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-cardápio-30.png"))); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-comprimidos-30.png"))); // NOI18N
        jMenu2.setText("MEDICAMENTOS");

        ESTOQUE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-medication-30.png"))); // NOI18N
        ESTOQUE.setText("ESTOQUE");
        ESTOQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTOQUEActionPerformed(evt);
            }
        });
        jMenu2.add(ESTOQUE);

        SAIDAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-comprar-20.png"))); // NOI18N
        SAIDAS.setText("SAIDAS");
        SAIDAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIDASActionPerformed(evt);
            }
        });
        jMenu2.add(SAIDAS);

        jMenu3.add(jMenu2);

        CADASTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Galery/icons8-página-inicial-30.png"))); // NOI18N
        CADASTRO.setText("INÍCIO");
        CADASTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTROActionPerformed(evt);
            }
        });
        jMenu3.add(CADASTRO);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelJanelaEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelJanelaEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        //Habilita todos os campos de texto
        this.txtRm.setEnabled(true);
        this.txtQtd.setEnabled(true);
        this.btnSalvar.setEnabled(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed
  private void atualizaTabela(TabelasDB escolaDao)
    {
        try
        {
            
            this.txtIdEscola.setText("0");

            limparTabela();
            
            ArrayList<FarmStrings> listaFarmacia;
            listaFarmacia = escolaDao.consultar(); //consulta todos os registros da tabela Escola
            
            //Resgata o modelo da tabela            
            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaEscola.getModel();

            for(FarmStrings escola : listaFarmacia)
            {
                //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaEscolas
                modeloTabela.addRow(new String[]{Integer.toString(escola.getIdEscola()), escola.getRm(),
                Integer.toString(escola.getQtd())});
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }
  
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
              int linhaSelecionada = tabelaEscola.getSelectedRow(); //resgata o número da linha selecionada na tabela
        
        if(linhaSelecionada == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um Remédio para edição!", "ATENÇÃO!", WARNING_MESSAGE);
        }
        else
        {
            //colocando nos campos textos todos os dados da linha selecionada na tabela, para que possa ser editado
            this.txtIdEscola.setText(tabelaEscola.getValueAt(linhaSelecionada, 0).toString());
            this.txtRm.setText(tabelaEscola.getValueAt(linhaSelecionada, 1).toString());
            this.txtQtd.setText(tabelaEscola.getValueAt(linhaSelecionada, 2).toString());

            
            habilitarCampos(); //habilita os campos para edição
            btnSalvar.setEnabled(true); //habilita o botão salvar
        }
    }//GEN-LAST:event_btnEditarActionPerformed
 private void habilitarCampos()
    {
        //habilitando para edição os campos textos
        this.txtRm.setEnabled(true);
        this.txtQtd.setEnabled(true);
        this.btnSalvar.setEnabled(true);
       
    }
 
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
     
       
        try
        {
            int linhaSelecionada = tabelaEscola.getSelectedRow(); //resgata o número da linha selecionada na tabela

            if(linhaSelecionada == -1)
            {
                JOptionPane.showMessageDialog(null, "Selecione uma Escola para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            }
            else
            {
                //resgata o conteúdo da primeira coluna da linha selecioanda
                this.txtIdEscola.setText(tabelaEscola.getValueAt(linhaSelecionada, 0).toString());
                
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                
                //se for igual a 0 siginifica que clicou em SIM
                if(opcao == 0)
                {
                    TabelasDB escolaDao = new TabelasDB(); 
                    //chama o metodo excuirID passando o identificador do registro selecionado anteriormente
                    escolaDao.excluirID(Integer.parseInt(this.txtIdEscola.getText()));

                    atualizaTabela(escolaDao);
                }
             }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed
    private void limparTabela()
    {
        //percorre a tabela e exclui todas as linhas
        while(tabelaEscola.getRowCount() > 0) 
        {
            DefaultTableModel dm = (DefaultTableModel) tabelaEscola.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
     private void limparDesabilitarCampos()
    {
        //limpando todos os campos textos
        this.txtIdEscola.setText("0");
        this.txtRm.setText("");
        this.txtQtd.setText("");
       
        
        //desabilitando para edição os campos textos
        this.txtRm.setEnabled(false);
        this.txtQtd.setEnabled(false);
        this.btnSalvar.setEnabled(false);
      
    }
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
  
        try
        {
            //instancia um objeto escola
            FarmStrings escola = new FarmStrings();
            
            //faz a atribuição dos campos da tela para o objeto
            escola.setIdEscola(Integer.parseInt(txtIdEscola.getText()));
            escola.setRm(txtRm.getText());
            escola.setQtd(Integer.parseInt(txtQtd.getText()));


            //instancia um objeto EscolaDao que será usado para comunicar com o banco
            TabelasDB escolaDao = new TabelasDB();
            
            //se o campo do IdEscola da tela for 0, significa que está criando um novo registro
            //se não, significa que está alterando um novo registro
            if(escola.getIdEscola() == 0)
            {
                //envia o objeto escola para o método inserir, onde será feito a inserção no banco
                escolaDao.inserir(escola);
                JOptionPane.showMessageDialog(null, "Escola salva com sucesso!", "", INFORMATION_MESSAGE);
            }
            else
            {
                //envia o objeto escola para o método alterar, onde será feito a alteração no banco
                escolaDao.alterar(escola);
                JOptionPane.showMessageDialog(null, "Escola alterada com sucesso!", "", INFORMATION_MESSAGE);
            }
            
            limparDesabilitarCampos(); //chama método para voltar os campos para não edição
            btnSalvar.setEnabled(false); //desabilita o botão Salvar
            
            atualizaTabela(escolaDao); //atualiza todos os dados da tabela novamente
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void txtRmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRmActionPerformed

    private void txtIdEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEscolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEscolaActionPerformed

    private void CADASTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTROActionPerformed
        new MENU1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CADASTROActionPerformed

    private void ESTOQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTOQUEActionPerformed
       // new ESTOQUE2().setVisible(true);
       new Estoque().setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_ESTOQUEActionPerformed

    private void SAIDASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIDASActionPerformed
        new Saida().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SAIDASActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CADASTRO;
    private javax.swing.JMenuItem ESTOQUE;
    private javax.swing.JMenuItem SAIDAS;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDiretor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel painelJanelaEscola;
    private javax.swing.JScrollPane painelTabela;
    public javax.swing.JTable tabelaEscola;
    private javax.swing.JTextField txtIdEscola;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtRm;
    // End of variables declaration//GEN-END:variables
}
