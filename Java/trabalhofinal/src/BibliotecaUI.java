import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BibliotecaUI {
    private BibliotecaService bibliotecaService;
    private Scanner scanner;

    public BibliotecaUI() {
        this.bibliotecaService = new BibliotecaService();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("\n=== Sistema de Gerenciamento de Biblioteca ===");
            System.out.println("1. Gerenciamento de Livros");
            System.out.println("2. Gerenciamento de Usuários");
            System.out.println("3. Gerenciamento de Empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    menuLivros();
                    break;
                case 2:
                    menuUsuarios();
                    break;
                case 3:
                    menuEmprestimos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void menuLivros() {
        // Implementação do menu de livros
    }

    private void menuUsuarios() {
        int opcao;
        do {
            System.out.println("\n=== Menu de Usuários ===");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Excluir Usuário");
            System.out.println("4. Consultar Usuário por ID");
            System.out.println("5. Listar Todos os Usuários");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarUsuario();
                    break;
                case 2:
                    atualizarUsuario();
                    break;
                case 3:
                    excluirUsuario();
                    break;
                case 4:
                    consultarUsuario();
                    break;
                case 5:
                    listarUsuarios();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void adicionarUsuario() {
        System.out.println("\n=== Adicionar Usuário ===");
        System.out.print("ID do Usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome do Usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone do Usuário: ");
        String telefone = scanner.nextLine();
        System.out.print("Cidade do Usuário: ");
        String cidade = scanner.nextLine();
        System.out.print("UF do Usuário: ");
        String uf = scanner.nextLine();
        System.out.println("Email do Usuario");
        String email = scanner.nextLine();

        Usuario novoUsuario = new Usuario(id, nome, email, telefone, uf, cidade);
        bibliotecaService.adicionarUsuario(novoUsuario);
        System.out.println("Usuário adicionado com sucesso!");
    }

    private void atualizarUsuario() {
        System.out.println("\n=== Atualizar Usuário ===");
        System.out.print("ID do Usuário a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Usuario usuario = bibliotecaService.consultarUsuarioPorId(id);
        if (usuario != null) {
            System.out.print("Novo Nome (atual: " + usuario.getNome() + "): ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo Telefone (atual: " + usuario.getTelefone() + "): ");
            String novoTelefone = scanner.nextLine();
            System.out.print("Nova Cidade (atual: " + usuario.getCidade() + "): ");
            String novaCidade = scanner.nextLine();
            System.out.print("Novo UF (atual: " + usuario.getUf() + "): ");
            String novoUf = scanner.nextLine();
            System.out.print("Novo Email (atual: " + usuario.getEmail() + "): ");
            String novoEmail = scanner.nextLine();

            usuario.setNome(novoNome);
            usuario.setTelefone(novoTelefone);
            usuario.setCidade(novaCidade);
            usuario.setUf(novoUf);
            usuario.setEmail(novoEmail);

            bibliotecaService.atualizarUsuario(usuario);
            System.out.println("Usuário atualizado com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    private void excluirUsuario() {
        System.out.println("\n=== Excluir Usuário ===");
        System.out.print("ID do Usuário a ser excluído: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Usuario usuario = bibliotecaService.consultarUsuarioPorId(id);
        if (usuario != null) {
            bibliotecaService.excluirUsuario(id);
            System.out.println("Usuário excluído com sucesso!");
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    private void consultarUsuario() {
        System.out.println("\n=== Consultar Usuário por ID ===");
        System.out.print("ID do Usuário: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Usuario usuario = bibliotecaService.consultarUsuarioPorId(id);
        if (usuario != null) {
            System.out.println("Informações do Usuário:");
            System.out.println(usuario);
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    private void listarUsuarios() {
        List<Usuario> usuarios = bibliotecaService.listarUsuarios();
        System.out.println("\n=== Listagem de Usuários ===");
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    private void menuEmprestimos() {
        int opcao;
        do {
            System.out.println("\n=== Menu de Empréstimos ===");
            System.out.println("1. Realizar Empréstimo");
            System.out.println("2. Registrar Devolução");
            System.out.println("3. Consultar Histórico de Empréstimos de um Usuário");
            System.out.println("4. Listar Empréstimos em Andamento");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    realizarEmprestimo();
                    break;
                case 2:
                    registrarDevolucao();
                    break;
                case 3:
                    consultarHistoricoEmprestimosUsuario();
                    break;
                case 4:
                    listarEmprestimosEmAndamento();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void consultarHistoricoEmprestimosUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarHistoricoEmprestimosUsuario'");
    }

    private void realizarEmprestimo() {
        System.out.println("\n=== Realizar Empréstimo ===");
        System.out.print("ID do Empréstimo: ");
        int idEmprestimo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("ID do Livro: ");
        int idLivro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("ID do Usuário: ");
        int idUsuario = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Data de Empréstimo (AAAA-MM-DD): ");
        LocalDate dataEmprestimo = LocalDate.parse(scanner.nextLine());
        System.out.print("Data de Devolução (AAAA-MM-DD): ");
        LocalDate dataDevolucao = LocalDate.parse(scanner.nextLine());

        bibliotecaService.realizarEmprestimo(idEmprestimo, idLivro, idUsuario, dataEmprestimo, dataDevolucao);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    private void registrarDevolucao() {
        System.out.println("\n=== Registrar Devolução ===");
        System.out.print("ID do Empréstimo a ser devolvido: ");
        int idEmprestimo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Data de Devolução (AAAA-MM-DD): ");
        LocalDate dataDevolucao = LocalDate.parse(scanner.nextLine());

        bibliotecaService.registrarDevolucao(idEmprestimo, dataDevolucao);
    }

    private void listarEmprestimosEmAndamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}