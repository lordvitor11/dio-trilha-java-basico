package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

public class Curso extends Conteudo {
    @Getter
    @Setter
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}