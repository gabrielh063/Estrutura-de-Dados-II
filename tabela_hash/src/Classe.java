
import java.util.LinkedList;

public class Classe {
    static LinkedList tabela[] = new LinkedList[26];

    public static int hash(String valor) {
        valor = valor.toLowerCase();
        // System.out.println(valor.charAt(0));
        int codigoAcsii = valor.charAt(0);
        int resto = (codigoAcsii+7)%26;
        // System.out.println(codigoAcsii + " " + resto);
        return resto;
    }

    public static void adiciona(String valor){
        int categoria = hash(valor);
        if (tabela[categoria] == null){
            tabela[categoria] = new LinkedList();
        }
        tabela[categoria].add(valor);
    }
    public static void main(String[] args) {
        adiciona("Astrogildo");
        adiciona("Silvio Santos");
        for (LinkedList lista : tabela){
            System.out.println(lista);
        }
    }    
}
