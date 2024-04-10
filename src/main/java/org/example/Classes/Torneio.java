package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class Torneio {

    private int Id;
    private String Local;
    private List<Clube> Inscritos;
    private int IngressosVendidos;
    private Emissora emissora;

    public Torneio(String local, int IngressosVendidos, List inscritos, Emissora emissora){
        this.Local = local;
        this.IngressosVendidos = IngressosVendidos;
        this.Inscritos = inscritos;
        this.emissora = emissora;
    }

    public Torneio(){
        this.Local = "Maracanã";
        this.IngressosVendidos = 500;
        addParticipantes(new Clube());
        this.emissora = new Emissora();
    }

    public Torneio(String local){
        this.Local = local;
        this.IngressosVendidos = 500;
        addParticipantes(new Clube());
        this.emissora = new Emissora();
    }

    public int getId() {
        return Id;
    }

    public String getLocal() {
        return Local;
    }

    public int getIngressosVendidos() {
        return IngressosVendidos;
    }

    public List getInscritos() {
        return Inscritos;
    }

    public Emissora getEmissora() {
        return emissora;
    }

    public List<String> getParticipantesNames() {
        List<String> participantesNames = new ArrayList<>();
        if (Inscritos != null) {
            for (Clube clube : Inscritos) {
                participantesNames.add(clube.getNome());
            }
        }
        return participantesNames;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLocal(String local){
        Local = local;
    }

    public void setIngressosVendidos(int IngressosVendidos) {
        this.IngressosVendidos = IngressosVendidos;
    }

    public void addParticipantes(Clube clube) {
        if (Inscritos == null) {
            Inscritos = new ArrayList<>();
        }
        Inscritos.add(clube);
    }

    public void setEmissora(Emissora emissora){
         this.emissora = emissora;
    }

    @Override
    public String toString(){
        return "O torneio aconteceu em " + getLocal() + " transmitida pela emissora " + getEmissora().getNome()+ " disputada pelos clubes:"
                + getParticipantesNames() + " e teve " + getIngressosVendidos() + " ingressos vendidos";
    }

}
