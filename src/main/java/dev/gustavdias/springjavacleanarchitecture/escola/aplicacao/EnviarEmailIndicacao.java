package dev.gustavdias.springjavacleanarchitecture.escola.aplicacao;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicacao);
}
