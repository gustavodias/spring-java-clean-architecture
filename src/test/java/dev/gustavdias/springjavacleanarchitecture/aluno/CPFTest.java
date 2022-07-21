package dev.gustavdias.springjavacleanarchitecture.aluno;

import org.junit.jupiter.api.Test;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.CPF;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }

}