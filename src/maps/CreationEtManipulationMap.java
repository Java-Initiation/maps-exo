package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(32, "Bordeaux");

        System.out.println("On affiche les clefs :");
        for (Integer integer : mapVilles.keySet()) {
            System.out.println("clef : " + integer);
        }

        System.out.println("On affiche les valeurs :");
        for (String value : mapVilles.values()) {
            System.out.println("valeur : " + value);
        }

        System.out.println("Taille : " + mapVilles.size());

    }
}