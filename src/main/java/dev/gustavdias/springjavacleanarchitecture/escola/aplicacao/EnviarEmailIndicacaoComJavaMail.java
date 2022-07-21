package dev.gustavdias.springjavacleanarchitecture.escola.aplicacao;

import dev.gustavdias.springjavacleanarchitecture.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao{

    @Override
    public void enviarPara(Aluno indicacao) {
        // logica de envio de email com a lib Java Mail
        
    }
    
}
