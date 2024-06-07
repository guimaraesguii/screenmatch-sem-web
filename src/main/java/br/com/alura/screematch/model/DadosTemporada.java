package br.com.alura.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes")List<DadosEpisodio> episodios) {
//
//    public DadosTemporada(@JsonAlias("Season") Integer numero, @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
//        try{
//            this.numero = numero;
//        }catch (NullPointerException ex){
//            System.out.println("Fodeu");
//        }
//        try {
//            this.episodios = episodios;
//        }catch (NullPointerException ex) {
//            System.out.println("Fodeu");
//        }

    }


