
import java.util.HashMap;
import java.util.HashSet;

public class appHash {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<String>();
        conjunto.add("laranja");
        conjunto.add("morango");
        conjunto.add("banana");
        System.out.println(conjunto);

        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("ABC-8764", 8976);
        mapa.put("CDB-9987", 587222);
        System.out.println(mapa.get("ABC-8764"));
        
        
    }
}
