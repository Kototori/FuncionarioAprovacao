package com.br.ufes.funcionarioaprovacao.main;

import com.br.ufes.funcionarioaprovacao.model.Funcionario;
import com.br.ufes.funcionarioaprovacao.main.AprovacaoPagamento;

public class Cliente {

 public static void main(String[] arguments) {
        AprovacaoPagamento aprovacaoPagamento = new AprovacaoPagamento();
        Funcionario funcionario = new Funcionario("gerente geral");
        var valor = 100000.0;
        
       var test = aprovacaoPagamento.solicitarAprovacaoPagamento(funcionario, valor);
       
       if(test == true){
           System.out.println("Solicitação aprovada");
       }else{
            System.out.println("Solicitação rejeitada");
       }
    }
 
 

}
