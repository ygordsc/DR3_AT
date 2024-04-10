package org.example.Classes;

public class Treinador extends Usuario{

    private int Id;
    private Clube clube;
    private int Vitorias;
    private int Derrotas;

    public Treinador(){
        super("Jorge Jesus");
        clube = new Clube(this);
        Vitorias = 100;
        Derrotas = 0;
    }

    public Treinador(String nome){
        setNome(nome);
        clube = new Clube(this);
        Vitorias = 100;
        Derrotas = 0;
    }

    public int getId() {
        return Id;
    }

    public Clube getClube() {
        return clube;
    }

    public int getVitorias() {
        return Vitorias;
    }

    public int getDerrotas() {
        return Derrotas;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setClube(Clube clube) {
         this.clube = clube;
    }

    public void setVitorias(int vitorias){
        Vitorias = vitorias;
    }

    public void setDerrotas(int derrotas){
        Derrotas = derrotas;
    }

    @Override
    public String toString(){
        return "O treinador " + getNome() + ", treinador do "+ clube.getNome() +
                ", possui " + Vitorias +" vitórias e " + Derrotas +" derrotas.";
    }
}
