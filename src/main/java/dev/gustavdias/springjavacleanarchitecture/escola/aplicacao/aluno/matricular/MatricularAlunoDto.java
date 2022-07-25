package dev.gustavdias.springjavacleanarchitecture.escola.aplicacao.aluno.matricular;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.CPF;
import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Email;

public class MatricularAlunoDto {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    
    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }


    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }

    
}
