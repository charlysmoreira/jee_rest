package com.uece.jeerest.model.strategy;

import com.uece.jeerest.enumerations.Cargo;

public class Venda {
	
	private final Funcionario funcionario;
    private final int valor;
    
    public Venda(Funcionario funcionario, int valor) {
        this.funcionario = funcionario;
        this.valor = valor;
   }

   public double calculaComissao() {
        double comissao = 0.0;
        Cargo cargo = this.funcionario.getCargo();
        comissao = cargo.execute(valor);
        return comissao;
   }

}
