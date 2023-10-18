package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAoFinanceiro;

public class Secretario extends Utilizador implements IAcessoAoFinanceiro {

    public Secretario(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void emitirBoleto() {
        System.out.println("Secretario esta emitindo boleto.");
    }

    @Override
    public void login() {
        System.out.println("Secretario entrou no sistema.");
    }

    @Override
    public void logout() {
        System.out.println("Secretario saiu do sistema.");
    }
}
