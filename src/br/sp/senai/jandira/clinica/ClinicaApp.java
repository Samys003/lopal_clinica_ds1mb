package br.sp.senai.jandira.clinica;

import br.sp.senai.jandira.clinica.model.Paciente;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		System.out.println(p1);
		
		Paciente p2 = new Paciente ();
		System.out.println(p2);
		
		p1.setNome("Ana Maria");
		p1.setPeso(68);
		p1.setAltura(1.66);
		p1.setGenero("F");
		p1.setTelefone("(11)91234-56789");
		
		p2.setNome("Jó da Silva");
		p2.setPeso(83);
		p2.setAltura(1.70);
		p2.setGenero("M");
		p2.setTelefone("(11)92345-6737");
		
		p1.exibirDados();
		p2.exibirDados();
		
		System.out.println(p1.getNome().length());
		System.out.println();
		System.out.println(p1.getNome().toUpperCase());
		System.out.println();
	}
}