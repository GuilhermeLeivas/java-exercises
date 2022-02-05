package br.com.leivas.exercise5;

import java.util.Arrays;

public class MensagemErro {

    private final String mensagemUsuario;
    private final String mensagemDesenvolvedor;

    public MensagemErro(Throwable ex) {
        this.mensagemUsuario = ex.getMessage() != null ? ex.getMessage() : ex.getCause().toString();
        this.mensagemDesenvolvedor = Arrays.toString(ex.getStackTrace());
    }

    @Override
    public String toString() {
        return String.format(
                "Mensagem usuário: %s\n" +
                        "Mensagem desenvolvedor: %s\n",
                this.mensagemUsuario, this.mensagemDesenvolvedor
        );
    }
}
