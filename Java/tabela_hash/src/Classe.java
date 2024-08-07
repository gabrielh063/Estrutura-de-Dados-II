import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Classe {
    static LinkedList tabela[] = new LinkedList[26];
    static Scanner input = new Scanner(System.in);

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

    public static void imprimir(){
        System.out.println("---------------------------");
        for (int i = 0; i < tabela.length; i++) {
            LinkedList lista = tabela[i];
            int total = lista.size();
            System.out.println(i + " total: " +total  + " -> ");
        }
    }

    public static void gerarNomes(int quantidade){
        Random rnd = new Random();
        for (int i = 0; i < quantidade; i++) {
            int qtdletras = 3 + rnd.nextInt(6);
            String palavra = "";
            for (int j = 0; j < qtdletras; j++) {
                char letra = (char)(97+rnd.nextInt(26));
                palavra += letra;
            }
            adiciona(palavra);
        }
        
    }
    
    public static int menu() {
        System.out.println("*******MENU*******");
        System.out.println("1 - Buscar");
        System.out.println("2 - Sair");
        System.out.print(">>>>>");
        return input.nextInt();
    }

    public static void busca(String palavra){
        int categoria = hash(palavra);
        System.out.println("******BUSCA******");
        System.out.println("catergoria " + categoria);
        LinkedList lista = tabela[categoria];
        if (lista.contains(palavra)){
            System.out.println(palavra + " Esta presente");
        } else {
            System.out.println("Palavra nao encontrada!");
        }
    }

    public static void main(String[] args) {
        gerarNomes(10000000);
        imprimir();
        int op = 0;
        do {
            op = menu();
            if (op == 1){
                System.out.println("Digite a palavra a ser procurada: ");
                String palavra = input.next();
                busca(palavra);
            } else if (op == 2){
                break;
            }

        } while (op != 2);
    }    
}
