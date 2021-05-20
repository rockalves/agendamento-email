package br.com.alura.job;

import java.util.List;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.entidade.AgendamentoEmail;
import br.com.alura.servico.AgendamentoEmailServico;

@Stateless
public class AgendamentoEmailJob {

	
	@Inject
	private AgendamentoEmailServico agendamentoEmailServico;

	@Schedule(hour="*", minute ="*", second = "*/7")
	public void enviarEmail() {
		List<AgendamentoEmail> listarPorNaoAgendado 
		= agendamentoEmailServico.listarPorNaoAgendado();
		listarPorNaoAgendado.forEach(emailNaoAgendado -> {
			agendamentoEmailServico.enviar(emailNaoAgendado);
			agendamentoEmailServico.alterar(emailNaoAgendado);
		});
		
	}
}
