package dev.gustavdias.springjavacleanarchitecture.escola.aplicacao.aluno.matricular;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    // COMMAND
    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorioDeAlunos.matricular(novo);
    }
}
