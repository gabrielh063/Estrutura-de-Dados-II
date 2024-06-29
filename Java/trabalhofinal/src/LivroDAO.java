
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private List<Livro> livros;

    public LivroDAO() {
        this.livros = new ArrayList<>();
        // Exemplo de dados iniciais (simulando dados no banco)
        livros.add(new Livro(1, "Dom Quixote", "Miguel de Cervantes", "Romance"));
        livros.add(new Livro(2, "Guerra e Paz", "Liev Tolstói", "Romance"));
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void atualizarLivro(Livro livro) {
        for (Livro l : livros) {
            if (l.getId() == livro.getId()) {
                l.setTitulo(livro.getTitulo());
                l.setAutor(livro.getAutor());
                l.setGenero(livro.getGenero());
                l.setDisponivel(livro.isDisponivel());
                break;
            }
        }
    }

    public void excluirLivro(int idLivro) {
        livros.removeIf(l -> l.getId() == idLivro);
    }

    public Livro consultarLivroPorId(int idLivro) {
        for (Livro l : livros) {
            if (l.getId() == idLivro) {
                return l;
            }
        }
        return null;
    }

    public List<Livro> listarLivros() {
        return livros;
    }
}
