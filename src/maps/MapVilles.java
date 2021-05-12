package maps;

import models.Ville;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {

    public static void main(String[] args) {

        HashMap<String, Ville> villeHashMap = new HashMap<>();
        villeHashMap.put("Ville1", new Ville("Ville1", 5000));
        villeHashMap.put("Ville2", new Ville("Ville2", 200));
        villeHashMap.put("Ville3", new Ville("Ville3", 700));
        villeHashMap.put("Ville4", new Ville("Ville4", 8900));

        String villeKeyMinHabitants = null;
        for (Map.Entry<String, Ville> stringVilleEntry : villeHashMap.entrySet()) {
            if (villeKeyMinHabitants == null)
                villeKeyMinHabitants = stringVilleEntry.getKey();
            else if (stringVilleEntry.getValue().getNombreHabitants() < villeHashMap.get(villeKeyMinHabitants).getNombreHabitants())
                villeKeyMinHabitants = stringVilleEntry.getKey();
        }

        villeHashMap.remove(villeKeyMinHabitants);

        for (Ville value : villeHashMap.values()) {
            System.out.println(value);
        }


    }

}
