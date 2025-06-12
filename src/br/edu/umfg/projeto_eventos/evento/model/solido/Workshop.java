package br.edu.umfg.projeto_eventos.evento.model.solido;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.edu.umfg.projeto_eventos.evento.model.abstrato.Evento;

public class Workshop extends Evento {
	private List<String> ferramentasNecessarias = new ArrayList<String>();
	private Integer numeroDeAtividades;
	private String objetivoDoWorkshop;
	
	public Workshop(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, String ferramenta,
			Integer nrmAtividades, String objetivo) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		addFerramenta(ferramenta);
		setNumeroDeAtividades(nrmAtividades);
		setObjetivoDoWorkshop(objetivo);
	}
	
	public Workshop(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, List<String> ferramentas,
			Integer nrmAtividades, String objetivo) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		setFerramentasNecessarias(ferramentas);
		setNumeroDeAtividades(nrmAtividades);
		setObjetivoDoWorkshop(objetivo);
	}
	
	public Workshop(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, String status, Float valorInscricao, Boolean aberto, String cod,
			LocalDateTime dataLimiteInscricao, List<Inscricao> inscricoes, Set<Inscricao> vInscricoes,
			List<Apresentador> apresentadores, Set<Apresentador> vApresentadores, List<String> ferramentas, 
			Integer nrmAtividades, String objetivo) {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, status, valorInscricao, aberto, cod,
				dataLimiteInscricao, inscricoes, vInscricoes, apresentadores, vApresentadores);
		this.ferramentasNecessarias = ferramentas;
		this.numeroDeAtividades = nrmAtividades;
		this.objetivoDoWorkshop = objetivo;
	}
	public List<String> getFerramentasNecessarias() {
		return ferramentasNecessarias;
	}
	public void setFerramentasNecessarias(List<String> ferramentasNecessarias) throws IllegalArgumentException{
		if (ferramentasNecessarias == null){
			throw new IllegalArgumentException("Ferramentas não podem ser nulo.");
		}
		this.ferramentasNecessarias = ferramentasNecessarias;
	}
	public Integer getNumeroDeAtividades() {
		return numeroDeAtividades;
	}
	public void setNumeroDeAtividades(Integer numeroDeAtividades) throws IllegalArgumentException{
		if (numeroDeAtividades == null){
			throw new IllegalArgumentException("As Atividades não podem ser nulo.");
		}
		if (numeroDeAtividades <= 0){
			throw new IllegalArgumentException("Deve haver ao minimo uma atividade.");
		}
		this.numeroDeAtividades = numeroDeAtividades;
	}
	public String getObjetivoDoWorkshop() {
		return objetivoDoWorkshop;
	}
	public void setObjetivoDoWorkshop(String objetivoDoWorkshop) throws IllegalArgumentException{
		if (objetivoDoWorkshop == null || objetivoDoWorkshop.isBlank()){
			throw new IllegalArgumentException("Os Objetivos não podem ser nulo.");
		}
		this.objetivoDoWorkshop = objetivoDoWorkshop;
	}
	public void addFerramenta(String ferramenta) throws IllegalArgumentException{
		if (this.ferramentasNecessarias.contains(ferramenta)){
			throw new IllegalArgumentException("Essa Ferramenta já foi adicionada.");
		}
		else {
			this.ferramentasNecessarias.add(ferramenta);
		}
	}
	
}
