package br.edu.umfg.projeto_eventos.evento.view;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public abstract class EventoView {
    private Scanner scanner = new Scanner(System.in);

    public String readNome(){
		return null;

    }

    public void printNome(){

    }

    public String readDescricao(){
		return null;

    }

    public void printDescricao(String descricao){

    }

    public LocalDateTime readDataHoraInicio(){
		return null;

    }

    public void printDataHoraInicio(LocalDateTime dataHora){

    }

    public LocalDateTime readDataHoraFim(){
		return null;

    }

    public void printDataHoraFim(LocalDateTime dataHora){

    }

    public Duration readDuracao(){
		return null;

    }

    public void printDuracao(Duration duracao){

    }

    public String readLocal(){
		return null;

    }

    public void printLocal(String local){

    }

    public Integer readVagas(){
		return null;

    }

    public void printVagas(Integer vagas){

    }

    public String readStatus(){
		return null;

    }

    public void printStatus(String status){

    }

    public Float readValorInscricao(){
		return null;

    }

    public void printValorInscricao(Float valorInscicao){

    }

    public boolean readAberto(){
		return false;

    }

    public void printAberto(boolean aberto){

    }

    public String readCod(){
		return null;

    }

    public void printCod(String cod){

    }

    public LocalDateTime readDataLimiteInscricao(){
		return null;

    }

    public void printDataLimiteIncricao(LocalDateTime dataLimite){

    }

}