package org.example.Controller;
import org.example.Classes.Torneio;
import org.example.Service.TorneioService;
import org.example.Service.EmissoraService;
import spark.Request;
import spark.Response;
import spark.Route;

public class TorneioController implements Route {

    public static Route obterLista = (req,res) -> {
        return TorneioService.obterLista();
    };

    public static Route incluir = (req,res) -> {
        String local = req.params("local");
        Torneio a = new Torneio(local);
        TorneioService.Incluir(a);
        EmissoraService.Incluir(a.getEmissora());
        return "Inclusão realizada com sucesso! " + a;
    };

    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Torneio a = TorneioService.ObterUnico(index);
        TorneioService.Deletar(index);
        return "Exclusão realizada com sucesso: " + a.getId();
    };

    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        Torneio a = TorneioService.ObterUnico(index);
        return "Recuperação realizada com sucesso: " + a;
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}