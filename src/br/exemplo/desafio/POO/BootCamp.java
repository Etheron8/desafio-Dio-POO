package br.exemplo.desafio.POO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String name;
    private String descricao;

    private String professorName;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudos> conteudos = new LinkedHashSet<>();

    public BootCamp(String name, String descricao, String professor) {
        this.name = name;
        this.descricao = descricao;
        this.professorName = professor;

    }

    public String getProfessorName() {
        return professorName;
    }



    public String getName() {
        return name;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudos> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudos> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(name, bootCamp.name) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(devInscritos, bootCamp.devInscritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "name='" + name + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", devInscritos=" + devInscritos +
                ", conteudos=" + conteudos +
                '}';
    }
}
