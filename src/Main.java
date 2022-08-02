import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricão curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricão curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElisangela = new Dev();
        devElisangela.setNome("Elisangela");
        devElisangela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Elisangela" + devElisangela.getConteudosInscritos());
        devElisangela.progredir();
        devElisangela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elisangela" + devElisangela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Elisangela" + devElisangela.getConteudoConcluidos());
        System.out.println("XP:" + devElisangela.calcularXp());

        System.out.println("------");

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootcamp(bootcamp);
        System.out.println("Conteùdos Inscritos Jorge" + devJorge.getConteudosInscritos());
        devJorge.progredir();
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jorge" + devElisangela.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jorge" + devJorge.getConteudoConcluidos());
        System.out.println("XP:" + devJorge.calcularXp());


        System.out.println("------");

    }
}
