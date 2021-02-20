
package com.br.ufes.funcionarioaprovacao.main;

import com.br.ufes.funcionarioaprovacao.Enum.FuncionarioEnum;
import com.br.ufes.funcionarioaprovacao.model.Funcionario;


public class AprovacaoPagamento {
    public boolean solicitarAprovacaoPagamento(Funcionario funcionario, Double valor) {
       if(FuncionarioEnum.GERENTE_GERAL.getCargo() == funcionario.getCargo()){
           if(FuncionarioEnum.GERENTE_GERAL.getValor() > valor && valor > 0){
               return true;
           }else{
               return false;
           }
       }else if(FuncionarioEnum.GERENTE_IMEDIATO.getCargo() == funcionario.getCargo()){
           if(FuncionarioEnum.GERENTE_IMEDIATO.getValor() > valor && valor > 0){
               return true;
           }else{
               return false;
           }
       }else if(FuncionarioEnum.DIRETOR_FINANCEIRO.getCargo() == funcionario.getCargo()){
           if(FuncionarioEnum.DIRETOR_FINANCEIRO.getValor() > valor && valor > 0){
               return true;
           }else{
               return false;
           }
       }else if(FuncionarioEnum.DIRETOR_GERAL.getCargo() == funcionario.getCargo()){
           if(FuncionarioEnum.DIRETOR_GERAL.getValor() > valor && valor > 0){
               return true;
           }else{
               return false;
           }
       }else{
           return false;
       }      
    }
}
