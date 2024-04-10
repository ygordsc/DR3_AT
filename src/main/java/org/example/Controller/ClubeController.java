package org.example.Controller;
import org.example.Classes.Clube;
import org.example.Service.ClubeService;
import spark.Request;
import spark.Response;
import spark.Route;

public class ClubeController implements Route {

    public static Route obterLista = (req,res) -> {
        return ClubeService.obterLista();
    };

    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        Clube a = new Clube(nome);
        ClubeService.Incluir(a);
        return "Inclusão realizada com sucesso! " + a;
    };

    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Clube a = ClubeService.ObterUnico(index);
        ClubeService.Deletar(index);
        return "Exclusão realizada com sucesso: " + a.getId();
    };

    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Clube a = ClubeService.ObterUnico(index);
        return "Recuperação realizada com sucesso: " + a;
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}