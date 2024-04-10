package org.example.Service;

import org.example.Classes.Atleta;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AtletaService {
    private static Map<Integer, Atleta> atletas = new HashMap<Integer, Atleta>();
    private static Integer id = 0;

    public static void Incluir(Atleta atleta){
        atleta.setId(++id);
        atletas.put(atleta.getId(), atleta);
    }

    public static void Deletar(Integer id) {
        atletas.remove(id);
    }

    public static Collection<Atleta> obterLista() {
        return atletas.values();
    }

    public static Atleta ObterUnico(Integer id) {
        return atletas.get(id);
    }
}

