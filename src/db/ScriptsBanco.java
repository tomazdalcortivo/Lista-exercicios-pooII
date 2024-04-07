package db;

import entidades.Funcionario;
import java.util.List;

public interface ScriptsBanco {

    void insert(Funcionario obj);

    void update(Funcionario obj);

    void deleteById(int id);

    Funcionario buscarPorId(int id);

    Funcionario buscarPorNome(String nome);

    List<Funcionario> buscarTodos();
}
