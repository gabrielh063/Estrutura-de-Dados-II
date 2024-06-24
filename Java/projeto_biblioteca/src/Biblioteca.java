
import java.util.LinkedList;
import javax.swing.event.ListDataEvent;

public class Biblioteca {
    private LinkedList<Livro> dados;

    public Biblioteca(){
        dados = new LinkedList<Livro>();
    }

    public void inserir(Livro livro){
        if(!dados.contains(livro)){
            dados.add(livro);
        } else{
            System.out.println(livro + " O livro ja existe na biblioteca");
        }
        System.out.println("Inserir");
        System.out.println(dados);
    }

    public void mostrarTodos(){
        for (Livro livro : dados) {
            System.out.println(livro);
        }
    }

    public void buscarId(int idProcurado){
        Livro idEncontrado = null;
        for (Livro idLivro : dados) {
            if (idLivro.getId() == idProcurado) {
                idEncontrado = idLivro;
                System.out.println(idEncontrado + "Esta aqui");
                break; 
            } 
        }
        System.out.println("Livro nao encontrado"); 
    }

    public void removeLivros(int idLivro){
        for (Livro livro : dados) {
            if (livro.getId() == idLivro) {
            dados.remove(livro);
            System.out.println(livro + " removido com sucesso");
            }
        }
    }
}
