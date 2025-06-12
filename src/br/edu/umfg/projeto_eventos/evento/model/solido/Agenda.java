package br.edu.umfg.projeto_eventos.evento.model.solido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Palestra> palestras = new ArrayList<>();
    private Set<Palestra> vPalestras = new HashSet<>();
    private List<MiniCurso> miniCursos = new ArrayList<>();
    private Set<MiniCurso> vMinicurso = new HashSet<>();
    private List<Seminario> seminarios = new ArrayList<>();
    private Set<Seminario> vSeminarios = new HashSet<>();
    private List<Workshop> workshops = new ArrayList<>();
    private Set<Workshop> vWorkshops = new HashSet<>();

    public Agenda(String descricao, LocalDate dataInicio, LocalDate dataFim, List<Palestra> palestras, Set<Palestra> vPalestras, List<MiniCurso> miniCursos, Set<MiniCurso> vMinicurso, List<Seminario> seminarios, Set<Seminario> vSeminarios, List<Workshop> workshops, Set<Workshop> vWorkshops) {
        setNome(descricao);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setPalestras(palestras);
        setvPalestras(vPalestras);
        setMiniCursos(miniCursos);
        setvMinicurso(vMinicurso);
        setSeminarios(seminarios);
        setvSeminarios(vSeminarios);
        setWorkshops(workshops);
        setvWorkshops(vWorkshops);
    }

    public Agenda(Agenda agenda) {
        this.nome = agenda.getNome();
        this.dataInicio = agenda.getDataInicio();
        this.dataFim = agenda.getDataFim();
        this.palestras = agenda.getPalestras();
        this.vPalestras = agenda.getvPalestras();
        this.miniCursos = agenda.getMiniCursos();
        this.vMinicurso = agenda.getvMinicurso();
        this.seminarios = agenda.getSeminarios();
        this.vSeminarios = agenda.getvSeminarios();
        this.workshops = agenda.getWorkshops();
        this.vWorkshops = agenda.getvWorkshops();
    }

    public Agenda(String descricao, LocalDate dataInicio, LocalDate dataFim){
        this.nome = descricao;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String descricao) {
        this.nome = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(List<Palestra> palestras) {
        this.palestras = palestras;
    }

    public Set<Palestra> getvPalestras() {
        return vPalestras;
    }

    public void setvPalestras(Set<Palestra> vPalestras) {
        this.vPalestras = vPalestras;
    }

    public List<MiniCurso> getMiniCursos() {
        return miniCursos;
    }

    public void setMiniCursos(List<MiniCurso> miniCursos) {
        this.miniCursos = miniCursos;
    }

    public Set<MiniCurso> getvMinicurso() {
        return vMinicurso;
    }

    public void setvMinicurso(Set<MiniCurso> vMinicurso) {
        this.vMinicurso = vMinicurso;
    }

    public List<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(List<Seminario> seminarios) {
        this.seminarios = seminarios;
    }

    public Set<Seminario> getvSeminarios() {
        return vSeminarios;
    }

    public void setvSeminarios(Set<Seminario> vSeminarios) {
        this.vSeminarios = vSeminarios;
    }

    public List<Workshop> getWorkshops() {
        return workshops;
    }

    public void setWorkshops(List<Workshop> workshops) {
        this.workshops = workshops;
    }

    public Set<Workshop> getvWorkshops() {
        return vWorkshops;
    }

    public void setvWorkshops(Set<Workshop> vWorkshops) {
        this.vWorkshops = vWorkshops;
    }
}
