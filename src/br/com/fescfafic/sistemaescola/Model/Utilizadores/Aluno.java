package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAoBoletim;

public class Aluno extends Utilizador implements IAcessoAoBoletim {

    public Aluno(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void visulizarBoletim() {
        System.out.println("Aluno visualizou boletim.");
    }

    @Override
    public void login() {
        System.out.println("Aluno entrou no sistema.");
    }

    @Override
    public void logout() {
        System.out.println("Aluno saiu do sistema.");
    }

}