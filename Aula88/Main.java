package Aula88;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] Args){
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Roberto");
        nomes.add("Francis");
        nomes.add("Dudu");
        
        System.out.println(nomes);
        nomes.set(1, "Claudia");
        System.out.println(nomes);

        for(String n : nomes){
            System.out.println(n);

        }
        HashMap<String, Double> registros = new HashMap<String, Double>(10);

        System.out.println(registros);
        registros.put("Adriano", 1.79);
        registros.put("Rafaela", 1.53);
        registros.put("Ricardo", 1.98);

        System.out.println(registros);

        System.out.println(registros.get("Rafaela"));

        registros.put("Rafaela", 1.64);
        System.out.println(registros.put("Rafaela", 1.53));
    }
}
