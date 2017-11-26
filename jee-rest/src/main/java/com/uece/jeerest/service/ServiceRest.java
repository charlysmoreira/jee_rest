package com.uece.jeerest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.uece.jeerest.enumerations.Cargo;
import com.uece.jeerest.model.builder.Pessoa;
import com.uece.jeerest.model.facade.DesenhoImpl;
import com.uece.jeerest.model.strategy.Funcionario;
import com.uece.jeerest.model.strategy.Venda;

@Component
public class ServiceRest {

	private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	static {
		// Inicializa a carga dos dados
		Funcionario funcionario = new Funcionario("Jose ", Cargo.PRESIDENTE);
		funcionario.setSalario(new Venda(funcionario, 1500).calculaComissao());
		Funcionario funcionario2 = new Funcionario("Maria", Cargo.GERENTE);
		funcionario2.setSalario(new Venda(funcionario2, 1500).calculaComissao());

		funcionarios.add(funcionario);
		funcionarios.add(funcionario2);

	}

	public List<Funcionario> listarFuncionarios() {
		return funcionarios;
	}

	public Map<String, String> getPessoa() {
		Map<String, String> map = new HashMap<>();
		map.put("Jose",
				new Pessoa.PessoaBuilder("Jose", "434668868").dataNascimento("15/08/1981")
						.endereco("Rua Jose de Alencar, 1000").bairro("Centro").cidade("Fortaleza").estado("Ceara")
						.informacoes("Demais dados").build().toString());
		return map;
	}

	public List<String> getDesenho(int tipo) {
		DesenhoImpl desenho = new DesenhoImpl();
		List<String> result = new ArrayList<>();
		switch (tipo) {
		case 0:
			result.add(desenho.desenharCirculo());
			break;
		case 1:
			result.add(desenho.desenharRetangulo());
			break;
		}
		return result;
	}

}
