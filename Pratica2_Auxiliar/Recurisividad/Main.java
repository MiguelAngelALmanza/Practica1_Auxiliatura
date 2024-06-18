import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "a", "c", "a", "b"};
        String[][] resultado = ordenar(s);

        for (String[] conjunto : resultado) {
            System.out.println(Arrays.toString(conjunto));
        }
    }

    public static String[][] ordenar(String[] s) {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String id : s) {
            frecuencia.put(id, frecuencia.getOrDefault(id, 0) + 1);
        }

        List<List<String>> conjuntos = new ArrayList<>();
        while (!frecuencia.isEmpty()) {
            List<String> conjunto = new ArrayList<>();
            for (Iterator<Map.Entry<String, Integer>> it = frecuencia.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<String, Integer> entry = it.next();
                conjunto.add(entry.getKey());
                if (entry.getValue() == 1) {
                    it.remove();
                } else {
                    frecuencia.put(entry.getKey(), entry.getValue() - 1);
                }
            }
            Collections.sort(conjunto);
            conjuntos.add(conjunto);
        }

        String[][] respuesta = new String[conjuntos.size()][];
        for (int i = 0; i < conjuntos.size(); i++) {
            respuesta[i] = conjuntos.get(i).toArray(new String[0]);
        }

        return respuesta;
    }
}