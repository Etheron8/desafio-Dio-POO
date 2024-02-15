package br.exemplo.desafio.POO;

import java.time.LocalDate;
import java.util.Locale;

public class Mentorias extends  Conteudos{

    private LocalDate data;
    @Override
    public double calcularXp() {
        return 0;
    }

    public Mentorias() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "Titulo=" + getTitulo() +
                "Descrição = " + getDescricao() +
                "data=" + data +
                '}';
    }
}
