package observer;

import java.util.ArrayList;
import java.util.List;

import dados.Notificacao;
import dados.Tarefa;

public class ServicoNotificacao implements ObservadorTarefa{

	private static ServicoNotificacao instancia;
	private List<ObservadorTarefa> obervadores;
	
	private ServicoNotificacao () {
		this.obervadores = new ArrayList<>();
	}
	
	public static synchronized ServicoNotificacao getInstance() {
        if (instancia == null) {
            instancia = new ServicoNotificacao();
        }
        return instancia;
    }

    public void registrar(ObservadorTarefa obs) {
    	this.getObervadores().add(obs);
    }

    @Override
    public void atualizar(Tarefa tarefa) {
        Notificacao novaNotificacao = new Notificacao();
    }

	public static ServicoNotificacao getInstancia() {
		return instancia;
	}

	public static void setInstancia(ServicoNotificacao instancia) {
		ServicoNotificacao.instancia = instancia;
	}

	public List<ObservadorTarefa> getObervadores() {
		return obervadores;
	}

	public void setObervadores(List<ObservadorTarefa> obervadores) {
		this.obervadores = obervadores;
	}
}
