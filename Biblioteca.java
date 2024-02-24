import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Biblioteca {

    private Map<Integer, Livro> livros;

    public Biblioteca() {
        livros = new HashMap<>();
    }

 
    public void adicionarLivro(Livro livro) {
        livros.put(livro.getId(), livro);
    }

    
    public Livro buscarPorId(int id) {
        return livros.get(id);
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        
        biblioteca.adicionarLivro(new Livro(1, "Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro(2, "O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        biblioteca.adicionarLivro(new Livro(3, "1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro(4, "Cem Anos de Solidão", "Gabriel García Márquez"));
        biblioteca.adicionarLivro(new Livro(5, "Orgulho e Preconceito", "Jane Austen"));
        biblioteca.adicionarLivro(new Livro(6, "A Revolução dos Bichos", "George Orwell"));

        System.out.print("Digite o ID do livro a ser buscado: ");
        int idBusca = scanner.nextInt();
        Livro livro = biblioteca.buscarPorId(idBusca);

        if (livro != null) {
            System.out.println("Livro encontrado: " + livro);
        } else {
            System.out.println("Livro não encontrado.");
        }

        scanner.close();
    }
}

