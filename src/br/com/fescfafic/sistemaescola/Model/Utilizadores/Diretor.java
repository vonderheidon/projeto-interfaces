package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAosCadastrosProfessores;

public class Diretor extends Utilizador implements IAcessoAosCadastrosProfessores {

    public Diretor(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void cadastrarProfessor() {
        System.out.println("Diretor esta cadastrando um professor.");
    }

    @Override
    public void alterarCadastroProfessor() {
        System.out.println("Diretor esta alterando os dados um professor.");
    }

    @Override
    public void exibirInfoProfessor() {
        System.out.println("Diretor esta visualizando o cadastro de um professor.");
    }

    @Override
    public void login() {
        System.out.println("Diretor entrou no sistema.");
    }

    @Override
    public void logout() {
        System.out.println("Diretor saiu do sistema.");
    }
}
