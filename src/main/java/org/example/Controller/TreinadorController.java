package org.example.Controller;
import org.example.Classes.Treinador;
import org.example.Service.ClubeService;
import org.example.Service.TreinadorService;
import spark.Request;
import spark.Response;
import spark.Route;

public class TreinadorController implements Route {


    public static Route obterLista = (req,res) -> {
        return TreinadorService.obterLista();
    };

    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        Treinador a = new Treinador(nome);
        TreinadorService.Incluir(a);
        ClubeService.Incluir(a.getClube());
        return "Inclusão realizada com sucesso! " + a;
    };

    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Treinador a = TreinadorService.ObterUnico(index);
        TreinadorService.Deletar(index);
        return "Exclusão realizada com sucesso: " + a.getId();
    };

    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Treinador a = TreinadorService.ObterUnico(index);
        return "Recuperação realizada com sucesso: " + a;
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}