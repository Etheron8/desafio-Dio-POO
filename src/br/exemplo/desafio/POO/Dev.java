package br.exemplo.desafio.POO;

import java.util.*;

public class Dev {


    private String name;
    private final int age;

    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();


    public Dev(String nome, int age) {
        this.name = nome;
        this.age = age;
    }

    public void inscreverBootCamps(BootCamp bootCamp){
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevInscritos().add(this);

    }

    public void progredir() {
        Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Conteudos> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public int getAge() {
        return age;
    }

    public String getNome() {
        return name;
    }



    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosConcluidos);
    }
}
