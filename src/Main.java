import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição bla bla bla");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("python");
        curso2.setDescricao("descrição bla bla bla");
        curso2.setCargaHoraria(5);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("decricão bla bla bla");
        mentoria.setDate(LocalDate.now());

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        //criamos um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //criamos 2 dev
        Dev nathaniel = new Dev();
        nathaniel.setNome("Nathaniel");

        Dev joao = new Dev();
        joao.setNome("João");

        //inscrevemos no bootcamp
        nathaniel.increverBootcamp(bootcamp);
        //comcluiu a mentoria
        nathaniel.getConteudosConcluidos().add(conteudo2);

        System.out.println(nathaniel.getConteudosIncrito());
        System.out.println(nathaniel.getConteudosConcluidos());
        System.out.println(nathaniel.calcularXp());

        


    }
}
