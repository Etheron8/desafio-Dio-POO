package br.exemplo.desafio.POO;

import java.time.LocalDate;

public class Mentorias extends  Conteudos{

    private LocalDate data;
    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

    public Mentorias(String titulo, String descricao, LocalDate date) {

        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = date;
    }



    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString(){

    return "\n\t[Mentoring name:"+getTitulo() + "\n\tDescription:"+getDescricao() +"\n\tDate:"+data + "]\n";
    }
}
