package org.example.Service;

import org.example.Classes.Clube;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClubeService {
    private static Map<Integer, Clube> clubes = new HashMap<Integer, Clube>();
    private static Integer id = 0;

    public static void Incluir(Clube clube){
        clube.setId(++id);
        clubes.put(clube.getId(), clube);
    }

    public static void Deletar(Integer id){
        clubes.remove(id);
    }

    public static Collection<Clube> obterLista() {
        return clubes.values();
    }

    public static Clube ObterUnico(Integer id) {
        return clubes.get(id);
    }
}

