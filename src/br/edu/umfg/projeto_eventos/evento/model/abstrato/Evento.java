package br.edu.umfg.projeto_eventos.evento.model.abstrato;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.edu.umfg.projeto_eventos.evento.model.solido.Apresentador;
import br.edu.umfg.projeto_eventos.evento.model.solido.Inscricao;

public abstract class Evento {
	private String nome;
	private String descricao;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private Duration duracao;
	private String local;
	private Integer vagas;
	private String status;
	private Float valorInscricao;
	private Boolean aberto;
	private String cod;
	private LocalDateTime dataLimiteInscricao;
	private List<Inscricao> inscricoes = new ArrayList<Inscricao>();
	private Set<Inscricao> vInscricoes = new HashSet<Inscricao>();
	private List<Apresentador> apresentadores = new ArrayList<Apresentador>();
	private Set<Apresentador> vApresentadores = new HashSet<Apresentador>();
	
	public Evento(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String local, 
			Integer vagas, Float valorInscricao, LocalDateTime dataLimiteInscricao) throws NoSuchAlgorithmException{
		setNome(nome);
		setDescricao(descricao);
		setDataHoraInicio(dataHoraInicio);
		setDataHoraFim(dataHoraFim);
		setLocal(local);
		setVagas(vagas);
		setValorInscricao(valorInscricao);
		setDataLimiteInscricao(dataLimiteInscricao);
		setCod(gerarCod(descricao, 5));
		setDuracao(calcularDuracao(dataHoraInicio, dataHoraFim));
		
	}

	public Evento(String nome, String descricao, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String local,
			Integer vagas, String status, Float valorInscricao, Boolean aberto, String cod,
			LocalDateTime dataLimiteInscricao, List<Inscricao> inscricoes, Set<Inscricao> vInscricoes,
			List<Apresentador> apresentadores, Set<Apresentador> vApresentadores) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.local = local;
		this.vagas = vagas;
		this.status = status;
		this.valorInscricao = valorInscricao;
		this.aberto = aberto;
		this.cod = cod;
		this.dataLimiteInscricao = dataLimiteInscricao;
		this.inscricoes = inscricoes;
		this.vInscricoes = vInscricoes;
		this.apresentadores = apresentadores;
		this.vApresentadores = vApresentadores;
		this.duracao = calcularDuracao(dataHoraInicio, dataHoraFim);
	}
	
	public Evento(Evento evento) {
		super();
		this.nome = evento.getNome();
		this.descricao = evento.getDescricao();
		this.dataHoraInicio = evento.getDataHoraInicio();
		this.dataHoraFim = evento.getDataHoraFim();
		this.local = evento.getLocal();
		this.vagas = evento.getVagas();
		this.status = evento.getStatus();
		this.valorInscricao = evento.getValorInscricao();
		this.aberto = evento.getAberto();
		this.cod = evento.getCod();
		this.dataLimiteInscricao = evento.getDataLimiteInscricao();
		this.inscricoes = evento.getInscricoes();
		this.vInscricoes = evento.getvInscricoes();
		this.apresentadores = evento.getApresentadores();
		this.vApresentadores = evento.getvApresentadores();
		this.duracao = evento.getDuracao();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) throws IllegalArgumentException{
		if (local == null || local.isBlank()){
			throw new IllegalArgumentException("O Local não pode ser nulo.");
		}
		this.local = local;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) throws IllegalArgumentException{
		if (vagas == null){
			throw new IllegalArgumentException("As Vagas não podem ser nulo.");
		}
		if (vagas >= 0){
			throw new IllegalArgumentException("Deve haver no minimo 1 vaga.");
		}
		this.vagas = vagas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getValorInscricao() {
		return valorInscricao;
	}

	public void setValorInscricao(Float valorInscricao) throws IllegalArgumentException{
		if (valorInscricao == null){
			throw new IllegalArgumentException("O Local não pode ser nulo.");
		}
		if (valorInscricao < 0.01f){
			throw new IllegalArgumentException("O valor não pode ser menor que 0");
		}
		this.valorInscricao = valorInscricao;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) throws IllegalArgumentException{
		if (aberto == null){
			throw new IllegalArgumentException("O estado não pode ser nulo.");
		}
		this.aberto = aberto;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String gerarCod(String valorBase, int tamanho) throws NoSuchAlgorithmException{
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(valorBase.getBytes());

            BigInteger numero = new BigInteger(1, hash);

            String codigoNumerico = numero.toString(10);

            if (codigoNumerico.length() > tamanho) {
                codigoNumerico = codigoNumerico.substring(0, tamanho);
            } else {
                codigoNumerico = String.format("%1$" + tamanho + "s", codigoNumerico).replace(' ', '0');
            }

            return codigoNumerico;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash SHA-256", e);
        }
    }

	public LocalDateTime getDataLimiteInscricao() {
		return dataLimiteInscricao;
	}

	public void setDataLimiteInscricao(LocalDateTime dataLimiteInscricao) {
		this.dataLimiteInscricao = dataLimiteInscricao;
	}

	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public Set<Inscricao> getvInscricoes() {
		return vInscricoes;
	}

	public void setvInscricoes(Set<Inscricao> vInscricoes) {
		this.vInscricoes = vInscricoes;
	}

	public List<Apresentador> getApresentadores() {
		return apresentadores;
	}

	public void setApresentadores(List<Apresentador> apresentadores) {
		this.apresentadores = apresentadores;
	}

	public Set<Apresentador> getvApresentadores() {
		return vApresentadores;
	}

	public void setvApresentadores(Set<Apresentador> vApresentadores) {
		this.vApresentadores = vApresentadores;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}
	
	public Duration calcularDuracao(LocalDateTime inicio, LocalDateTime fim) {
		Duration duracao = Duration.between(inicio, fim);
		return duracao;
	}
}