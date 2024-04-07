package aplicacao.frame;

import entidades.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import entidades.dao.FuncionarioDao;
import db.Transmission;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaFuncionario extends javax.swing.JFrame {

    public TelaFuncionario() {
        initComponents();
    }

    public TelaFuncionario(Funcionario f) {
        initComponents();
        jTextFieldNomeCompleto.setText(String.valueOf(f.getNome()));
        jTextFieldDataNascimento.setText(String.valueOf(f.getDataNascimento()));
        jTextFieldCpf.setText(String.valueOf(f.getCpf()));
        jTextFieldClt.setText(String.valueOf(f.getClt()));
        jTextFieldDataAdmissao.setText(String.valueOf(f.getDataAdmissao()));
        jTextFieldSalario.setText(String.valueOf(f.getSalario()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButton2Salvar = new javax.swing.JButton();
        lblNomeCompleto = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblDataAdmissao = new javax.swing.JLabel();
        ldlCpf = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblClt = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldDataAdmissao = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        jTextFieldClt = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("clique para cancelar ");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(20, 290, 100, 23);

        jButton2Salvar.setText("Salvar");
        jButton2Salvar.setToolTipText("clique aqui para salvar");
        jButton2Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Salvar);
        jButton2Salvar.setBounds(140, 290, 100, 23);

        lblNomeCompleto.setText("Nome completo");
        getContentPane().add(lblNomeCompleto);
        lblNomeCompleto.setBounds(30, 20, 90, 20);

        lblDataNascimento.setText("Data Nascimento");
        getContentPane().add(lblDataNascimento);
        lblDataNascimento.setBounds(30, 60, 100, 16);

        lblDataAdmissao.setText("Data admissao");
        getContentPane().add(lblDataAdmissao);
        lblDataAdmissao.setBounds(30, 140, 90, 16);

        ldlCpf.setText("CPF");
        getContentPane().add(ldlCpf);
        ldlCpf.setBounds(30, 100, 70, 16);

        lblSalario.setText("Salario");
        getContentPane().add(lblSalario);
        lblSalario.setBounds(30, 180, 50, 16);

        lblClt.setText("CLT");
        getContentPane().add(lblClt);
        lblClt.setBounds(30, 220, 30, 16);

        jTextFieldNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCompletoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNomeCompleto);
        jTextFieldNomeCompleto.setBounds(150, 20, 80, 22);

        jTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataNascimento);
        jTextFieldDataNascimento.setBounds(150, 60, 80, 20);

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCpf);
        jTextFieldCpf.setBounds(150, 100, 80, 22);

        jTextFieldDataAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataAdmissaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataAdmissao);
        jTextFieldDataAdmissao.setBounds(150, 140, 80, 22);
        getContentPane().add(jTextFieldSalario);
        jTextFieldSalario.setBounds(150, 180, 80, 22);
        getContentPane().add(jTextFieldClt);
        jTextFieldClt.setBounds(150, 220, 80, 22);

        setSize(new java.awt.Dimension(311, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNascimentoActionPerformed

    private void jTextFieldDataAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataAdmissaoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCompletoActionPerformed

    private void jButton2SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SalvarActionPerformed
        try {
            Transmission conexao = new Transmission();
            Connection conn = conexao.Connect();

            String nome = jTextFieldNomeCompleto.getText();
            String cpf = jTextFieldCpf.getText();
            boolean clt = Boolean.parseBoolean(jTextFieldClt.getText());
            double salario = Double.parseDouble(jTextFieldSalario.getText());
            Date dataAdmissao = new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDataAdmissao.getText());
            Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(jTextFieldDataNascimento.getText());

            Funcionario funcionario = new Funcionario(nome, cpf, dataNascimento, dataAdmissao, salario, clt);

            FuncionarioDao fd = new FuncionarioDao(conn);
            fd.insert(funcionario);

            JOptionPane.showMessageDialog(this, "funcionario salvo com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Formato de número inválido", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(this, "Formato de número invalido", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar funcionário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2SalvarActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Salvar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClt;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDataAdmissao;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JLabel lblClt;
    private javax.swing.JLabel lblDataAdmissao;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel ldlCpf;
    // End of variables declaration//GEN-END:variables
}
