package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {

    public Map<String, Integer> construirHashMap() {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);

        System.out.println("Tamaño del HashMap: " + map.size());
        System.out.println("Valor de la clave 'A': " + map.get("A"));
        System.out.println("Contiene la clave 'A': " + map.containsKey("A"));
        System.out.println(map);

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.values().toArray()[i]);
        }

        for (String k : map.keySet()) {
            System.out.println(k);
        }

        System.out.println("Clave - Valor");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        return map;
    }

    public LinkedHashMap<String, Integer> coLinkedHashMap() {

        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();

        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);

        System.out.println(lMap);
        System.out.println(lMap.entrySet());

        return lMap;
    }

    public Map<String, Integer> cTreeMap() {

        Map<String, Integer> tMap = new TreeMap<>();

        tMap.put("A", 2);
        tMap.put("B", 3);
        tMap.put("A", 5);
        tMap.put("C", 50);
        tMap.put("D", 5);
        tMap.put("F", 3);
        tMap.put("G", 8);
        tMap.put("H", 85);
        tMap.put("I", 5);

        System.out.println(tMap);
        System.out.println(tMap.entrySet());

        return tMap;
    }

    public void eliminarDuplicadoAnSort(List<Contacto> contactos) {

        Set<Contacto> tSet = new TreeSet<>();

        for (Contacto contacto : contactos) {
            tSet.add(contacto);
        }

        System.out.println("Contactos ordenados y sin duplicados:");

        for (Contacto contacto : tSet) {
            System.out.println(contacto);
        }
    }
}