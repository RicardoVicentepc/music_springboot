package com.example.ProjetoEstudoMaven.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.time.LocalDate;


@Entity
public class Musica {
    /**
     *
     * nome - nome da faixa;
     * album - nome do album;
     * dataLancamento - data de lançamento da música;
     * nota - nota da faixa de 1.0 a 5.0;
     * ranking - representa a posição que a música está na Billboard, numero positivo;
     *
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotNull @NotBlank
    String nome;
    @NotBlank @NotNull
    String album;

    @NotNull
    LocalDate dataLancamento;
    @NotNull @DecimalMin("0.0") @DecimalMax("10.0")
    Double nota;
    @Min(1) @Max(100)
    Integer ranking;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
