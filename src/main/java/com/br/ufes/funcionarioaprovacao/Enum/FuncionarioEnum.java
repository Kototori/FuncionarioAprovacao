package com.br.ufes.funcionarioaprovacao.Enum;

public enum FuncionarioEnum {

    GERENTE_IMEDIATO("gerente imediato", 500.00),
    GERENTE_GERAL("gerente geral", 1500.00),
    DIRETOR_FINANCEIRO("diretor financeiro", 5000.00),
    DIRETOR_GERAL("diretor geral", 15000.00);

    private String cargo;
    private Double valor;

    FuncionarioEnum(String cargo,Double valor) {
        this.cargo = cargo;
        this.valor = valor;
    }

    
     public String getCargo() {
        return cargo;

    }
    public Double getValor() {
        return valor;

    }
}
