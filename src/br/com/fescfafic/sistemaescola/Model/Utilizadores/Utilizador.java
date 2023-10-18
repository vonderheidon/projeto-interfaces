package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAoSistema;

public abstract class Utilizador implements IAcessoAoSistema {

    protected String login;
    protected String senha;

    public Utilizador(String login, String senha){
        this.senha = senha;
        this.login = login;
    }

    @Override
    public void login() {
        System.out.println("Utilizador Entrou");
    }

    @Override
    public void logout() {
        System.out.println("Utilizador Saiu");
    }

    @Override
    public String toString() {
        return "Utilizador{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

}
