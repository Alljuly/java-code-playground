package com.example;

import java.time.LocalDate;

import com.example.dominio.Bootcamp;
import com.example.dominio.Curso;
import com.example.dominio.Dev;
import com.example.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitle("Java");
        curso1.setDescription("Desenvolvimento Java");
        curso1.setHours(80);

        curso2.setTitle("React");
        curso2.setDescription("WEB com React");
        curso2.setHours(120);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitle("Java Mentoria");
        mentoria.setDate(LocalDate.now());
        mentoria.setDescription("Mentoria em Java");

        // System.out.println(curso1.toString());
        // System.out.println(curso2.toString());
        // System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Java bootcamp backend");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Alice");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + dev1.getNome() + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos:" + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos:" + dev1.getNome() + dev1.getConteudosConcluidos());

        // Dev dev2 = new Dev();
        // dev2.setNome("Emanuel");
        // dev2.inscreverBootcamp(bootcamp);
        // System.out.println("Conteudos inscritos:" + dev1.getNome() +
        // dev2.getConteudosInscritos());
    }
}