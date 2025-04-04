package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.IngressoController;
import controller.ComboController;
import model.Ingresso;
import model.Combo;

public class Menu {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        IngressoController ingressos = new IngressoController();
        ComboController combos = new ComboController();

        int opcao = 0;

        ingressos.cadastrar(new Ingresso(ingressos.gerarNumero(), "Matrix", 25.00, 100));
        ingressos.cadastrar(new Ingresso(ingressos.gerarNumero(), "O Senhor dos Anéis", 30.00, 80));

        combos.cadastrar(new Combo(combos.gerarNumero(), "Combo Pipoca + Refri", 20.00, 50, null));
        combos.cadastrar(new Combo(combos.gerarNumero(), "Combo Chocolate + Refri", 18.00, 40, null));

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("               OLDFILMES CINE                        ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Listar Ingressos disponíveis         ");
            System.out.println("            2 - Listar Combos disponíveis            ");
            System.out.println("            3 - Comprar Ingresso                     ");
            System.out.println("            4 - Comprar Combo                        ");
            System.out.println("            5 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    ingressos.listarTodos();
                    break;
                case 2:
                    combos.listarTodos();
                    break;
                case 3:
                    System.out.print("\nDigite o número do ingresso que deseja comprar: ");
                    int numeroIngresso = leia.nextInt();
                    System.out.print("Digite a quantidade desejada: ");
                    int qtdIngresso = leia.nextInt();
                    ingressos.comprar(numeroIngresso, qtdIngresso);
                    break;
                case 4:
                    System.out.print("\nDigite o número do combo que deseja comprar: ");
                    int numeroCombo = leia.nextInt();
                    System.out.print("Digite a quantidade desejada: ");
                    int qtdCombo = leia.nextInt();
                    combos.comprar(numeroCombo, qtdCombo);
                    break;
                case 5:
                    System.out.println("\nObrigado por visitar o OldFilmes Cine!");
                    sobre();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção inválida!");
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