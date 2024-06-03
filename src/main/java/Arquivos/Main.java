package Arquivos;

public class Main {
    public static void main(String[] args) {
        // Criar objetos Livro
        Livro livro1 = new Livro("A Lua Azul", "Jose", 1986);
        Livro livro2 = new Livro("Sol Brilhante", "Antonieta", 1988);
        Livro livro3 = new Livro("Shuri", "Rodrigo", 2005);

        // Criar objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionar livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listar livros da biblioteca
        biblioteca.listarLivros();
    }
}
