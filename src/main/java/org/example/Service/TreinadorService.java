package org.example.Service;

import org.example.Classes.Treinador;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TreinadorService {
    private static Map<Integer, Treinador> treinadores = new HashMap<Integer, Treinador>();
    private static Integer id = 0;

    public static void Incluir(Treinador treinador){
        treinador.setId(++id);
        treinadores.put(treinador.getId(), treinador);

    }

    public static void Deletar(Integer id) {
        treinadores.remove(id);
    }

    public static Collection<Treinador> obterLista() {
        return treinadores.values();
    }

    public static Treinador ObterUnico(Integer id) {
        return treinadores.get(id);
    }
}
