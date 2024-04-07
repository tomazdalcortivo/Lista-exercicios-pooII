package entidades.dao;

import db.ScriptsBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Funcionario;
import db.Transmission;

public class FuncionarioDao implements ScriptsBanco{

    private Connection conexao;

    public FuncionarioDao(Connection conn) {
        this.conexao = conn;
    }

    public void createTbFuncionario() {
        try (PreparedStatement st = conexao.prepareStatement(
                "CREATE TABLE IF NOT EXISTS funcionario ("
                + "id INT NOT NULL AUTO_INCREMENT, "
                + "nome VARCHAR(50), "
                + "dataNascimento DATE, "
                + "cpf CHAR(16), "
                + "dataAdmissao DATE, "
                + "salario DOUBLE, "
                + "clt BOOLEAN, "
                + "PRIMARY KEY (id))")) {

            st.executeUpdate();
            System.out.println("Tabela funcionario criada com sucesso.");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar tabela funcionario: " + e.getMessage(), e);
        }
    }

    public void insert(Funcionario obj) {
        try (PreparedStatement st = conexao.prepareStatement(
                "INSERT INTO funcionario (nome, dataNascimento, cpf, dataAdmissao, salario, clt) "
                + "VALUES (?, ?, ?, ?, ?, ?)")) {

            st.setString(1, obj.getNome());
            st.setDate(2, new java.sql.Date(obj.getDataNascimento().getTime()));
            st.setString(3, obj.getCpf());
            st.setDate(4, new java.sql.Date(obj.getDataAdmissao().getTime()));
            st.setDouble(5, obj.getSalario());
            st.setBoolean(6, obj.getClt());

            int linhasAfetadas = st.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Funcionario inserido com sucesso");
            } else {
                System.out.println("Nenhum registro inserido");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir funcionario: " + e.getMessage(), e);
        }
    }

    public void update(Funcionario obj) {
        try (PreparedStatement st = conexao.prepareStatement(
                "insert into funcionario "
                + "set nome = ? , dataNascimento = ? , dataAdmissao = ? , salario = ? , clt = ?"
                + "whare id = ?")) {

            st.setString(1, obj.getNome());
            st.setDate(2, new java.sql.Date(obj.getDataNascimento().getTime()));
            st.setDate(3, new java.sql.Date(obj.getDataAdmissao().getTime()));
            st.setDouble(4, obj.getSalario());
            st.setBoolean(5, obj.getClt());

            int linhasAfetadas = st.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Funcionario inserido com sucesso");
            } else {
                System.out.println("Nenuhm registro inserido");
            }

        } catch (SQLException e) {
            throw new RuntimeException("erro ao inserir funcionario " + e.getMessage());
        }
    }

    public void deleteById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conexao.prepareStatement(
                    "delete from funcionario where id = ?");
            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            Transmission.closePreparedStatement(st);
            Transmission.closeResultSet(rs);
        }
    }

    public Funcionario buscarPorId(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Funcionario func;
        try {
            st = conexao.prepareStatement(
                    "select (nome, dataNascimento, dataAdmissao, salario, clt) "
                    + "from funcionario "
                    + "where id = ? "
                    + "order by id");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                func = new Funcionario();
                func.setId(id);
                func.setNome(rs.getString("nome"));
                func.setDataNascimento(rs.getDate("dataNascimento"));
                func.setDataAdmissao(rs.getDate("dataAdmissao"));
                func.setSalario(rs.getDouble("salario"));
                func.setClt(rs.getBoolean("clt"));
                return func;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar ao funcionario " + e.getMessage(), e);
        } finally {
            Transmission.closeResultSet(rs);
            Transmission.closePreparedStatement(st);
        }

    }

    public Funcionario buscarPorNome(String nome) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Funcionario func;
        try {
            st = conexao.prepareStatement(
                    "select * "
                    + "from funcionario "
                    + "where name = ? "
                    + "order by nome");
            st.setString(1, nome);
            rs = st.executeQuery();

            if (rs.next()) {
                func = new Funcionario();
                func.setNome(nome);
                func.setId(rs.getInt("id"));
                func.setDataNascimento(rs.getDate("dataNascimento"));
                func.setDataAdmissao(rs.getDate("dataAdmissao"));
                func.setSalario(rs.getDouble("salario"));
                func.setClt(rs.getBoolean("clt"));
                return func;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar ao funcionario " + e.getMessage(), e);
        } finally {
            Transmission.closeResultSet(rs);
            Transmission.closePreparedStatement(st);
        }

    }

    public List<Funcionario> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conexao.prepareStatement(
                    "select * from funcionario");
            st.executeQuery();

            List<Funcionario> funcionarios = new ArrayList<>();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setDataNascimento(rs.getDate("dataNascimento"));
                funcionario.setDataAdmissao(rs.getDate("dataAdmissao"));
                funcionario.setSalario(rs.getDouble("salario"));
                funcionario.setClt(rs.getBoolean("clt"));

                funcionarios.add(funcionario);
                return funcionarios;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            Transmission.closePreparedStatement(st);
            Transmission.closeResultSet(rs);
        }
    }
}
