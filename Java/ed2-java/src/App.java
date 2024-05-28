import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {

    public static void impirimir(int vetor[]){
        System.out.println(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ": " + vetor[i]);
        }
    }
    public static void main(String[] args) {
        /*  VETOR === ARRAY;
            ED ESTATICA (tamanho da ED deve ser definido a priori)
            - tamanho da ED nao vai ser alterado
            - tipo nome[] = new tipo[];
            - tipo []nome = new tipo[];
        */
        int idade[] = new int[10];
        idade[0] = 5;
        String valor = "8";
        idade[1] = 21;
        idade[2] = 2;
        idade[3] = Integer.parseInt(valor); // converte de string para int
        idade[4] = 20;

        impirimir(idade);
        // collection arraylist
        System.out.println("==========COLLECTION==========");
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        System.out.println(vetor.size());
        System.out.println(vetor.isEmpty());
        vetor.add(55);
        vetor.add(46);
        System.out.println(vetor.size());
        System.out.println(vetor.isEmpty());
        Collections.sort(vetor);
        System.out.println(vetor);

        Arrays.sort(idade);
        impirimir(idade);

    }
}
