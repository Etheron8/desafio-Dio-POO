package br.exemplo.desafio.POO;

public class Curso extends Conteudos{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return 0;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo=" + getTitulo() +
                "Descrição =" + getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
