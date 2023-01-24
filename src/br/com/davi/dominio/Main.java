package br.com.davi.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java Course");
		curso1.setDescricao("Projeto para bootcamp Java");
		curso1.setCargaHoraria(6);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Javascript Course");
		curso2.setDescricao("Projeto para bootcamp Javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setData(LocalDate.now());
		mentoria.setDescricao("Hackeando o Java e Javascript");
		mentoria.setTitulo("Bootcamp Java/Javascript");
		
		/**System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);**/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Desenvolvimento em Java");
		bootcamp.getConteudos().add(curso1);		
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev Davi = new Dev();
		Davi.setNome("Davi");
		Davi.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de "+ Davi.getNome()+ ": "+ Davi.getConteudosInscritos());
		Davi.progredir();
		System.out.println("XP :" + Davi.calcularTotalXP());
		System.out.println("Conteudos conluidos de "+ Davi.getNome()+ ": "+ Davi.getConteudosConcluidos());

		Dev Jose = new Dev();
		Jose.setNome("Jose");
		Jose.inscreverBootcamp(bootcamp);
		System.out.println("XP :" + Jose.calcularTotalXP());
		System.out.println("Conteudos inscritos de "+ Jose.getNome()+ ": "+ Jose.getConteudosInscritos());
		System.out.println("Conteudos conluidos de "+ Jose.getNome()+ ": "+ Jose.getConteudosConcluidos());
		
		Dev Patricia = new Dev();
		Patricia.setNome("Patricia Freitas");
		Patricia.inscreverBootcamp(bootcamp);
		Patricia.progredir();
		Patricia.progredir();
		Patricia.progredir();
		Patricia.progredir();
		System.out.println("XP :" + Patricia.calcularTotalXP());
		System.out.println("Conteudos inscritos de "+ Patricia.getNome()+ ": "+ Patricia.getConteudosInscritos());
		System.out.println("Conteudos conluidos de "+ Patricia.getNome()+ ": "+ Patricia.getConteudosConcluidos());
		
		

	}

}
