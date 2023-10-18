package br.com.fescfafic.sistemaescola.Model.Utilizadores;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAosCadastrosAlunos;

public class Coordenador extends Utilizador implements IAcessoAosCadastrosAlunos {

    public Coordenador(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void cadastrarAluno() {
        System.out.println("Coordenador esta cadastrando o aluno.");
    }

    @Override
    public void alterarCadastroAluno() {
        System.out.println("Coordenador esta alterando o cadastro do aluno.");
    }

    @Override
    public void exibirInfoAluno() {
        System.out.println("Coordenador esta visualizando o cadastro do aluno.");
    }

    @Override
    public void login() {
        System.out.println("Coordenador entrou no sistema.");
    }

    @Override
    public void logout() {
        System.out.println("Coordenador saiu do sistema.");
    }

}
