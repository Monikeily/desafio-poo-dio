import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso ();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso ();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		Curso curso3 = new Curso ();
		curso3.setTitulo("Curso spring");
		curso3.setDescricao("Curso realizado da dio");
		curso3.setCargaHoraria(50);
	
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMonikeily = new Dev();
		devMonikeily.setNome("Monikeily");
		devMonikeily.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Monikeily:" + devMonikeily.getConteudosInscritos());
		devMonikeily.progredir();
		devMonikeily.progredir();
		devMonikeily.progredir();
		System.out.println("...");
		System.out.println("Conteudos Inscritos Monikeily:" + devMonikeily.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Monikeily:" + devMonikeily.getConteudosConcluidos());
		System.out.println("XP:" + devMonikeily.calcularTotalXP());
		
		System.out.println("..............");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("..");
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos incritos joao:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXP());
		
		System.out.println("..............");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("..");
		System.out.println("Conteudos Inscritos Maria:" + devMaria.getConteudosInscritos());
		System.out.println("Conteudos incritos Maria:" + devMaria.getConteudosConcluidos());
		System.out.println("XP:" + devMaria.calcularTotalXP());

	}

}
