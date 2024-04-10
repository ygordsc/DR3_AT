package org.example;
import org.example.Classes.Usuario;
import org.example.Controller.*;
import spark.Spark;

import static spark.Spark.post;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Spark.port(8080);


        Spark.get("/", (req, res) -> {
            return Main.class.getResourceAsStream("/index.html");
        });
        Spark.get("/Spark", (req, res) -> {
            return Main.class.getResourceAsStream("/Spark.html");
        });

        Spark.get("/usuario", new UsuarioController());

        Spark.get("/torneio/lista", TorneioController.obterLista);
        Spark.get("/torneio/:local/incluir", TorneioController.incluir);
        Spark.get("/torneio/:id/deletar", TorneioController.deletar);
        Spark.get("/torneio/:id", TorneioController.obterUnico);

        Spark.get("/emissora/lista", EmissoraController.obterLista);
        Spark.get("/emissora/:nome/incluir", EmissoraController.incluir);
        Spark.get("/emissora/:id/deletar", EmissoraController.deletar);
        Spark.get("/emissora/:id", EmissoraController.obterUnico);

        Spark.get("/clube/lista", ClubeController.obterLista);
        Spark.get("/clube/:nome/incluir", ClubeController.incluir);
        Spark.get("/clube/:id/deletar", ClubeController.deletar);
        Spark.get("/clube/:id", ClubeController.obterUnico);

        Spark.get("/atleta/lista", AtletaController.obterLista);
        Spark.get("/atleta/:nome/incluir", AtletaController.incluir);
        Spark.get("/atleta/:id/deletar", AtletaController.deletar);
        Spark.get("/atleta/:id", AtletaController.obterUnico);

        Spark.get("/treinador/lista", TreinadorController.obterLista);
        Spark.get("/treinador/:nome/incluir", TreinadorController.incluir);
        Spark.get("/treinador/:id/deletar", TreinadorController.deletar);
        Spark.get("/treinador/:id", TreinadorController.obterUnico);

        Spark.get("viacep/:cep", ViacepController.getEndereco);

    }
}