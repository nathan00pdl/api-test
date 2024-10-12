package com.example.api_test.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String titulo;
    public String autor;
    public String area;
    public String imagem;
    public String editora;
    public String data_de_lancamento;
    @JsonProperty("Ano de Publicação")
    public String ano_de_publicacao;
    public String isbn;

}