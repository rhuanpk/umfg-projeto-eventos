package br.edu.umfg.projeto_eventos.evento.model.solido;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.edu.umfg.projeto_eventos.evento.model.abstrato.Evento;

public class Seminario extends Evento {
	private List<String> topicosCobertos = new ArrayList<String>();
	private Integer numeroDeSessoes;
	private Boolean incluiPainelDeDiscussao;
	private String organizadorInstitucional;
	
	public Seminario(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, String topico, Integer sessoes,
			Boolean discussao, String organizadorInstitucional) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		addTopico(topico);
		setNumeroDeSessoes(sessoes);
		setIncluiPainelDeDiscussao(discussao);
		setOrganizadorInstitucional(organizadorInstitucional);
	}
	
	public Seminario(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, List<String> topicos, Integer sessoes,
			Boolean discussao, String organizadorInstitucional) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		setTopicosCobertos(topicos);
		setNumeroDeSessoes(sessoes);
		setIncluiPainelDeDiscussao(discussao);
		setOrganizadorInstitucional(organizadorInstitucional);
	}
	
	public Seminario(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, String status, Float valorInscricao, Boolean aberto, String cod,
			LocalDateTime dataLimiteInscricao, List<Inscricao> inscricoes, Set<Inscricao> vInscricoes,
			List<Apresentador> apresentadores, Set<Apresentador> vApresentadores, List<String> topicos, Integer sessoes,
			Boolean discussao, String organizadorInstitucional) {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, status, valorInscricao, aberto, cod,
				dataLimiteInscricao, inscricoes, vInscricoes, apresentadores, vApresentadores);
		this.topicosCobertos = topicos;
		this.numeroDeSessoes = sessoes;
		this.organizadorInstitucional = organizadorInstitucional;
	}

	public List<String> getTopicosCobertos() {
		return topicosCobertos;
	}

	public void setTopicosCobertos(List<String> topicosCobertos) {
		this.topicosCobertos = topicosCobertos;
	}

	public Integer getNumeroDeSessoes() {
		return numeroDeSessoes;
	}

	public void setNumeroDeSessoes(Integer numeroDeSessoes) {
		this.numeroDeSessoes = numeroDeSessoes;
	}

	public Boolean getIncluiPainelDeDiscussao() {
		return incluiPainelDeDiscussao;
	}

	public void setIncluiPainelDeDiscussao(Boolean incluiPainelDeDiscussao) {
		this.incluiPainelDeDiscussao = incluiPainelDeDiscussao;
	}

	public String getOrganizadorInstitucional() {
		return organizadorInstitucional;
	}

	public void setOrganizadorInstitucional(String organizadorInstitucional) {
		this.organizadorInstitucional = organizadorInstitucional;
	}
	public void addTopico (String topico) {
		
	}
	
	
}
