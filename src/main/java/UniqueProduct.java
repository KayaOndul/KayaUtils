import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : products) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, ++count);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
    }
}