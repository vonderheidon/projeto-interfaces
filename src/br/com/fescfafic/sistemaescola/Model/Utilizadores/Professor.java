package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoANotas;
import br.com.fescfafic.sistemaescola.Contratos.IAcessoAoBoletim;

public class Professor extends Utilizador implements IAcessoANotas {

    public Professor(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void alterarNota() {
        System.out.println("Professor esta alterando nota do aluno.");
    }

    @Override
    public void atribuirNota() {
        System.out.println("Professor esta atribuindo nota ao aluno.");
    }

    @Override
    public void login() {
        System.out.println("Professor entrou no sistema.");
    }

    @Override
    public void logout() {
        System.out.println("Professor saiu do sistema.");
    }
}
