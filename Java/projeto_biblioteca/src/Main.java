public class Main {
    public static void main(String[] args){
        Livro obj1 = new Livro("Calculo 1");
        // System.out.println(obj1);
        Livro obj2 = new Livro("Calculo 2");
        // System.out.println(obj2);
        Livro obj3 = new Livro("Banco de Dados");
        // System.out.println(obj3);

        Biblioteca bib = new Biblioteca();
        bib.inserir(obj1);
        bib.inserir(obj2);
        bib.inserir(obj3);
        bib.inserir(obj3);
        

        bib.mostrarTodos(); 

        bib.buscarId(2);

        bib.removeLivros(1);
    }
}
