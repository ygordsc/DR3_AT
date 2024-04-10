package org.example.Classes;

public class Emissora extends Usuario{

    private int Id;
    private int Alcance;

    public Emissora(){
        this.setNome("Globo");
        Alcance = 100;
    }

    public Emissora(String nome){
        this.setNome(nome);
        Alcance = 100;
    }

    public int getId() {
        return Id;
    }
    public int getAlcance() {
        return Alcance;
    }

    public void setId(int id) {
        Id = id;
    }
    public void setAlcance(int alcance) {
        Alcance = alcance;
    }

    @Override
    public String toString() {
        return "EmissoraController " + getId() + " " + getNome();
    }

}
