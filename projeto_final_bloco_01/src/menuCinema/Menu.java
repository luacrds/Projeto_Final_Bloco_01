package menuCinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        List<Ingresso> filmes = new ArrayList<>();

        filmes.add(new Ingresso("Matrix", 25.0, 50));
        filmes.add(new Ingresso("Vingadores: Ultimato", 30.0, 40));
        filmes.add(new Ingresso("Barbie", 20.0, 60));

        int opcao;

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("               OLDFILMES CINE                        ");
            System.out.println("*****************************************************");
            System.out.println(" 1 - Listar Filmes");
            System.out.println(" 2 - Comprar Ingresso");
            System.out.println(" 3 - Sair");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();

            if (opcao == 3) {
                System.out.println("\nObrigado por visitar o OldFilmes Cine!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nFilmes disponíveis:\n");
                    for (int i = 0; i < filmes.size(); i++) {
                        Ingresso f = filmes.get(i);
                        System.out.printf("%d - %s | R$ %.2f | Ingressos disponíveis: %d\n",
                                i, f.getFilme(), f.getPreco(), f.getQuantidadeDisponivel());
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o índice do filme: ");
                    int indice = leia.nextInt();

                    if (indice < 0 || indice >= filmes.size()) {
                        System.out.println("Filme inválido.");
                        break;
                    }

                    System.out.print("Quantidade de ingressos: ");
                    int qtd = leia.nextInt();

                    Ingresso escolhido = filmes.get(indice);
                    if (escolhido.vender(qtd)) {
                        System.out.println("Compra realizada com sucesso!");
                    } else {
                        System.out.println("Ingressos insuficientes.");
                    }
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Luana Cardoso da Silva");
        System.out.println("OldFilmes Cine - Sua experiência nostálgica de cinema");
        System.out.println("*********************************************************");
    }
}
