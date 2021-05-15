package br.com.alura.servico;

import java.util.List;

import javax.ejb.Stateless;

@Stateless

public class AgendamentoEmailServico {

	public List<String> listar() {
		return List.of("andreralves@hotmail.com");
	}

}
