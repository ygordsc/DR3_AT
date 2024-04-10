package org.example.Classes;

import spark.Request;
import spark.Response;
import spark.Route;

public class Usuario {

    private int Id;
    private String Nome;
    private String Email;
    private int Idade;

    public Usuario(String nome, String email, int idade){this.Nome = nome;Email=email;Idade=idade;}
    public Usuario(String nome){this.Nome = nome;Email="ygor@dsc.com";Idade=18;}

    public Usuario(){this.Nome = "Arrascaeta";Email="arrasca@gmail.com";Idade=18;}
    public String getNome(){return Nome;}
    public void setNome(String nome){this.Nome = nome;}
    public String getEmail(){return Email;}
    public void setEmail(String email){this.Email = email;}
    public int getIdade(){return Idade;}
    public void setIdade(int idade){this.Idade = idade;}

    @Override
    public String toString(){
        return "A inclusão do usuário: " + getNome() + " foi concluida com sucesso!";
    }

}
