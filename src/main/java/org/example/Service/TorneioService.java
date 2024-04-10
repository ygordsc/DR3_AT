package org.example.Service;

import org.example.Classes.Torneio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TorneioService {
    private static Map<Integer, Torneio> torneios = new HashMap<Integer, Torneio>();
    private static Integer id = 0;

    public static void Incluir(Torneio torneio){
        torneio.setId(++id);
        torneios.put(torneio.getId(), torneio);

    }

    public static void Deletar(Integer id) {
        torneios.remove(id);
    }

    public static Collection<Torneio> obterLista() {
        return torneios.values();
    }

    public static Torneio ObterUnico(Integer id) {
        return torneios.get(id);
    }
}

