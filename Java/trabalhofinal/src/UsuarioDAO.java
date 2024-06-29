import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        this.usuarios = new ArrayList<>();
        // Exemplo de dados iniciais (simulando dados no banco)
        usuarios.add(new Usuario(1, "Maria Silva", "maria@email.com", "123456789", "Jacui","MG"));
        usuarios.add(new Usuario(2, "João Oliveira", "joao@email.com", "987654321", "paraiso", "GO"));
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void atualizarUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getId() == usuario.getId()) {
                u.setNome(usuario.getNome());
                u.setEmail(usuario.getEmail());
                u.setTelefone(usuario.getTelefone());
                u.setCidade(usuario.getCidade());
                u.setUf(usuario.getUf());
                break;
            }
        }
    }

    public void excluirUsuario(int idUsuario) {
        usuarios.removeIf(u -> u.getId() == idUsuario);
    }

    public Usuario consultarUsuarioPorId(int idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getId() == idUsuario) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}
