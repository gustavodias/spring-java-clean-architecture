package dev.gustavdias.springjavacleanarchitecture.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.CPF;
import dev.gustavdias.springjavacleanarchitecture.escola.infra.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){
        //MOCK
       RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }
}
