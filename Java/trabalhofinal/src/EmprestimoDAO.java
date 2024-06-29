
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {
    private List<Emprestimo> emprestimos;

    public EmprestimoDAO() {
        this.emprestimos = new ArrayList<>();
        // Exemplo de dados iniciais (simulando dados no banco)
        emprestimos.add(new Emprestimo(1, 1, 1, LocalDate.now().minusDays(5), LocalDate.now().plusDays(10)));
        emprestimos.add(new Emprestimo(2, 2, 2, LocalDate.now().minusDays(10), LocalDate.now().plusDays(15)));
    }

    public void realizarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void registrarDevolucao(int idEmprestimo, LocalDate dataDevolucao) {
        for (Emprestimo e : emprestimos) {
            if (e.getId() == idEmprestimo) {
                e.setDataDevolucao(dataDevolucao);
                break;
            }
        }
    }

    public List<Emprestimo> consultarHistoricoEmprestimosUsuario(int idUsuario) {
        List<Emprestimo> historico = new ArrayList<>();
        for (Emprestimo e : emprestimos) {
            if (e.getIdUsuario() == idUsuario) {
                historico.add(e);
            }
        }
        return historico;
    }

    public List<Emprestimo> listarEmprestimosEmAndamento() {
        List<Emprestimo> emprestimosEmAndamento = new ArrayList<>();
        for (Emprestimo e : emprestimos) {
            if (e.getDataDevolucao() == null) {
                emprestimosEmAndamento.add(e);
            }
        }
        return emprestimosEmAndamento;
    }
}
