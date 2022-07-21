package dev.gustavdias.springjavacleanarchitecture.escola.dominio.indicacao;

import java.time.LocalDateTime;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante, LocalDateTime dataIndicacao) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = dataIndicacao;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
}
