package org.example.Service;

import org.example.Classes.Emissora;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmissoraService {
    private static Map<Integer, Emissora> emissoras = new HashMap<Integer, Emissora>();
    private static Integer id = 0;

    public static void Incluir(Emissora emissora){
        emissora.setId(++id);
        emissoras.put(emissora.getId(), emissora);

    }

    public static void Deletar(Integer id) {
        emissoras.remove(id);
    }

    public static Collection<Emissora> obterLista() {
        return emissoras.values();
    }

    public static Emissora ObterUnico(Integer id) {
        return emissoras.get(id);
    }
}
