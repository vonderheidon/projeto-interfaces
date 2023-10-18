package br.com.fescfafic.sistemaescola.Model.Sistema;

import br.com.fescfafic.sistemaescola.Contratos.IAcessoAoFinanceiro;

public class SistemaFinanceiro {

    public void emitirBoleto(IAcessoAoFinanceiro utilizador){
        utilizador.emitirBoleto();
    }

}
