package entidades;


import java.util.Date;


public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Date dataAdmissao;
    private double salario;
    private boolean clt;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Date dataNascimento, Date dataAdmissao, double salario, boolean clt) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.clt = clt;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean getClt() {
        return clt;
    }

    public void setClt(boolean clt) {
        this.clt = clt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario + ", clt=" + clt + '}';
    }
    
}
