package br.edu.umfg.projeto_eventos.evento.model.solido;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.edu.umfg.projeto_eventos.evento.model.abstrato.Evento;

public class MiniCurso extends Evento {
	private List<String> materiaisDidaticos = new ArrayList<String>();
	private List<String> preRequisitos = new ArrayList<String>();
	private Boolean certificadoDisponivel;
	
	public MiniCurso(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, String material,
			String preRequisito, Boolean certificadoDisponivel) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		addMaterial(material);
		addRequisito(preRequisito);
	}
	
	public MiniCurso(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao, List<String> materiais,
			List<String> preRequisitos, Boolean certificadoDisponivel) throws NoSuchAlgorithmException {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, valorInscricao, dataLimiteInscricao);
		setMateriaisDidaticos(materiais);
		setCertificadoDisponivel(certificadoDisponivel);
	}
	
	public MiniCurso(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String local, Integer vagas, String status, Float valorInscricao, Boolean aberto, String cod,
			LocalDateTime dataLimiteInscricao, List<Inscricao> inscricoes, Set<Inscricao> vInscricoes,
			List<Apresentador> apresentadores, Set<Apresentador> vApresentadores, List<String> materiais,
			List<String> preRequisitos, Boolean certificadoDisponivel) {
		super(nome, descricao, dataHoraInicio, dataHoraFim, local, vagas, status, valorInscricao, aberto, cod,
				dataLimiteInscricao, inscricoes, vInscricoes, apresentadores, vApresentadores);
		this.certificadoDisponivel = certificadoDisponivel;
		this.preRequisitos = preRequisitos;
		this.certificadoDisponivel = certificadoDisponivel;
	}
	public List<String> getMateriaisDidaticos() {
		return materiaisDidaticos;
	}
	public void setMateriaisDidaticos(List<String> materiaisDidaticos) {
		this.materiaisDidaticos = materiaisDidaticos;
	}
	public List<String> getPreRequisitos() {
		return preRequisitos;
	}
	public void setPreRequisitos(List<String> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}
	public Boolean getCertificadoDisponivel() {
		return certificadoDisponivel;
	}
	public void setCertificadoDisponivel(Boolean certificadoDisponivel) {
		this.certificadoDisponivel = certificadoDisponivel;
	}
	public void addMaterial(String mateirial) {
		
	}
	public void addRequisito(String requisito) {
		
	}
	
	
	
	
}
