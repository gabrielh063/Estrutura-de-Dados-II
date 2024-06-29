import java.time.LocalDate;
import java.util.List;

public class BibliotecaService {
    private LivroDAO livroDAO;
    private UsuarioDAO usuarioDAO;
    private EmprestimoDAO emprestimoDAO;

    public BibliotecaService() {
        this.livroDAO = new LivroDAO();
        this.usuarioDAO = new UsuarioDAO();
        this.emprestimoDAO = new EmprestimoDAO();
    }

    // Métodos para Livros
    public void adicionarLivro(Livro livro) {
        livroDAO.adicionarLivro(livro);
    }

    public void atualizarLivro(Livro livro) {
        livroDAO.atualizarLivro(livro);
    }

    public void excluirLivro(int idLivro) {
        livroDAO.excluirLivro(idLivro);
    }

    public Livro consultarLivroPorId(int idLivro) {
        return livroDAO.consultarLivroPorId(idLivro);
    }

    public List<Livro> listarLivros() {
        return livroDAO.listarLivros();
    }

    // Métodos para Usuários
    public void adicionarUsuario(Usuario usuario) {
        usuarioDAO.adicionarUsuario(usuario);
    }

    public void atualizarUsuario(Usuario usuario) {
        usuarioDAO.atualizarUsuario(usuario);
    }

    public void excluirUsuario(int idUsuario) {
        usuarioDAO.excluirUsuario(idUsuario);
    }

    public Usuario consultarUsuarioPorId(int idUsuario) {
        return usuarioDAO.consultarUsuarioPorId(idUsuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }

    // Métodos para Empréstimos
    // public void realizarEmprestimo(Emprestimo emprestimo) {
    //     emprestimoDAO.realizarEmprestimo(emprestimo);
    // }

    public void registrarDevolucao(int idEmprestimo, LocalDate dataDevolucao) {
        emprestimoDAO.registrarDevolucao(idEmprestimo, dataDevolucao);
    }

    public List<Emprestimo> consultarHistoricoEmprestimosUsuario(int idUsuario) {
        return emprestimoDAO.consultarHistoricoEmprestimosUsuario(idUsuario);
    }

    public List<Emprestimo> listarEmprestimosEmAndamento() {
        return emprestimoDAO.listarEmprestimosEmAndamento();
    }

    public void realizarEmprestimo(int idEmprestimo, int idLivro, int idUsuario, LocalDate dataEmprestimo,
            LocalDate dataDevolucao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarEmprestimo'");
    }
}
