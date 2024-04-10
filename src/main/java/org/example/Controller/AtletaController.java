package org.example.Controller;
import org.example.Service.ClubeService;
import org.example.Service.AtletaService;
import spark.Request;
import spark.Response;
import spark.Route;

public class AtletaController implements Route {

    public static Route obterLista = (req,res) -> {
        return AtletaService.obterLista();
    };

    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        org.example.Classes.Atleta a = new org.example.Classes.Atleta(nome);
        AtletaService.Incluir(a);
        ClubeService.Incluir(a.getTreinador());
        return "Inclusão realizada com sucesso! " + a;
    };

    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        org.example.Classes.Atleta a = AtletaService.ObterUnico(index);
        AtletaService.Deletar(index);
        return "Exclusão realizada com sucesso: " + a.getId();
    };

    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        org.example.Classes.Atleta a = AtletaService.ObterUnico(index);
        return "Recuperação realizada com sucesso: " + a;
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}