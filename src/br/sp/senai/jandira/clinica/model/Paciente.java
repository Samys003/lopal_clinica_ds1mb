package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente { 
	
	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;
	
	public void setNome (String nome) {
		if(nome.length() > 3) {
			this.nome = nome;
		} else {
		   System.out.println("o nome deve conter mais que 3 caracteres");
	}
	
	public void setPeso(double peso) {
		
		if(peso > 0) {
			//verdade
			this.peso = peso;
		} else {
			//falso
			System.out.println("O peso deve ser maior do que ZERO!");
		}
		
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double setAltura(double altura) {
		
		if(altura > 0.5) {
			//verdade
			this.altura = altura;
		} else {
			//falso
			System.out.println("A altura deve ser maior do que 0,5m");
		}
		return altura;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void marcarConsulta(){
	}
	
	public void calcularIdade(){
		
	}
	
	public void calcularImc() {
		double imc = peso / altura*altura;
		
	}
	
	public void classificarImc() {
		
	}
	
	public void exibirDados() {
		String unidadePeso = "Kg.";
		String unidadeAltura ="m.";
		System.out.println("----------------------------------");
		System.out.println("Dados do paciente".toUpperCase());
		System.out.println("---------------------------------");
		System.out.println("Nome: ".toUpperCase() + nome);
		System.out.printf("Peso: %s %s\n", peso, unidadePeso);
		System.out.println("===================================");
		System.out.println("Altura %s %s \n", altura, unidadeAltura);
	}
	
	}
	
