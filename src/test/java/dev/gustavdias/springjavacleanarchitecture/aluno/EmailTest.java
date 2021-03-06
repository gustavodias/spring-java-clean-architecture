package dev.gustavdias.springjavacleanarchitecture.aluno;

import org.junit.jupiter.api.Test;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Email;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaPermitirCriarEmailComEnderecoValido() {
        String endereco = "fulano@gemerson.com.br";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }

}