package org.example.Controller;
import org.example.Service.EmissoraService;
import spark.Request;
import spark.Response;
import spark.Route;

public class EmissoraController implements Route {

    public static Route obterLista = (req,res) -> {
        return EmissoraService.obterLista();
    };

    public static Route incluir = (req,res) -> {
        String nome = req.params("nome");
        org.example.Classes.Emissora a = new org.example.Classes.Emissora(nome);
        EmissoraService.Incluir(a);
        return "Inclusão realizada com sucesso! " + a;
    };

    public static Route deletar = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        org.example.Classes.Emissora a = EmissoraService.ObterUnico(index);
        EmissoraService.Deletar(index);
        return "Exclusão realizada com sucesso: " + a.getId();
    };

    public static Route obterUnico = (req,res) -> {
        Integer index = Integer.valueOf(req.params("id"));
        org.example.Classes.Emissora a = EmissoraService.ObterUnico(index);
        return "Recuperação realizada com sucesso: " + a;
    };

    @Override
    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}