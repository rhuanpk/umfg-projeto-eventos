package br.edu.umfg.projeto_eventos.evento.controller;

import br.edu.umfg.projeto_eventos.evento.model.dao.AgendaDao;
import br.edu.umfg.projeto_eventos.evento.model.solido.Agenda;
import br.edu.umfg.projeto_eventos.evento.view.AgendaView;

public class AgendaController {
	private AgendaDao dao;
	private AgendaView view;
	
	public void criarAgenda() {
		try {
			Agenda agenda = new Agenda(view.readNome(), view.readDataFim(), view.readDataInicio());
			
		} catch (IllegalArgumentException e) {
			view.printErro(e);
		}
		
	}

}
