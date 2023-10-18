package br.com.fescfafic.sistemaescola.Model.Sistema;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoANotas;

public class SistemaNotas {

    public void alterarNota(IAcessoANotas utilizador){
        utilizador.alterarNota();
    }

    public void atribuirNota(IAcessoANotas utilizador){
        utilizador.atribuirNota();
    }

}
