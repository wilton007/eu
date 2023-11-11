package com.example.theBible.dtos;

import lombok.Data;

@Data
public class BibliaDto {
    private String nome;
    private int idade;
    private String cidade;

    public BibliaDto(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
}
