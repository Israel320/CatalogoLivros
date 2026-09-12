package exercice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
    static ArrayList<Livro> livros = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int opcao;

        do {
            System.out.println("\n===== CATÁLOGO DE LIVROS =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro");
            System.out.println("4 - Remover livro");
            System.out.println("5 - Atualizar livro");
            System.out.println("0 - Sair");

            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {

                case 1:
                    cadastrar();
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    buscar();
                    break;

                case 4:
                    remover();
                    break;

                case 5:
                    atualizar();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida! Digite uma opção do menu.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // CADASTRAR
    static void cadastrar() {

        System.out.println("\n--- CADASTRAR LIVRO ---");

        String titulo = lerTexto("Digite o título: ");
        String autor = lerTexto("Digite o autor: ");
        int ano = lerAno("Digite o ano de publicação: ");

        Livro livro = new Livro(titulo, autor, ano);

        livros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    // LISTAR
    static void listar() {

        System.out.println("\n--- LIVROS CADASTRADOS ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + " - " + livros.get(i));
        }
    }

    // BUSCAR
    static void buscar() {

        System.out.println("\n--- BUSCAR LIVRO ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        String tituloBusca = lerTexto("Digite o título ou parte do título: ");

        boolean encontrou = false;

        for (Livro livro : livros) {

            if (livro.getTitulo().toLowerCase()
                    .contains(tituloBusca.toLowerCase())) {

                System.out.println(livro);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum livro encontrado.");
        }
    }

    // REMOVER
    static void remover() {

        System.out.println("\n--- REMOVER LIVRO ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        listar();

        int posicao = lerInteiro("Digite o número do livro que deseja remover: ");

        if (posicao >= 1 && posicao <= livros.size()) {

            livros.remove(posicao - 1);

            System.out.println("Livro removido com sucesso!");

        } else {
            System.out.println("Número inválido! Escolha um livro da lista.");
        }
    }

    // ATUALIZAR
    static void atualizar() {

        System.out.println("\n--- ATUALIZAR LIVRO ---");

        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        listar();

        int posicao = lerInteiro("Digite o número do livro que deseja atualizar: ");

        if (posicao < 1 || posicao > livros.size()) {
            System.out.println("Número inválido! Escolha um livro da lista.");
            return;
        }

        Livro livro = livros.get(posicao - 1);

        System.out.println("\nDigite os novos dados:");

        String novoTitulo = lerTexto("Novo título: ");
        String novoAutor = lerTexto("Novo autor: ");
        int novoAno = lerAno("Novo ano de publicação: ");

        livro.setTitulo(novoTitulo);
        livro.setAutor(novoAutor);
        livro.setAnoPublicacao(novoAno);

        System.out.println("Livro atualizado com sucesso!");
    }

    // VALIDA TEXTO
    static String lerTexto(String mensagem) {

        while (true) {

            System.out.print(mensagem);
            String texto = scanner.nextLine().trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            System.out.println("Erro! Esse campo não pode ficar vazio.");
        }
    }

    // VALIDA NÚMERO
    static int lerInteiro(String mensagem) {

        while (true) {

            try {

                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Erro! Digite apenas números.");
            }
        }
    }

    // VALIDA ANO
    static int lerAno(String mensagem) {

        while (true) {

            int ano = lerInteiro(mensagem);

            if (ano >= 1 && ano <= 2026) {
                return ano;
            }

            System.out.println("Ano inválido! Digite um ano entre 1 e 2026.");
        }
    }
}