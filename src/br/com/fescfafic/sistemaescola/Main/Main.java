package br.com.fescfafic.sistemaescola.Main;

import br.com.fescfafic.sistemaescola.Model.Sistema.SistemaAutenticacao;
import br.com.fescfafic.sistemaescola.Model.Sistema.SistemaCadastro;
import br.com.fescfafic.sistemaescola.Model.Sistema.SistemaFinanceiro;
import br.com.fescfafic.sistemaescola.Model.Sistema.SistemaNotas;
import br.com.fescfafic.sistemaescola.Model.Utilizadores.*;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("aluno", "123");
        Coordenador coordenador = new Coordenador("coordenador", "123");
        Diretor diretor = new Diretor("diretor", "123");
        Professor professor = new Professor("professor", "123");
        Secretario secretario = new Secretario("secretario", "123");

        SistemaAutenticacao sistemaAutenticacao = new SistemaAutenticacao();
        SistemaCadastro sistemaCadastro = new SistemaCadastro();
        SistemaFinanceiro sistemaFinanceiro = new SistemaFinanceiro();
        SistemaNotas sistemaNotas = new SistemaNotas();

        sistemaAutenticacao.login(aluno);
        aluno.visulizarBoletim();
        aluno.logout();
        System.out.println();

        sistemaFinanceiro.emitirBoleto(secretario);
        sistemaCadastro.cadastrarAluno(coordenador);
        sistemaCadastro.cadastrarProfessor(diretor);
        sistemaNotas.alterarNota(professor);
    }
}