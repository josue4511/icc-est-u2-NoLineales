package collections.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
      public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
       hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;

    }

     public Set<String> construirLinkedHashSet() {
        Set<String> liSet = new LinkedHashSet<>();
            liSet.add("A");
            liSet.add("B");
        liSet.add("C");
            liSet.add("A");
        liSet.add("D");
        liSet.add("E");
        liSet.add("F");
        liSet.add("1Ggggggeegeg");
        liSet.add("2G2gggggeegeg");
        liSet.add("3Gggggeegeg");
            liSet.add("4Ggggggeegeg");
        liSet.add("5Ggggggeegeg");
        liSet.add("5Ggggggeegeg");
        liSet.add("6Ggggggeegeg");
        liSet.add("G7gggggeegeg");
      return liSet;
    }
    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
    treeSet.add("A");
    treeSet.add("B");
    treeSet.add("C");
    treeSet.add("A");
    treeSet.add("D");
    treeSet.add("E");
    treeSet.add("F");
    treeSet.add("1Ggggggeegeg");
    treeSet.add("2G2gggggeegeg");
    treeSet.add("3Gggggeegeg");
    treeSet.add("4Ggggggeegeg");
    treeSet.add("5Ggggggeegeg");
    treeSet.add("5Ggggggeegeg");
    treeSet.add("6Ggggggeegeg");
    treeSet.add("G7gggggeegeg");
    return treeSet;
    }
    public Set<Contacto> construirTreesetConComparador() {
       // (c1,c2) -> c1.getNombre().compareTo(c2.getNombre())
        Set<Contacto> treeSet = new TreeSet<>( (c1,c2) -> c1.getNombre().compareTo(c2.getNombre()));
       Contacto c1=(new Contacto("Juan", "Perez", "123456789"));
       Contacto c2=(new Contacto("Ana", "Gomez", "987654321"));
       Contacto c3=(new Contacto("Pedro", "Lopez", "456789123"));
       Contacto c4=(new Contacto("Maria", "Rodriguez", "789123456"));
       Contacto c5=(new Contacto("Juan", "Perez", "123456789"));
       Contacto c6=(new Contacto("Juan", "Lopez", "123476910"));
       treeSet.add(c1);
       treeSet.add(c2);
       treeSet.add(c3);
       treeSet.add(c4);
       treeSet.add(c5);
       treeSet.add(c6);
       
       return treeSet;

    }
}