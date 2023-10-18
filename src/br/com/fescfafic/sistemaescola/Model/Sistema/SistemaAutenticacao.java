package br.com.fescfafic.sistemaescola.Model.Sistema;

import br.com.fescfafic.sistemaescola.Model.Utilizadores.Utilizador;

public class SistemaAutenticacao {

    public void login(Utilizador utilizador) {
        utilizador.login();
    }

    public void logout(Utilizador utilizador) {
        utilizador.logout();
    }

}
