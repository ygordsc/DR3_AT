package org.example.Classes;

public class Atleta {

    private int Id;
    private String Nome;
    private Clube clube;

    public Atleta(){
        this.setNome("Gabigol");
        clube = new Clube(this);
    }

    public Atleta(String nome) {
        this.setNome(nome);
    }

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public Clube getTreinador() {
        return clube;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "AtletaController " + getId() + " " + getNome();
    }
}
