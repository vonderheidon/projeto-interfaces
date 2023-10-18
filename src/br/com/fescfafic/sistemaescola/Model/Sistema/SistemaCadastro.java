package br.com.fescfafic.sistemaescola.Model.Sistema;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAosCadastrosAlunos;
import br.com.fescfafic.sistemaescola.Contratos.IAcessoAosCadastrosProfessores;
import br.com.fescfafic.sistemaescola.Model.Utilizadores.Aluno;

public class SistemaCadastro {

    public void cadastrarAluno(IAcessoAosCadastrosAlunos utilizador) {
        utilizador.cadastrarAluno();
    }
    public void alterarCadastroAluno(IAcessoAosCadastrosAlunos utilizador){
        utilizador.alterarCadastroAluno();
    }
    public void exibirInfoAluno(IAcessoAosCadastrosAlunos utilizador){
        utilizador.exibirInfoAluno();
    }

    public void cadastrarProfessor(IAcessoAosCadastrosProfessores utilizador){
        utilizador.cadastrarProfessor();
    }
    public void alterarCadastroProfessor(IAcessoAosCadastrosProfessores utilizador){
        utilizador.alterarCadastroProfessor();
    }
    public void exibirInfoProfessor(IAcessoAosCadastrosProfessores utilizador){
        utilizador.exibirInfoProfessor();
    }

}
