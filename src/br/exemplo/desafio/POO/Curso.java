package br.exemplo.desafio.POO;

public class Curso extends Conteudos{
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return 0;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {

        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        String str = "\n\t[Course Name:" + getTitulo() + "\n\tDescription:"+ getDescricao() + "\n\tWorkload:" + cargaHoraria + "]\n";
        return  str;
    }
}
