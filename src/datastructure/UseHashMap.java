package datastructure;

import java.util.*;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("first name", "john");
        personalInfo.put("last name", "doe");
        personalInfo.put("cellphone", "3478694367");
        personalInfo.put("email address", "johndoe@gmail.com");

        System.out.println(personalInfo.get("cellphone"));
        for (Map.Entry entry : personalInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
            List<String> citiesOfUSA = new ArrayList<>();
            citiesOfUSA.add("NYC");
            citiesOfUSA.add("LA");
            citiesOfUSA.add("Miami");
            List<String> citiesOFCanada = new ArrayList<>();
            citiesOFCanada.add("toronto");
            citiesOFCanada.add("montreal");
            citiesOFCanada.add("ottawa");
            List<String> citiesOfEngland = new ArrayList<>();
            citiesOfEngland.add("london");
            citiesOfEngland.add("manchester");
            citiesOFCanada.add("leads");

            Map<String, List<String>> map = new HashMap<>();
            map.put("USA", citiesOfUSA);
            map.put("canada", citiesOFCanada);
            map.put("england", citiesOfEngland);

            System.out.println(map.get("USA"));

            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }
    }

