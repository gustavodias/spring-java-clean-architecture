package dev.gustavdias.springjavacleanarchitecture.escola.infra;

import java.util.ArrayList;
import java.util.List;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.AlunoNaoEncontrado;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.CPF;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos{

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return this.matriculados.stream()
        .filter(a -> a.getCpf().equals(cpf.getNumero()))
        .findFirst()
        .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }
    
}
