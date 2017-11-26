package com.uece.jeerest.controlls;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.uece.jeerest.model.strategy.Funcionario;
import com.uece.jeerest.service.ServiceRest;

@RestController
public class ControllerRest {

	@Autowired
	private ServiceRest serviceRest;

	@GetMapping("/funcionarios/{funcionaroId}")
	public Funcionario getFuncionario(@PathVariable int funcionaroId) {
		return serviceRest.listarFuncionarios().get(funcionaroId);
	}

	//Padrao Strategy
	@GetMapping("/funcionarios")
	public List<Funcionario> listarFuncionarios() {
		return serviceRest.listarFuncionarios();
	}

	//Padrao Builder
	@GetMapping("/pessoa")
	public Map<String, String> getPessoa() {
		return serviceRest.getPessoa();
	}
	
	//Padrao Facade
	@GetMapping("/desenhar/{tipo}")
	public List<String> getDesenho(@PathVariable int tipo) {
		return serviceRest.getDesenho(tipo);
	}
}
