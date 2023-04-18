package CofrinhoUninter;

import java.util.ArrayList;
import java.util.Scanner;

public class Moeda {
    String tipo;
    double valor;
	private static Scanner scanner;
	private static ArrayList<Moeda> cofrinho;

    public Moeda(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        }
        
        public static void adicionarMoeda() {  // é aqui onde o sistema implementa as moedas dentro do cofrinho, escolhendo qual valor e tipo de moeda vai ser inserido
            System.out.println("Tipos de moedas aceitas: Dólar, Euro, Real");
            System.out.println("Digite o tipo da moeda:");
            scanner = null;
			String tipo = scanner.next();

            System.out.println("Digite o valor da moeda:");
            double valor = scanner.nextDouble();

            Moeda moeda = new Moeda(tipo, valor);
            cofrinho = null;
			cofrinho.add(moeda);

            System.out.println("Moeda adicionada com sucesso!");
        }}