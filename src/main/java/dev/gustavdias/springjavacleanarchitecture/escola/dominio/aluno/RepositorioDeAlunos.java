package dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno;

import java.util.List;

// Inversão de dependencias

public interface RepositorioDeAlunos {
    
    void matricular(Aluno aluno);

    Aluno buscarPorCpf(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
