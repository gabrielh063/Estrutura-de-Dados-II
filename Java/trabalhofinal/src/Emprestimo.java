

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int idUsuario;
    private int idLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(int id, int idUsuario, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idLivro=" + idLivro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}
