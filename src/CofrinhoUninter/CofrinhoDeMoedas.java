package CofrinhoUninter;

import java.util.ArrayList;
import java.util.Scanner;

public class CofrinhoDeMoedas {

    static ArrayList<Moeda> cofrinho = new ArrayList<Moeda>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) { //Menu interativo do cofrinho
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular valor convertido");
            System.out.println("5 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda();
                    break;
                case 2:
                    removerMoeda();
                    break;
                case 3:
                    listarMoedas();
                    break;
                case 4:
                    calcularValorConvertido();
                    break;
                case 5:
                    encerrar();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void adicionarMoeda() { //aqui você escolhe qual moeda quer adicionar
        System.out.println("Digite o tipo da moeda (Dólar, Euro ou Real):");
        String tipo = scanner.next();

        System.out.println("Digite o valor da moeda:");
        double valor = scanner.nextDouble();

        Moeda moeda = new Moeda(tipo, valor);
        cofrinho.add(moeda);

        System.out.println("Moeda adicionada com sucesso!");
    }

    public static void removerMoeda() { //aqui você escolhe qual moeda quer remover
        System.out.println("Digite o índice da moeda que deseja remover:");
        listarMoedas();
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < cofrinho.size()) {
            cofrinho.remove(indice);
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void listarMoedas() { //aqui você escolhe qual moeda quer listar
        System.out.println("Lista de moedas:");
        for (int i = 0; i < cofrinho.size(); i++) {
            Moeda moeda = cofrinho.get(i);
            System.out.println(i + " - " + moeda.tipo + " - " + moeda.valor);
        }
    }

    public static void calcularValorConvertido() { // aqui é onde vai ser calculado e convertido em reais
        double valorTotal = 0;

        for (int i = 0; i < cofrinho.size(); i++) {
            Moeda moeda = cofrinho.get(i);

            switch (moeda.tipo) {
                case "Dólar":
                    valorTotal += moeda.valor * 5.12;  // 5.12 valor do dolar
                    break;
                case "Euro":
                    valorTotal += moeda.valor * 6.04;  // 6.04 valor do euro
                    break;
                case "Real":
                    valorTotal += moeda.valor;
                    break;
                default:
                    System.out.println("Tipo de moeda inválido.");
                    return;
            }
        }

        System.out.println("Valor total em Reais: R$" + valorTotal);
    }

    public static void encerrar() {
        System.out.println("Obrigado por utilizar o cofrinho de moedas!");
    }
}


