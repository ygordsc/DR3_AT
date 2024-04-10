package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class Clube {
    private int Id;
    private String Nome;
    private Treinador treinador;
    private List<Atleta> atletas;


    public Clube() {
        this.setNome("Flamengo");
        treinador = null;
        addAtletas(null);
    }

    public Clube(String nome) {
        this.setNome(nome);
        treinador = null;
        addAtletas(null);
    }

    public Clube(Treinador treinador) {
        this.setNome("Flamengo");
        this.treinador = treinador;
        addAtletas(null);
    }
    public Clube(Atleta atleta) {
        this.setNome("Flamengo");
        this.treinador = null;
        addAtletas(atleta);
    }


    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public void addAtletas(Atleta atleta) {
        if (atletas == null) {
            atletas = new ArrayList<Atleta>();
        }
        atletas.add(atleta);
    }

    @Override
    public String toString() {
        if (getTreinador() != null) {
            return "Clube " + getId() + ": " + getNome() + " Treinador: " + getTreinador().getNome() + " Jogadores: " + getAtletas();
        } else {
            return "Clube " + getId() + ": " + getNome() + " Treinador: " + getTreinador() + " Jogadores: " + getAtletas();
        }
    }
}
