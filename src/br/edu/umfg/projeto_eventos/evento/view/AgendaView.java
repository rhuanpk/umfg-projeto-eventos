package br.edu.umfg.projeto_eventos.evento.view;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class AgendaView {
    private Scanner scanner = new Scanner(System.in);

    public void printDescricao(String descricao){

    }

    public String readDescricao(){
		return null;

    }

    public void printDataInicio(LocalDateTime dataInicio){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data final: " + dataInicio.format(formatter));
    }

    public LocalDateTime readDataInicio(){
    	System.out.println("Informe uma data fim ('DD/MM/YYYY'): ");
    	String dataInicio = scanner.next();
    	System.out.println("Informe um horário para a data fim ('HH:mm'): ");
    	dataInicio += " " + scanner.next();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraInicio = LocalDateTime.parse(dataInicio, formatter);
    	return dataHoraInicio;
    }

    public void printDataFim(LocalDateTime dataFim){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Data final: " + dataFim.format(formatter));
    }

    public LocalDateTime readDataFim(){
    	System.out.println("Informe uma data fim ('DD/MM/YYYY'): ");
    	String dataFim = scanner.next();
    	System.out.println("Informe um horário para a data fim ('HH:mm'): ");
    	dataFim += " " + scanner.next();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraFim = LocalDateTime.parse(dataFim, formatter);
    	return dataHoraFim;
    }
    
    public String readNome() {
    	System.out.println("Informe um nome: ");
    	return scanner.next();
    }
    
    public void printNome(String nome) {
    	System.out.println("Nome: " + nome);
    }
    
    public void printErro(Exception e) {
    	
    }

}