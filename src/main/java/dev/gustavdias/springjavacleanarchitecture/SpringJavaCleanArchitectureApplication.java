package dev.gustavdias.springjavacleanarchitecture;

import org.springframework.boot.SpringApplication;

import dev.gustavdias.springjavacleanarchitecture.escola.aplicacao.aluno.matricular.MatricularAluno;
import dev.gustavdias.springjavacleanarchitecture.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import dev.gustavdias.springjavacleanarchitecture.escola.infra.RepositorioDeAlunosEmMemoria;

public class SpringJavaCleanArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaCleanArchitectureApplication.class, args);
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulanoemail.com";

		MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
