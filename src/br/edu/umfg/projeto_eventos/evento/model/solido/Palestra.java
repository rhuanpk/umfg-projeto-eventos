package br.edu.umfg.projeto_eventos.evento.model.solido;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import br.edu.umfg.projeto_eventos.evento.model.abstrato.Evento;

public class Palestra extends Evento{
	private Boolean sessaoDePerguntas;
	private String publicoAlvo;
	
	public Palestra(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, Boolean sessaoDePerguntas, 
			String publicoAlvo) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		setSessaoDePerguntas(sessaoDePerguntas);
		setPublicoAlvo(publicoAlvo);
	}
	
	public Palestra(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, String status, Float valorInscricao, Boolean aberto, String cod,
			LocalDateTime dataLimiteInscricao, List<Inscricao> inscricoes, Set<Inscricao> vInscricoes,
			List<Apresentador> apresentadores, Set<Apresentador> vApresentadores, Boolean sessaoDePerguntas,
			String publicoAlvo) {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, status, valorInscricao, aberto, cod,
				dataLimiteInscricao, inscricoes, vInscricoes, apresentadores, vApresentadores);
		this.sessaoDePerguntas = sessaoDePerguntas;
		this.publicoAlvo = publicoAlvo;
	}
	
	public Boolean getSessaoDePerguntas() {
		return sessaoDePerguntas;
	}
	public void setSessaoDePerguntas(Boolean sessaoDePerguntas) {
		this.sessaoDePerguntas = sessaoDePerguntas;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	
}
