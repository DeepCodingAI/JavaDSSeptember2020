package ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMapListArray {

    public static void main(String[] args) {
        List<String> countryOfUSA = new ArrayList<String>();
        countryOfUSA.add("NY");
        countryOfUSA.add("NJ");
        countryOfUSA.add("PA");
        countryOfUSA.add("MA");
        countryOfUSA.add("FL");
        countryOfUSA.add("CA");

        List<String> countryOfCanada = new ArrayList<String>();
        countryOfCanada.add("Alberta");
        countryOfCanada.add("Montreal");
        countryOfCanada.add("Nova Scotia");
        countryOfCanada.add("Toronto");

        List<String> countryOfAustralia = new ArrayList<String>();
        countryOfAustralia.add("Sydney");
        countryOfAustralia.add("Victoria");
        countryOfAustralia.add("New South");
        countryOfAustralia.add("Queensland");

        List<String> countryOfUK = new ArrayList<String>();
        countryOfUK.add("London");
        countryOfUK.add("Manchester");
        countryOfUK.add("Scott land");

        Map<String,List<String>> map = new LinkedHashMap<String,List<String>>();
        map.put("USA", countryOfUSA);
        map.put("Canada", countryOfCanada);
        map.put("Australia", countryOfAustralia);
        map.put("UK", countryOfUK);

        for(Map.Entry<String, List<String>> iterate:map.entrySet()){
            System.out.println(iterate.getKey()+ " --> " + iterate.getValue());
        }

    }
}
